import org.apache.spark.sql.SparkSession

object KafkaDemo {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("Kafka Example")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    val df = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "quickstart")
      .load()

    val messages = df.selectExpr("CAST(value AS STRING) as message")

    val wordCount = messages
      .selectExpr("explode(split(message, ' ')) as word")
      .groupBy("word")
      .count()

    val query = wordCount.writeStream
      .outputMode("complete")
      .format("console")
      .start()

    query.awaitTermination()
  }
}

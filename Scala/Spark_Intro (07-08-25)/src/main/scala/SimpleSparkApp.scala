import org.apache.spark.sql.SparkSession

object simpleSparkApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("simpleSparkApp")
      .master("local[*]") // Use all available CPU cores
      .getOrCreate()

    import spark.implicits._

    val data = Seq(("Hari", 23), ("Prasath", 25), ("Maran", 27))
    val df = data.toDF("Name", "Age")
    df.show()

    spark.stop()
  }
}

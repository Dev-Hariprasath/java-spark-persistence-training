package SparkRDD

import org.apache.spark.sql.SparkSession

object ReadCSV {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Read CSV")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    val csvData = spark.read
      .option("header", true)
      .option("inferSchema", true)
      .csv("src/main/resources/sample.csv")
    println("==== CSV ====")
    csvData.show(false)

    spark.stop()
  }
}
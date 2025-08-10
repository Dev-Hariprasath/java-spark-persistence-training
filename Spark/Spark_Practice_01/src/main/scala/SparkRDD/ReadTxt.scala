package SparkRDD

import org.apache.spark.sql.SparkSession

object ReadTxt {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Read Text")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    val readTxt = spark.read
      .textFile("src/main/resources/sample.txt")

    println("=== Text File ===")
    println(readTxt.show(false))

    spark.stop()
  }
}

package SafeFileReader

import org.apache.spark.sql.SparkSession

object FileProcessing {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("File Processing")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    val read = new ReadOperation()
    val filePath: String = "src/main/resources/sample.csv"

    read.readCSV(filePath, spark)
  }
}

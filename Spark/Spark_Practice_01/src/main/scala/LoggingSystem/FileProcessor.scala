package LoggingSystem

import org.apache.spark.sql.{DataFrame, SparkSession}

class FileProcessor(val filePath: String, val spark: SparkSession) extends ConsoleLogger {
  def Process(): DataFrame = {
    log(s"Reading The File from $filePath")
    val df = spark.read
      .option("header", true)
      .option("inferSchema", true)
      .csv(filePath)

    log(s"The file has ${df.count()} Rows and ${df.columns.length} columns")
    df
  }
}
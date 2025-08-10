package SafeFileReader

import org.apache.spark.sql.SparkSession

trait FileOperations {
  def readCSV(filePath: String, spark: SparkSession): Unit
}
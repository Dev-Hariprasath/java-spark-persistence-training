package SafeFileReader

import org.apache.spark.sql.SparkSession
import scala.util.{Failure, Success, Try}

class ReadOperation extends FileOperations {
  override def readCSV(filePath: String, spark: SparkSession): Unit = {
    println("=== CSV Data ===")
    val data = Try ({
      spark.read
        .option("header", true)
        .option("interSchema", true)
        .csv(filePath).show(false)
    })
    data match {
      case Success(value) => println(s"The Fetched From the file Successfully in path $filePath")
      case Failure(exception) => println(s"The Error will occur ${exception.getMessage}")
    }
  }
}


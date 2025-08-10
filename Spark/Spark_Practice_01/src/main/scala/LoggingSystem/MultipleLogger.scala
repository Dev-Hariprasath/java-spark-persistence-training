package LoggingSystem

import org.apache.spark.sql.SparkSession


/*
Logging System with Multiple Behaviors Create a trait Logger with a log method.
Create mixins TimestampLogger and UpperCaseLogger that modify the log output.
Mix them into a FileProcessor class in different combinations
 to see the effect.
*/

object MultipleLogger extends App{

  val filePath: String = "src/main/resources/sample.csv"

  val spark = SparkSession.builder()
    .appName("LoggingSystem")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

    println("---- Normal Logger ----")
    val normalProcessor = new FileProcessor(filePath, spark)
    normalProcessor.Process().show()

    println("\n---- Timestamp Logger ----")
    val timestampProcessor = new FileProcessor(filePath, spark) with TimeStampLogger
    timestampProcessor.Process().show()

    println("\n---- UpperCase Logger ----")
    val upperProcessor = new FileProcessor(filePath, spark) with UpperCaseLogger
    upperProcessor.Process().show()

    println("\n---- UpperCase + Timestamp Logger ----")
    val comboProcessor = new FileProcessor(filePath, spark) with TimeStampLogger with UpperCaseLogger
    comboProcessor.Process().show()

    println("\n---- Timestamp + UpperCase Logger ----")
    val comboProcessor2 = new FileProcessor(filePath, spark) with UpperCaseLogger with TimeStampLogger {}
    comboProcessor2.Process().show()

}


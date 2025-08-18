package com.AdvanceFeatures

import org.apache.spark.sql.SparkSession

object SatefulWordCount {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("SatefulWordCount")
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._

    // Reading stream from socket
    val df = spark.readStream
      .format("socket")
      .option("host", "localhost")
      .option("port", 9999)
      .load()

    spark.sparkContext.setLogLevel("ERROR")

    val words = df.as[String].flatMap(_.split(" "))

    val wordsCount = words.groupBy("value").count()


    val query = wordsCount.writeStream
      .outputMode("complete")
      .format("console")
      .start()


    query.awaitTermination()


  }
}
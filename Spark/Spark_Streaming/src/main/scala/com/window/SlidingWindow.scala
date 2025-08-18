package com.window

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object SlidingWindowExample {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder
      .appName("TumblingWindowExample")
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._

    // Reading stream from socket
    val df = spark.readStream
      .format("socket")
      .option("host", "localhost")
      .option("port", 9999)
      .load()
      .as[String]
      .map(value => {
        val parts = value.split(",")
        // Assume format: <timestamp>,<value>
        (java.sql.Timestamp.valueOf(parts(0)), parts(1).toInt)
      }).toDF("timestamp", "value")

    spark.sparkContext.setLogLevel("ERROR")
    val slidingAggDF = df
      .groupBy(window($"timestamp", "10 minutes", "5 minutes")) // window length, slide length
      .count()

    slidingAggDF.writeStream
      .outputMode("complete")
      .format("console")
      .start()
      .awaitTermination()

  }
}

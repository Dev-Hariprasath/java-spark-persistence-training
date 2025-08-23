package com.advance

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.window

object TemporalOperations {
  def main(args: Array[String]) : Unit = {

    val spark = SparkSession.builder()
      .appName("TemporalOperations")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    import spark.implicits._

    val sensorStream = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "sensor")
      .load()
      .selectExpr("CAST(value AS STRING)", "timestamp")

    val windowCounts = sensorStream
      .groupBy(window($"timestamp", "10 minutes", "5 minutes"))
      .count()

    windowCounts.writeStream
      .format("console")
      .outputMode("update")
      .start()
      .awaitTermination()
  }
}

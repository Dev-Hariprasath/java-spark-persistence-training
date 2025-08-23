package com.advance

import org.apache.spark.sql.SparkSession

object paternDetection {
  def main(args: Array[String]) : Unit = {

    val spark = SparkSession.builder()
      .appName("PatternDetection")
      .master("local[*]")
      .getOrCreate()


    spark.sparkContext.setLogLevel("ERROR")

    import spark.implicits._

    val events = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "events")
      .load()
      .selectExpr("CAST(value AS STRING) as event")

    val suspicious = events.groupBy($"event")
      .count()
      .filter($"event" === "FAILED" && $"count" > 3)

    suspicious.writeStream
      .format("console")
      .outputMode("complete")
      .start()
      .awaitTermination()

  }
}
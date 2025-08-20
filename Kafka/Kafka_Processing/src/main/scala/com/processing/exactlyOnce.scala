package com.processing

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, current_timestamp, upper}

object ExactlyOnceExample {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("Exactly only once Example")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    val inputDF = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "quickstart")
      .option("startingOffsets", "earliest")
      .load()

    val parseDF = inputDF
      .selectExpr("CAST(key AS STRING)", "CAST(value AS STRING)")
      .withColumn("processed_at", current_timestamp())

    val transformDF = parseDF.withColumn("value", upper(col("value")))

    val query = transformDF
      .selectExpr("CAST(key AS STRING)", "CAST(value AS STRING)")
      .writeStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("topic", "quickstart")
      .option("checkpointLocation", "file:///tmp/kafka_exactly_once_checkpoint")
      .outputMode("append")
      .start()


    query.awaitTermination()
  }
}
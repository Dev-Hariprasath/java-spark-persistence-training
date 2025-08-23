package com.realtimeAnalytics

import org.apache.spark.ml.PipelineModel
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.from_json
import org.apache.spark.sql.types.{DoubleType, StringType, StructType, TimestampType}

object MLStreamingJob {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("MLStreamingJob")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    import spark.implicits._

    // Define schema for Kafka value JSON
    val schema = new StructType()
      .add("userId", StringType)
      .add("eventTime", TimestampType)
      .add("f1", DoubleType)
      .add("f2", DoubleType)
      .add("f3", DoubleType)

    // Read from Kafka
    val kafkaStream = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "mlevents")
      .option("startingOffsets", "latest")  // FIXED typo: it was 'straightOffsets'
      .load()

    // Parse JSON messages
    val parsed = kafkaStream.selectExpr("CAST(value AS STRING) as json")
      .select(from_json($"json", schema).as("data"))
      .select("data.*")

    // Load pre-trained ML pipeline model
    val model = PipelineModel.load("models/lr-pipeline")

    // Make predictions
    val prediction = model.transform(parsed)
      .select($"userId", $"eventTime", $"features", $"prediction", $"probability")

    // Write prediction to console sink (streaming output)
    val query = prediction.writeStream
      .format("console")
      .outputMode("append")
      .option("truncate", "false")
      .option("checkpointLocation", "chk/mlstream")  // Required for streaming
      .start()

    query.awaitTermination()  // START STREAM
  }
}

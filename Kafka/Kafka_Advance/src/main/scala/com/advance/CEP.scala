package com.advance

import org.apache.spark.sql.SparkSession

object ComplexEventProcessing {
  def main(args: Array[String]) : Unit = {

    val spark = SparkSession.builder()
      .appName("Complex Event Processing")
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._

    spark.sparkContext.setLogLevel("WARN")

    val transactions = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "transactions")
      .load()
      .selectExpr("CAST(value AS STRING)")
      .as[String]

    val parsed = transactions.map {
      tx => val parts = tx.split(", ")
        (parts(0), parts(1), parts(2))
    }.toDF("UserId", "amount", "timestamp")

    val alerts = parsed.filter($"amount" > 5000)

    alerts.writeStream
      .format("console")
      .outputMode("append")
      .start()
      .awaitTermination()
  }
}
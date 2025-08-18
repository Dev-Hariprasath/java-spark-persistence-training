package com.AdvanceFeatures

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.expr

object StreamToStreamJoinExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("TumblingWindowExample")
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._

    // Reading stream from socket
    val stream01 = spark.readStream
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
      .alias("stream1") // alias here

    val stream02 = spark.readStream
      .format("socket")
      .option("host", "localhost")
      .option("port", 8888)
      .load()
      .as[String]
      .map(value => {
        val parts = value.split(",")
        // Assume format: <timestamp>,<value>
        (java.sql.Timestamp.valueOf(parts(0)), parts(1).toInt)
      }).toDF("timestamp", "value")
      .alias("stream2") // alias here

    spark.sparkContext.setLogLevel("ERROR")

    val joined = stream01.join(
      stream02,
      expr("""
        stream1.value = stream2.value AND
        stream1.timestamp BETWEEN stream2.timestamp - INTERVAL 5 MINUTES AND stream2.timestamp + INTERVAL 5 MINUTES
      """)
    )

    val query = joined.writeStream
      .outputMode("append") // "complete" is not allowed without aggregation
      .format("console")
      .start()

    query.awaitTermination()
  }
}

package com.window

package com.pack

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object SessionWindowExample {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder
      .appName("SessionWindowExample")
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

    // Session window aggregation with a 30-minute gap
    val sessionAggDF = df
      .groupBy(session_window($"timestamp", "30 minutes"))
      .count()

    sessionAggDF.writeStream
      .outputMode("complete")
      .format("console")
      .start()
      .awaitTermination()
  }
}

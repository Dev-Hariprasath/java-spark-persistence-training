package com.advance

import org.apache.spark.sql.SparkSession

object StreamEnrichment {
  def main(args: Array[String]) : Unit = {

    val spark = SparkSession.builder()
      .appName("StreamEnrichment")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    import spark.implicits._

    val clickStream = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "clicks")
      .load()
      .selectExpr("CAST(value AS STRING) as userId")


    val userProfiles = spark.read
      .format("parquet")
      .load("hdfs://localhost:9000/data/user_profiles")

    val enriched = clickStream.join(userProfiles, Seq("userId"))

    enriched.writeStream
      .format("console")
      .outputMode("append")
      .start()
      .awaitTermination()


  }
}

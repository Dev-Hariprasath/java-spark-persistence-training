package com.advance

import org.apache.spark.sql.SparkSession

object Inputs {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("Prepare User Profiles")
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._

    val profiles = Seq(
      ("U101", "Alice", 29, "USA"),
      ("U102", "Bob", 35, "UK"),
      ("U103", "Chen", 40, "China"),
      ("U104", "Diana", 28, "India")
    ).toDF("userId", "name", "age", "country")

    profiles.write.mode("overwrite").parquet("hdfs://localhost:9000/data/user_profiles")


    spark.stop()
  }
}

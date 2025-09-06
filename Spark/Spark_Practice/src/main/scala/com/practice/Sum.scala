package com.practice

import org.apache.spark.sql.SparkSession

object Sum extends App {
  val spark = SparkSession.builder()
    .appName("Count")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  val rdd = spark.sparkContext.parallelize(Seq(1, 2, 3, 4, 5, 6))

  import spark.implicits._

  val sum = rdd.sum()

  Seq((sum)).toDF("Sum").show()

}

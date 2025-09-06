package com.practice

import org.apache.spark.sql.SparkSession

object Average extends App {

  val spark = SparkSession.builder()
    .appName("Average of Numbers")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  val rdd = spark.sparkContext.parallelize(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

  import spark.implicits._

  val avg = rdd.sum() / rdd.count()

  Seq((avg)).toDF("Average").show()
}
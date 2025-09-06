package com.practice

import org.apache.spark.sql.SparkSession

object EvenNum extends App{
  val spark = SparkSession.builder()
    .appName("Even Num")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  val rdd = spark.sparkContext.parallelize(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9))

  import spark.implicits._


  val df = rdd.filter(x => x %  2 == 0)
    .toDF("Even Number")

  df.show()

}

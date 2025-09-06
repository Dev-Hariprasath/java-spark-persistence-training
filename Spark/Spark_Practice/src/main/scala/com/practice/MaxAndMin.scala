package com.practice

import org.apache.spark.sql.SparkSession

object MaxAndMin extends App {
  val spark = SparkSession.builder()
    .appName("Min And Max")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  val sc = spark.sparkContext

  val rdd = sc.parallelize(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9))

  import spark.implicits._

  val min = rdd.min()
  val max = rdd.max()

  val df = Seq((min, max)).toDF("Min", "Max")

  df.show()

}

package com.practice

import org.apache.spark.sql.SparkSession

object count extends App {
  val spark = SparkSession.builder()
    .appName("Count")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  val rdd = spark.sparkContext.parallelize(Seq(
    ("Hari",13,"IT"),
    ("Prasath", 18,"IT"),
    ("Jhon", 21,"IT"),
    ("Ravi", 22,"IT"))
  )

  import spark.implicits._

  val df = rdd.toDF("Name", "Age", "Office")

  df.show()

}

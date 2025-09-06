package com.practice

import org.apache.spark.sql.{SQLContext, SparkSession}

object JoinRDD extends App {
  val spark = SparkSession.builder()
    .appName("Join RDD's")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  import spark.implicits._

  val rdd1 = spark.sparkContext.parallelize(Seq(("Hari", 101),
    ("Ram", 102),
    ("Ravi", 103)
  ))

  val rdd2 = spark.sparkContext.parallelize(Seq((80, 101),
    (72, 102),
    (84, 103)
  ))

  val df1 = rdd1.toDF("Name", "StdId")
  val df2 = rdd2.toDF("Mark", "StdId")

  val df = df1.join(df2, "StdId").filter("Mark>72")

  df.show()



}

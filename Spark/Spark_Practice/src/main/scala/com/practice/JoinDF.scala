package com.practice

import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types.{IntegerType,StringType, StructField, StructType}

object JoinDF extends App {
  val spark = SparkSession.builder()
    .appName("Join DF")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  val rdd1 = spark.sparkContext.parallelize(Seq(
    Row("Hari", 23, "IT"),
    Row("Ram", 27, "Dev"),
    Row("Maran", 34, "HR"),
    Row("Gokul", 19, "IT"),
    Row("Prasath", 28, "HR")
  ))

  val schema = StructType(Array(
    StructField("Name", StringType, true),
    StructField("Age", IntegerType, true),
    StructField("Department", StringType, true)
  ))

  val df = spark.createDataFrame(rdd1, StructType(schema))
  df.createOrReplaceTempView("employees")

  spark.sqlContext.sql("select Department, COUNT(*) as Employee_count from employees GROUP BY Department").show()
}

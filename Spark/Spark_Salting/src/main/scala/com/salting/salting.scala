package com.salting

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object saltingExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Salting Example")
      .getOrCreate()

    val cityData = Seq.fill(1000)("Aurangabad") ++ Seq.fill(100)("Mumbai") ++ Seq.fill(10)("Chennai") ++ Seq("Hyderabad")

    import spark.implicits._

    val cityDF = cityData.toDF("city")
    val saltedCityDF = ((cityDF
      .withColumn("salt_key", expr("explode(array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19))"))))
      .withColumn("city_salted", concat(col("city"), lit("_"), col("salt_key")))
  }
}
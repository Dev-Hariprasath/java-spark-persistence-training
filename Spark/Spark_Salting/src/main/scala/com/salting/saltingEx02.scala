package com.salting

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object slatingExample02 {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Salting Example 02")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    import spark.implicits._

    val data = Seq(
      ("India", 100), ("India", 200), ("India", 300),
      ("USA", 50), ("UK", 70)
    )

    val df = data.toDF("Country", "Sales")

    val salted = df.withColumn("salt", (rand() * 10).cast("int"))

    val saltedAgg = salted.groupBy("Country", "salt").sum("sales")
    saltedAgg.show()

    val finalAgg = saltedAgg.groupBy("Country").sum("sum(sales)")
    finalAgg.show()


    Thread.sleep(100000000000L)
  }
}
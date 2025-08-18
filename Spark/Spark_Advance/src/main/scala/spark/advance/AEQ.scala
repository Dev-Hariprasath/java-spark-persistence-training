package spark.advance

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object AEQ extends App {

  val spark = SparkSession.builder()
    .appName("AEQ")
    .master("local[*]")
    .config("spark.sql.adaptive.enabled", "true")
    .getOrCreate()

  val df = spark.read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("users.csv")

  df.groupBy("user_id")
    .agg(sum("amount").alias("sum_id"))
    .show()

  spark.stop()

}

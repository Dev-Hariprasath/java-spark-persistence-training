package com.practice

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object WordsCount extends App {
  val spark = SparkSession.builder()
    .appName("Words Count on text File")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  // Read static text file (batch mode)
  val df = spark.read.text("src/main/resources/data.txt")

  // Split each line into words
  val words = df.select(explode(split(col("value"), "\\s+")).as("word"))

  // Count words
  val wordsCount = words.groupBy("word").count()

  // Show result in console (batch mode)
  wordsCount.show(false)
}

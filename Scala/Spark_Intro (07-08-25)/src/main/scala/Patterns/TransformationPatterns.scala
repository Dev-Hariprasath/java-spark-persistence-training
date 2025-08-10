package Patterns

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

object TransformationPatterns {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("TransformationPatterns")
      .master("local[*]")
      .getOrCreate()

    val sc = spark.sparkContext

    val rdd = sc.parallelize(1 to 5)

    println("=== Original RDD ===")
    rdd.collect().foreach(println)

 /*   println("\n=== Using Map ===")
    usingMap(rdd)

    println("\n=== Using Filter ===")
    usingFilter(rdd)

    println("\n=== Using Reduce ===")
    usingReduce(rdd)

    println("\n=== Using FlatMap ===")
    usingFlatMap(rdd) */

    spark.stop()
  }

  def usingMap(rdd: RDD[Int]): Unit = {
    val squared = rdd.map(x => x * x)
    squared.collect().foreach(println)
  }

  def usingFilter(rdd: RDD[Int]): Unit = {
    val filtered = rdd.filter(x => x % 2 == 0)
    filtered.collect().foreach(println)
  }

  def usingReduce(rdd: RDD[Int]): Unit = {
    val result = rdd.reduce((a, b) => a + b)
    println(result)
  }

  def usingFlatMap(rdd: RDD[Int]): Unit = {
    val expanded = rdd.flatMap(x => List(x, x + 10))
    expanded.collect().foreach(println)
  }
}

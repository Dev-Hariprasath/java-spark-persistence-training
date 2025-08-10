package SparkRDD

import org.apache.spark.sql.SparkSession

object Actions {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Actions")
      .master("local[*]")
      .getOrCreate()

    val sc = spark.sparkContext

    //Create RDD from collections
    val data = sc.parallelize(Seq(1,2,3,4,5,6))

    //Performing Actions

    println("Collect " +data.collect().mkString(" -> "))
    println("Map for Square:" +data.map((x:Int) => x * x).collect().mkString(", "))
    println("Filter Even :" +data.filter( (x: Int) => x % 2 == 0).collect().mkString(" => "))
    println("Find the first element:" +data.first())
  }
}

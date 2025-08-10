package SparkRDD

import org.apache.spark.sql.SparkSession

object CreateRDD {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Create RDD")
      .master("local[*]")
      .getOrCreate()

    val s = spark.sparkContext

    //Create context by Parallelize
    println("==== Create RDD from the Collection =====")
    val data = s.parallelize(Seq(1,2,3,4,5))

    //Create RDD by reading files
    println("=== Create RDD By Reading Data From File txt =====")
    val fileRdd = s.textFile("src/main/resources/sample.txt")

    //Create RDD by Transformations
    println("==== Create RDD By Transformations ====")
    val squaredRdd = data.map( _ * 2)
  }
}

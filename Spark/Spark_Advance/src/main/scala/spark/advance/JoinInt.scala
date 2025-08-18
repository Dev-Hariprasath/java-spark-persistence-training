package spark.advance

import org.apache.spark.sql.SparkSession

object BroadcastJoin extends App {

  val spark = SparkSession.builder()
    .appName("Broadcast Join Example")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  import spark.implicits._

  val smallDFExample = Seq (
    (1, "Alice"),
    (2, "Bob"),
    (3, "Charlie")
  ).toDF("id", "name")

  smallDFExample.write.mode("overwrite").json("small.json")

  val largeDFExample = Seq(
    (1, "Electronics"),
    (2, "Clothing"),
    (3, "Books"),
    (4, "Toys")
  ).toDF("id", "category")

  largeDFExample.write.mode("overwrite").parquet("large.parquet")

  val smallDF = spark.read.json("small.json")
  val largeDF = spark.read.parquet("large.parquet")

  val joinDF = smallDF
    .hint("broadcast")
    .join(largeDF, "id")

  joinDF.show()

  spark.stop()
}

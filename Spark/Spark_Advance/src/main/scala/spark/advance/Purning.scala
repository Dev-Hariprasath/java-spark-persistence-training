import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object ElectronicsSalesPartition extends App {

  val spark = SparkSession.builder()
    .appName("Electronics Sales Partition")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  // 1. Create example Parquet files (for demo)
  import spark.implicits._

  val salesDF = Seq(
    (1, 101, "2025-08-10", 250.0),
    (2, 102, "2025-08-10", 1200.0),
    (3, 103, "2025-08-11", 150.0),
    (4, 101, "2025-08-11", 300.0)
  ).toDF("sale_id", "product_id", "date", "amount")

  val productsDF = Seq(
    (101, "Smartphone", "electronics"),
    (102, "Laptop", "electronics"),
    (103, "Shoes", "fashion")
  ).toDF("id", "name", "category")

  salesDF.write.mode("overwrite").parquet("sales.parquet")
  productsDF.write.mode("overwrite").parquet("products.parquet")

  // 2. Read Parquet files
  val sales = spark.read.parquet("sales.parquet")
  val products = spark.read.parquet("products.parquet")

  // 3. Join, filter, select, and write partitioned
  sales
    .join(products, sales("product_id") === products("id"))
    .where(products("category") === "electronics")
    .select(sales("*"))
    .write
    .mode("overwrite")
    .partitionBy("date")
    .parquet("output")

  println(" Electronics sales have been saved to 'output' folder, partitioned by date.")

  spark.stop()
}
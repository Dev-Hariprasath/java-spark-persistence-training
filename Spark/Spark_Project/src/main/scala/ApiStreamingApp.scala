import org.apache.spark.sql.{SparkSession, DataFrame}
import org.apache.spark.sql.functions._
import scalaj.http._

object ApiStreamingApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("API Streaming Application")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    import spark.implicits._

    def fetch(url: String): String = Http(url).timeout(5000, 10000).asString.body

    def jsonToDf(json: String): DataFrame = {
      val norm = if (json.trim.startsWith("[")) json else s"[$json]"
      val rdd = spark.sparkContext.parallelize(Seq(norm))
      spark.read.json(rdd)
    }

    // === Books API (40 books) ===
    val booksJson = fetch("https://www.googleapis.com/books/v1/volumes?q=python&maxResults=40")
    val booksDf = jsonToDf(booksJson)
      .select(explode($"items").as("item"))
      .select(
        $"item.volumeInfo.title".as("title"),
        $"item.volumeInfo.authors".getItem(0).as("author"),
        $"item.volumeInfo.publisher".as("publisher"),
        $"item.volumeInfo.publishedDate".as("publishedDate")
      )
      .withColumn("batch_id", lit(1))

    println("=== Books (40 rows) ===")
    booksDf.show(20)

    // === Employees API (50 random users) ===
    val usersJson = fetch("https://randomuser.me/api/?results=50")
    val usersDf = jsonToDf(usersJson)
      .select(explode($"results").as("res"))
      .select(
        $"res.name.first".as("first"),
        $"res.name.last".as("last"),
        $"res.location.country".as("country"),
        $"res.email".as("email")
      )
      .withColumn("batch_id", lit(1))

    println("=== Users (50 rows) ===")
    usersDf.show(20)

    // === Join (synthetic, by batch_id) ===
    val joined = usersDf.join(booksDf, "batch_id")


    // === Analysis Example ===
    val analysis = joined.groupBy("country")
      .agg(count("title").as("books_assigned"))
      .orderBy(desc("books_assigned"))

    println("=== Analysis: Books Assigned per Country ===")
    analysis.show(20)


    Thread.sleep(100000000L)
    spark.stop()
  }
}

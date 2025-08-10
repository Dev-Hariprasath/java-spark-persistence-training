package ParallelDataFetecher
import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.Source


object DataFetcher {
    def main(args: Array[String]): Unit = {

      val startTime = System.currentTimeMillis()

      // First API call
      val api1: Future[String] = Future {
        println("Fetching API 1...")
        val url1 = "https://jsonplaceholder.typicode.com/posts/1"
        Source.fromURL(url1).mkString
      }

      // Second API call
      val api2: Future[String] = Future {
        println("Fetching API 2...")
        val url2 = "https://jsonplaceholder.typicode.com/users/1"
        Source.fromURL(url2).mkString
      }

      // Combine results
      val combined: Future[String] = for {
        result1 <- api1
        result2 <- api2
      } yield {
        val totalTime = System.currentTimeMillis() - startTime
        "API1 Response:\n" + result1 + "\n\n" +
          "API2 Response:\n" + result2 + "\n\n" +
          "Total Time: " + totalTime + " ms"
      }


      // Print results
      val finalOutput = Await.result(combined, 10.seconds)
      println(finalOutput)
    }
}

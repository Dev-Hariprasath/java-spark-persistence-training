package concurrency

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Success}

object concurrencyFuture extends App {

  val f = Future {
    Thread.sleep(1000)
    42
  }

  f.onComplete {
    case Failure(exception) => println(s"Error Occurred: ${exception.getMessage}")
    case Success(value)     => println(s"Got the result : $value")
  }

  Await.result(f, 2.seconds)
}

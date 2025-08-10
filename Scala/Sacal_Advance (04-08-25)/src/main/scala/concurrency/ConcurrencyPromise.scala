package concurrency

import scala.concurrent.Promise

object MainPromise {
  def main(args: Array[String]): Unit = {
    val promise = Promise[Int]()
    val future = promise.future
  }

  // Complete the promise in a Future
}
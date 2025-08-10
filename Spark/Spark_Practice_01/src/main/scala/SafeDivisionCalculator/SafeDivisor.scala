package SafeDivisionCalculator

import scala.util.{Failure, Success, Try}

object SafeDivisor {

  def divisor(a: Int, b: Int): Try[Int] = {
    if(b == 0) throw new Exception("The Denominator will not be Zero")
    val result = Try(a / b)
    return result
  }
  def main(args: Array[String]): Unit = {
    println("Enter the value of A :")
    val a = scala.io.StdIn.readInt()
    println("Enter the value of B :")
    val b = scala.io.StdIn.readInt()

    divisor(a, b) match {
      case Success(value) => println(s"The result is $value")
      case Failure(exception) => println(s"Error Occurred ${exception.getMessage}")
    }

  }
}

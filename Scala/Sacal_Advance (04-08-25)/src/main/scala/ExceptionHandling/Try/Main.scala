package ExceptionHandling.Try

import scala.util.{Success, Failure}
object Main extends App{
  val p = new ParseInt
  p.parseInt("234") match {
    case Success(value) => println(s"The Parsed Value is $value")
    case Failure(exception) => print(s"Failed : ${exception.getMessage}")
  }
}

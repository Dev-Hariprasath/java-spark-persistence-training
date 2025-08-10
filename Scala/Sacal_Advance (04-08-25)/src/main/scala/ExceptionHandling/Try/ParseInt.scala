package ExceptionHandling.Try

import scala.util.Try

class ParseInt {
  def parseInt(a: String): Try[Int] = {
    Try(a.toInt) // Converting to Int
  }
}

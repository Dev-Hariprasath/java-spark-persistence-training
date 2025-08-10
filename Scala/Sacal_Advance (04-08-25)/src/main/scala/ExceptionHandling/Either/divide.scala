package ExceptionHandling.Either

class divide {
  def divide(a: Int, b: Int): Either[String, Int] = {
    if (b == 0) Left("Cannot divide by Zero")
    else Right(a/b)
  }
}

package pack.types

object uniontype extends App {

  def pareseNumber(input: String): Int | String = {
    try input.toInt
    catch case _: NumberFormatException => s"Not a Number $input"
  }

  val result1 = pareseNumber("123")
  println(result1)
  val result2 = pareseNumber("abc")
  println(result2)

}

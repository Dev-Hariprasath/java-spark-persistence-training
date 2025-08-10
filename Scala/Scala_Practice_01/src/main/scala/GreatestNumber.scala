class GreatestNumber {
  def greatestNumber(a: Int, b: Int, c: Int): Int = {
    val greatestNumber = if(a > b & a > c) a; if(b > a & b > c) b else c
  }
}

object GreatestNumber extends App {
  val v = new GreatestNumber()
  println("The Greatest Number is " +v.greatestNumber(2,3,4))
}

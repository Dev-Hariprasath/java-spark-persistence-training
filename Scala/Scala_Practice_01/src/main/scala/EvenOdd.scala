class EvenOdd(num: Int) {
  println(s"The Input is $num")

  def checkEvenOdd(): String = {
    if (num % 2 == 0) "Even number" else "Odd Number"
  }
}

object EvenOdd extends App {
  val c = new EvenOdd(20)
  println(s"The Number is " +c.checkEvenOdd())
}

class ArithmeticOperations(a: Int, b: Int) {
  println(s"The value of a is $a and b is $b")
  def add(): Int = a + b
  def sub(): Int = a - b
  def div(): Int = a / b
  def mul(): Int = a * b
}

object ArithmeticOperations extends App{
  val ope = new ArithmeticOperations(10, 5)
  println("For Addition : " +ope.add())
  println("For Subtraction : " +ope.sub())
  println("For Multiplication : " +ope.mul())
  println("For Division : " +ope.div())
}
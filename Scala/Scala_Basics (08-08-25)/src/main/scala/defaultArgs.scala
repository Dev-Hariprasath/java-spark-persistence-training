class defaultArgs {
  def sum(a: Int, b: Int = 9): Unit = {
    println(a + b)
  }
}

object defaultArgs extends App{
  val d = new defaultArgs()
  println("Without default value")
  d.sum(2, 4)
  println("With default value")
  new defaultArgs().sum(3)
}
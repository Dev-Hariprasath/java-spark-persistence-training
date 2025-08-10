class anonymousClass {
  def print(): Unit = {
    println("Hello")
  }
}

object anonymousClass extends App {
  val a = new anonymousClass()
  a.print()
}

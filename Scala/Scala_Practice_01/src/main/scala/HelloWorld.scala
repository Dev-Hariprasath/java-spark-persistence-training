class HelloWorld {
  def greet(): Unit = {
    println("Hello world")
  }
}

object HelloWorld extends App {
  val v = new HelloWorld()
  v.greet()
}
trait greet {
  def greet(name: String): Unit
}

class welcome extends greet{
  override def greet(name: String): Unit = {
    println(s"The name is $name")
  }
}


object greeting extends App {
  val g = new welcome
  g.greet("Hari")
}

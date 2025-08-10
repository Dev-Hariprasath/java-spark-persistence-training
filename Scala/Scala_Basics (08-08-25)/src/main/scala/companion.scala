class companion {
  def greet(name: String): Unit = {
    println(name)
  }
}

object companionObject extends App{
  def main(): Unit = {
    new companion().greet("Hari")
  }
}

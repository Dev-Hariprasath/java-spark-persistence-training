object innerClass extends App{
  def outer(): Unit = {
    println("In Outer")
    def inner(): Unit = {
      println("In inner")
    }
    inner()
  }

  outer()
}

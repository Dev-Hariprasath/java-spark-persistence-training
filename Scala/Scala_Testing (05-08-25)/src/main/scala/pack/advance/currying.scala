package pack.advance

//Partial Apllications

object partial extends App{
  def add(x: Int, y:Int): Int = x + y

  val add_5 = add(5, _:Int) // Partially applied
  println(add_5(3)) // Output
}

object both extends App{
  def greet(greeting: String)(name: String): String = s"$greeting, $name"

  val sayHello = greet("Hello") // Partially applied
  println(sayHello("Hari"))
}
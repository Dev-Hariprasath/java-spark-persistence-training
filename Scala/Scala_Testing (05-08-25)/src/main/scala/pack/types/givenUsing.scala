package pack.types

def printValue(using name: String): Unit ={
  println(s"Hello, $name")
}

@main def greet(): Unit ={
  given name: String = "Hari"
  printValue
}
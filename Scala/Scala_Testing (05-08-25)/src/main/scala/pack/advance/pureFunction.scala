package pack.advance


//Immutability and pure function
object pureFunction extends App {
  val num = List(1, 2, 3)
  val doubled = num.map(_ * 2)
  print(doubled)
}

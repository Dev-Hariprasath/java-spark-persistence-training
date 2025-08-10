package pack.advance

object anonymousFunction extends App{
  //Anonymous --- lambda Expression
  def square = (x: Int) => x * x
  println(square(5))

  //Without using variable also can apply to anonymous function
  val result = List(1,2,3).map((x: Int) => x * x)
  println(result)
}

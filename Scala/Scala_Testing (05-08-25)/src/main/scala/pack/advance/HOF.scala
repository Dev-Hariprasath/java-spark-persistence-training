package pack.advance

/*
HOF
Takes one or more function as parameter
return a function as result
example for functional programming (highlight is our function)

operate is a function
Takes a function f as its first parameter (f: Int => Int)
Takes a integer as Second Parameter 
*/

object HOF extends App {
  def operate(f: Int => Int, x: Int): Int = f(x)
  val result = operate(x => x * x, 5)
  print(result)
}


//def applyTwice(f: Int => Int)

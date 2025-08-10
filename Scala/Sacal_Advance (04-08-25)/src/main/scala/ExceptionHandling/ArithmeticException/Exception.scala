package ExceptionHandling.ArithmeticException

class Exception {
  def divide(a: Int, b:Int): Unit = {
    try{
      val x = a / b
      println("The a divided b is " +x)
    } catch {
      case e : ArithmeticException => {
        println("Cannot divide by Zero")
      }
    }
  }
}

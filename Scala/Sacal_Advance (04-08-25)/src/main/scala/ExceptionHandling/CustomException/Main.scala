package ExceptionHandling.CustomException

object Main extends App{
  val c = new MyCustomException("")
  
  try{
    c.validate(20)
  }catch {
    case e : MyCustomException => println(s"The Exception is : ${e.getMessage}")
  }
}

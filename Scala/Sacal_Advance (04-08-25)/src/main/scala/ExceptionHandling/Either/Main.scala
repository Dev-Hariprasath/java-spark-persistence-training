package ExceptionHandling.Either

object Main extends App{
  val d = new divide
  d.divide(12, 6) match {
    case Right(res) => println(s"The Result : $res")
    case Left(ex) => println(s"The Failed : $ex")
  }
}

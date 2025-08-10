package TraitExamples

trait Logger {
  def log(message:String): Unit = {
    println(s"LOG:$message")
  }
}

class Service extends Logger{
  def serve(): Unit ={
    log("Service is Running....")
  }
}


object TraitApp extends App{
  val str = new Service()
  str.serve()
}

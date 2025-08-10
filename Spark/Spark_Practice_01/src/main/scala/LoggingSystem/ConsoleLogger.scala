package LoggingSystem

trait ConsoleLogger extends Logger {
   override def log(msg: String): Unit = {
    println(msg)
  }
}
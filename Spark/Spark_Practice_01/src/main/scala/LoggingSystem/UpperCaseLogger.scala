package LoggingSystem

trait UpperCaseLogger extends Logger {
  abstract override def log(msg: String): Unit = {
    val upperCase = msg.toUpperCase
    super.log(upperCase)
  }
}
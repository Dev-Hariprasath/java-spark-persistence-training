package LoggingSystem

import org.joda.time.LocalDateTime

trait TimeStampLogger extends Logger {
  abstract override def log(msg: String): Unit ={
    val timeStamp = s"${LocalDateTime.now()} - $msg"
    super.log(timeStamp)
  }
}
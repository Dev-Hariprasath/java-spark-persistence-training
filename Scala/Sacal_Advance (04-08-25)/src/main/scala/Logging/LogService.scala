package Logging

import java.util.logging.{Level, Logger}

class Service{
  private val logger: Logger = Logger.getLogger(classOf[TraitExamples.Service].getName)

  def serve(): Unit = {
    logger.info("Service is running")
  }
}

object LogService extends App {
  val s = new TraitExamples.Service
  s.serve()
}

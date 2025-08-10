class threadEx extends Thread{
  override def run() = {
    println("Running")
  }
}

object threadEx extends App {
  new threadEx().run()
}
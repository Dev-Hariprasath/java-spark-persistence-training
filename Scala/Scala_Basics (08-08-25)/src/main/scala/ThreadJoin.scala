class ThreadJoin extends Thread{
  override def run(): Unit = {
    for(i <- 1 to 5){
      println(+ i + " - " +getName)
    }
    println()
  }
}

object ThreadJoin extends App {
  val t = new ThreadJoin()
  val s = new ThreadJoin()

  t.start()
  s.start()
}

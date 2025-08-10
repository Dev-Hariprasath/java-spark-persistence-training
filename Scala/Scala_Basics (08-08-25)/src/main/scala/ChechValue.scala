import scala.util.Random

object ChechValue extends App{
  @main def checkValue(): Unit = {
    val x = Random.nextInt(10)

    x match {
      case 0 => println("Zero")
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("Don't Mention " +x)
    }
  }

  checkValue()
}

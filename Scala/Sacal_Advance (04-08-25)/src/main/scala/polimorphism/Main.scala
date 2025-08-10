package polimorphism

object Main extends App {
  val a = new Add()
  println("Adding two numbers : " +a.add(10, 20))
  println("Concat the Strings : " +a.add("Hari", "Prasath"))
}

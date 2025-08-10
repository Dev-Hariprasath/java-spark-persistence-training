class person(name: String, Age: Int) {
  def print(): Unit = {
    println(s"The name is $name and age is $Age")
  }
}

object Main extends App {
  val p = new person("Hari", 23)
  p.print()
}

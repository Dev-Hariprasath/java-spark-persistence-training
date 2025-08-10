package inheritance.SingleInheritance


object Main extends App {
  val p = new Parent()
  p.greet()

  val c = new Child
  c.greet()
}

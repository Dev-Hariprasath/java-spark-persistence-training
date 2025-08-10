package TraitExamples

//Overriding

trait Greeter {
  def greet(): Unit = println("Hello!")
}

class FriendlyGreeter extends Greeter{
  override def greet(): Unit = println("Hey, friend!")
}

object Main1 extends App{
  val s = new FriendlyGreeter()
  s.greet()
}
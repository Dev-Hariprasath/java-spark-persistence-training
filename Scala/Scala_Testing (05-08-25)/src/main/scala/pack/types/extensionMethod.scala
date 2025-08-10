package pack.types

case class Circle(x: Double,y: Double, radius: Double)


//Define a extension method for the circle class
extension (c: Circle)
  def circumference: Double = c.radius * Math.PI * 2

object extensionMethod extends App {
  val myCircle = Circle(0, 0, 5)
  val circ = myCircle.circumference //Invokes the extension method
  println("Circumference : " +circ)
}

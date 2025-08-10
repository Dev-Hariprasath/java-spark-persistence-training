package abstraction.Task01

class Circle(radius: Double) extends Shape{
  override def area(): Double = Math.PI * radius * radius
  
}

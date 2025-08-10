package StringLiterals

class Person (val name:String, var age:Int){
  def greet():Unit=println(s"Hi I am $name and age is $age")
}

object Main3 extends App{
  val p = new Person("Remya", 35)
  p.greet()
}

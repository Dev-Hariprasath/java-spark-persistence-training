package pack.types
import java.awt.print.Printable

trait printable:
  def print(): Unit
  
trait Identifiable:
  def id:String
  
def printDetails(obj: printable & Identifiable): Unit = 
  println(s"ID: ${obj.id}")
  obj.print()


class User(val id: String, val name: String) extends printable, Identifiable:
  def print(): Unit = println(s"User: $name")
  

@main def runExample(): Unit =
  val user = new User("U101", "Hari")
  printDetails(user)

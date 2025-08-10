package LibraryManagementSystem

import scala.collection.mutable

class Library {
  var Users: List[User] = List(
    new User(1, "Alice"),
    new User(2, "Bob"),
    new User(3, "Charlie"),
    new User(4, "David"),
    new User(5, "Eva")
  )

  var Books: List[Book] = List(
    new Book(101, "Scala for Beginners"),
    new Book(102, "Advanced Scala"),
    new Book(103, "Functional Programming in Scala"),
    new Book(104, "Akka Concurrency"),
    new Book(105, "Scala Cookbook")
  )

  val register: mutable.Map[Int, List[String]] = mutable.Map(
    1 -> List("Scala for Beginners", "Akka Concurrency"),
    2 -> List("Advanced Scala"),
    3 -> List("Scala Cookbook"),
    4 -> List("Functional Programming in Scala"),
    5 -> List("Scala for Beginners")
  )

  def takeBook(Id: Int, Name: String): Unit = {
    val updatedList = register.getOrElse(Id, List()) :+ Name
    register.update(Id, updatedList)
  }

  def returnBook(Id: Int, Name: String): Unit = {
    register.get(Id) match {
      case Some(books) =>
        val updatedList = books.filterNot(_ == Name)
        if (updatedList.isEmpty)
          register.remove(Id)
        else
          register.update(Id, updatedList)
      case None =>
        println("The data not present")
    }
  }

  def getAllUsers(): Unit = Users.foreach(println)

  def addBook(): Unit = {
    println("Enter book id:")
    val id = scala.io.StdIn.readInt()
    println("Enter book name:")
    val name = scala.io.StdIn.readLine()
    val book = new Book(id, name)

    if (Books.contains(book))
      println("Book Present")
    else
      Books = Books :+ book
  }

  def addUser(): Unit = {
    println("Enter user id:")
    val id = scala.io.StdIn.readInt()
    println("Enter name:")
    val name = scala.io.StdIn.readLine()
    val user = new User(id, name)

    if (Users.contains(user))
      println("User Present")
    else
      Users = Users :+ user
  }

  def getRegister(): Unit = register.foreach(println)
  def getAllBooks(): Unit = Books.foreach(println)
}

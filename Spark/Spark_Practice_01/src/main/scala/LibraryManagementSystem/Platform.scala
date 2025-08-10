package LibraryManagementSystem

object Platform {
  val sc = scala.io.StdIn
  val lib = new Library

  def main(args: Array[String]): Unit = {

    while (true) {
      println("==== Library ====")
      println("1 - Get All Users")
      println("2 - Get All Books")
      println("3 - Get Register")
      println("4 - Take Book")
      println("5 - Return Book")
      println("6 - Add Book")
      println("7 - Add User")
      println("0 - Exit")

      println("\nChoose One Option :")
      val input = sc.readInt()

      input match {
        case 1 => lib.getAllUsers()
        case 2 => lib.getAllBooks()
        case 3 => lib.getRegister()
        case 4 => takeBook()
        case 5 => returnBook()
        case 6 => lib.addBook()
        case 7 => lib.addUser()
        case 0 =>
          println("Exiting...")
          sys.exit()
        case _ => println("Not valid Input")
      }
    }
  }

  private def takeBook(): Unit= {
    println("Enter User ID:")
    val Id = sc.readInt()
    println("Enter Book Name:")
    val name = sc.readLine()
    lib.takeBook(Id, name)
  }

  private def returnBook(): Unit = {
    println("Enter User ID:")
    val Id = sc.readInt()
    println("Enter Book Name:")
    val name = sc.readLine()
    lib.returnBook(Id, name)
  }
}

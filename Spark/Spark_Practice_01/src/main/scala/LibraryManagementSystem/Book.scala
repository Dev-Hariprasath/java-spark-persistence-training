package LibraryManagementSystem

class Book (private var BookId: Int,
           private var BookName: String) {

  def getBookId: Int = this.BookId
  def getBookName: String = this.BookName

  def setBookId(Id: Int): Unit = this.BookId = Id
  def setBookName(name: String): Unit = this.BookName = name

  override def toString = s"Book($BookId, $BookName)"
}

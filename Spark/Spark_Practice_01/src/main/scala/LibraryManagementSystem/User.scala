package LibraryManagementSystem

class User(private var UsrId: Int, private var name: String) {
  def getUsrId: Int = this.UsrId
  def getName: String = this.name

  def setUsrId(Id: Int): Unit = this.UsrId = Id
  def setUserName(name: String): Unit = this.name = name


  override def toString = s"User($UsrId, $name)"
}

package ExceptionHandling.Option

  def getUser(id: Int): Option[String] = {
    if(id == 1) Some("Hari") else None
  }


object findUser extends App{
  val user = getUser(2).getOrElse("User Not Found")
  println(user)
}

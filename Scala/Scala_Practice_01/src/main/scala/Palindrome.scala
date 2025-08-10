class Palindrome {
  def checkPalindrome(str: String): String = {
    if(str.reverse.equals(str)) s"The Given String $str is a palindrome" else s"$str is not a palindrome"
  }
}

object Palindrome extends App {
  val v = "ABBA"
  println(new Palindrome().checkPalindrome(v))
}

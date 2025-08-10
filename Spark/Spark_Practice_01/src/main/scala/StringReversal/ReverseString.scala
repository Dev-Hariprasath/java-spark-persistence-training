package StringReversal

class ReverseString {
  def reverseString(str: String): String = {
    var reversed = ""

    for(i <- str.length -1 to 0 by -1)
      reversed += str.charAt(i)

    reversed
  }
}

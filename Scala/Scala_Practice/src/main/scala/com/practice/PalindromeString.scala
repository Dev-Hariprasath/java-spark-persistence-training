package com.practice

object PalindromeString extends App {
  println("Enter a string : ")
  val str = scala.io.StdIn.readLine()
  var rev = ""
  
  for(i <- str.length - 1 to 0 by -1){
    rev += str(i)
  }
  
  if(rev.equals(str)) println("Palindrome") else println("Not a Palindrome")
  
}

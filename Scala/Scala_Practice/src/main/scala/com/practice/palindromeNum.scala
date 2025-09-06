package com.practice

object palindromeNum extends App {
  println("Enter a Number : ")
  var num = scala.io.StdIn.readInt()
  var temp = num
  var n = 0

  while(num > 0){
    val digit = num % 10
    n = (n * 10) + digit 
    num = num / 10
  }

  println(n)
  if(temp == n) println("Palindrome") else println("Not a palindrome")
}

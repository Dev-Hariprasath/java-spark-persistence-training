package com.practice

object ReverseString extends App {

  println("Enter the string : ")
  var str = scala.io.StdIn.readLine()
  var rev = ""

  for(i <- str.length - 1 to 0 by -1){
    rev += str(i)
  }

  println("The reversed String is " +rev)
}

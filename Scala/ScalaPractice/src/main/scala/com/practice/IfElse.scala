package com.practice

object IfElse extends App {
  val number = scala.io.StdIn.readInt()
  if(number > 0) print("Positive") else if (number < 0) print("Negative") else print("Zero")
}

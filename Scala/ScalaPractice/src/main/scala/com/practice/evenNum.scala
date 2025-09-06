package com.practice

import scala.io.StdIn._

object evenNum extends App {
  
  print("Enter a number :")
  val number = readInt()
  
  if(number % 2 == 0) print("Even Number") else print("Not Even")
}

package com.practice

import scala.io.StdIn._

object variable {
  def main(args: Array[String]): Unit = {
    // Declare variable
    
    println("Enter Your name : ")
    val name = readLine();
    
    println("Enter You Age : ")
    var age = readInt()
    age += 10
    
    println(s"Name is ${name} and age is ${age}")
  }
}

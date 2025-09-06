package com.practice

object factorialNum extends App{
  val num = scala.io.StdIn.readInt()
  
  var cnt = 1
  var ans = 1
  
  while(cnt <= num){
    ans = cnt * ans
    cnt += 1
  }
  
  print(s"The factorial is ${ans}")
}

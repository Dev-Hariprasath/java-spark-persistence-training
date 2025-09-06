package com.practice

object abs extends App {
  val num = scala.io.StdIn.readInt()
  
  if(num < 0){
    print(num * -1)
  }else{
    print(num)
  }
}

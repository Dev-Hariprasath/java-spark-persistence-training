package com.practice

object evenNum2 extends App(){
  for(i:Int <- 1 to 20){
    if(i % 2 == 0){
      println(i)
    }
  }
}

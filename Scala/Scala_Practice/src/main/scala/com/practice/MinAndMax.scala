package com.practice

object MinAndMax extends App {
  var max = Int.MinValue
  var min = Int.MaxValue
  
  val arr = Array(1, 2, 3, 4, 5, 9)
  
  for(i <- arr){
    if(i > max) max = i
    if(i < min) min = i
  }
  
  println(s"The min is $min and the max is $max")
}

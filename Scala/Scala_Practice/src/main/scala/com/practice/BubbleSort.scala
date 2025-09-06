package com.practice

object BubbleSort extends App {
  val arr = Array(1, 3, 5, 2, 6, 9, 7)

  println(s"The unsorted array is ${arr.mkString(", ")}")

  for(i <- 0 until arr.length){
    for(j <- 0 until arr.length){
      if(arr(j) > arr(i)){
        val temp = arr(i)
        arr(i) = arr(j)
        arr(j) = temp
      }
    }
  }

  println(s"The sorted array is ${arr.mkString(", ")}")
}

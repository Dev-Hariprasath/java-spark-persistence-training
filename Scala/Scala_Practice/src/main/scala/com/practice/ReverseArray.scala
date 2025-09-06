package com.practice

object ReverseArray extends App{
  val arr1 = Array(1, 2, 4, 6, 8, 10)
  var l = 0
  var r = arr1.length - 1

  println(arr1.mkString(", "))

  while(l < r){
    val temp = arr1(l)
    arr1(l) = arr1(r)
    arr1(r) = temp

    l += 1
    r -= 1
  }

  println(arr1.mkString(", "))

}
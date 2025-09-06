package com.practice

object evenNum3 extends App {
  val l = Vector(1,2,3,4,5,6,7)
  print(l.filter( x => x % 2 == 0))
}
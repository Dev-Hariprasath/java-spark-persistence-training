package com.practice

object forComperhension extends App{
   var l: List[Int] = List(1, 2, 3, 4, 5)
   val squared: List[Int] = for(x <- l) yield x * x
   println(s"The list ${l.mkString(", ")}")
   println(s"The square list ${squared.mkString(", ")}")
}

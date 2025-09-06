package com.practice

import scala.collection.mutable


object mapEx extends App {
  val nums = List(1, 2, 4, 5, 6, 8, 2)
  val mapping = mutable.Map[Int, Int]()
  for(x: Int <- nums){
    mapping.update(x, mapping.getOrElse(x, 0) + 1)
  }
}

package com.practice

class arithmetic {
  def add(a: Int)(b: Int): Int = {
    a + b
  }
}

object sum extends App{
  val ans = new arithmetic().add(4)_
  print(ans(5))
}

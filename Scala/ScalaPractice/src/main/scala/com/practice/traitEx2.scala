package com.practice

trait animal {
  def survive(): Unit = {
    print("live in jungle")
  }
}

class lion extends animal {
  override
  def survive(): Unit = {
    println("Live in zoo")
  }
}
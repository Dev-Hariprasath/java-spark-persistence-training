package com.practice

abstract class vechile() {
  def move(): Unit
}

class car extends vechile {
  override 
  def move(): Unit = println("Drive with Four wheels")
}

class bike extends vechile {
  override 
  def move(): Unit = println("Drive with two wheels")
}

object showRoom extends App{
  new car().move()
  new bike().move()
}
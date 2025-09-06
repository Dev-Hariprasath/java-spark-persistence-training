package com.practice

trait speak {
  def speak(): Unit
}

class Dog extends speak{
  override 
  def speak(): Unit = {
    print("Dog bark")
  }
}

class Cat extends speak {
  override 
  def speak(): Unit = {
    print("Cat makes sound")
  }
}

object main extends App{
  new Dog().speak()
  new Cat().speak()
}
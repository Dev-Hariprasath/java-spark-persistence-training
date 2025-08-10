package Vehicles

abstract class Vehicle(speed: Int, capacity: Int) {
   def fuelType(): String = " "

  def displayInfo(): Unit = {
    println(s"Speed: $speed km/h, Capacity: $capacity people, Fuel: ${fuelType()}")
  }
}
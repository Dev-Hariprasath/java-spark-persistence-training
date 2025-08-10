package Vehicles

class Bike(speed: Int, capacity: Int) extends Vehicle(speed, capacity) {
  override def fuelType(): String = "Petrol"
}

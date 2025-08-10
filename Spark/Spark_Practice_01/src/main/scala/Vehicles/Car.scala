package Vehicles

class Car(speed: Int, capacity: Int) extends Vehicle(speed, capacity) {
  override def fuelType(): String = "Petrol / Diesel"
}

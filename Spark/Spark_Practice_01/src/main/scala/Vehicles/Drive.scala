package Vehicles

object Drive {
  def main(args: Array[String]): Unit = {
    val car = new Car(180, 5)
    val bike = new Bike(120, 2)

    println("---- Vehicle Information ----")
    println("==== CAR ====")
    car.displayInfo()
    println("=== BIKE ====")
    bike.displayInfo()
  }
}
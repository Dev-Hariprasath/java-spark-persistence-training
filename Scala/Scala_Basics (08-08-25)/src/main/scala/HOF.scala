object HOF extends App {
  val salary = Seq(20000, 30000, 40000, 50000)
  val doubleSalary = (x: Int) => x * 2
  val newSalries = salary.map(doubleSalary)

  println(newSalries)
}

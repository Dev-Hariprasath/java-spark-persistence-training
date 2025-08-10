package TaxCalculator

object CurryingFunction {

  def taxCalculator(rate: Double)(amount: Int): Double = {
    rate * amount
  }

  def main(args: Array[String]): Unit = {
    val sc = scala.io.StdIn

    // ==== Apply the interest First ====
    println("Enter the Rate of Interest :")
    val rate = sc.readDouble()
    val applyInterest = taxCalculator(rate)(_)

    // ==== Apply the amount
    println("Enter the amount :")
    val amount = sc.readInt()
    val taxApplied = applyInterest(amount)


    println(s"The Tax is for $amount with interest of $rate% are Rs.$taxApplied")

  }
}

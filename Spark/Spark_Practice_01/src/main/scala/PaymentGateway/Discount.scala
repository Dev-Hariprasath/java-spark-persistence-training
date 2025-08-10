package PaymentGateway

trait Discount extends Payment {
  val discountRate = 0.1

  abstract override def toPay(amount: Double): Unit = {
    val discountedAmount = amount - (amount * discountRate)
    println(f"Applying $$${discountRate * 100} to the payment, Pay only $$${discountedAmount}")
    super.toPay(discountedAmount)
  }
}

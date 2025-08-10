package PaymentGateway

class CreditCardPayment extends Payment {
  override def toPay(amount: Double): Unit = {
    println(f"Paid $$${amount}%.2f Using Credit card")
  }
}
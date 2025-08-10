package PaymentGateway

trait Payment {
  def toPay(amount: Double): Unit
}
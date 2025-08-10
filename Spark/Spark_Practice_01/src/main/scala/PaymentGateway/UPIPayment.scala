package PaymentGateway

class UPIPayment extends Payment {
   override def toPay(amount: Double): Unit = {
    println(f"Paid $$${amount}%.2f Using UPI APP")
  }
}
package PaymentGateway

object PaymentProcessing {
  def main(args: Array[String]): Unit = {

    println("---- Credit Card without Discount ----")
    val cc = new CreditCardPayment
    cc.toPay(100)

    println("\n---- Credit Card with Discount ----")
    val ccDiscount = new CreditCardPayment with Discount
    ccDiscount.toPay(100)

    println("\n---- UPI without Discount ----")
    val upi = new UPIPayment
    upi.toPay(200)

    println("\n---- UPI with Discount ----")
    val upiDiscount = new UPIPayment with Discount
    upiDiscount.toPay(200)

  }
}
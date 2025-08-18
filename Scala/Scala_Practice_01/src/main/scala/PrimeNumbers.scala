object PrimeNumbers {

  def checkPrime(num: Int): Boolean = {
    var count = 0

    for(i <- 1 to num)
      if(num % i == 0)
        count += 1

    if (count == 2) true else  false
  }

  def main(args: Array[String]): Unit = {
    println("Printing prime Number From 1 to 100")

    for(i <- 1 to 100){
      if(checkPrime(i))
        println(i)
    }
  }
}

object SecondLargestNumber {
  def findSecondLargest(num: Array[Int]): Int = {
    var Max = 0
    var secondMax = 0

    for(i <- 0 until  num.length) {
      if(num(i) > Max){
        secondMax = Max
        Max = num(i)
      } else if (Max < num(i) && secondMax > num(i)){
        secondMax = num(i)
      }
    }
    secondMax
  }

  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1,2,3,4,5,6)
    println(s"The Second Larger num in array ${arr.mkString(", ")} " +
      s"is ${findSecondLargest(arr)}")
  }
}

package ListTransformer

object SquaredList {

  def squaredList(nums: List[Int]): List[Int] = {
    nums.map(x => x * x)
  }

  def main(args: Array[String]): Unit = {
    val sc = scala.io.StdIn
    println("Enter the list in space separated")
    val input = sc.readLine()
    val list = input.split(" ").map(_.toInt).toList
    println("The Squared List is : ")
    println(squaredList(list).mkString(", "))
  }
}

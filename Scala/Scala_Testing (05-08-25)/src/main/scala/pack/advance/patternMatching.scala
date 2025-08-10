package pack.advance

object patternMatching extends App {
  def describe(x: Any): String = x match
    case 0 => "Zero"
    case _: Int => "An Integer"
    case _ => "Something"

  val s = describe(0)
  println(s)
}

object SetEx extends App{
  val s = Set(1,2,3,5,6,7)
  val t = Set(2,3,4)
  val a = s &~t
  print(a)
}
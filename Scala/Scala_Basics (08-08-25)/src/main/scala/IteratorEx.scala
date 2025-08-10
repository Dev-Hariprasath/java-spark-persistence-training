object IteratorEx extends App {
  val It = Iterator(1,2,3,4,5,6)

  while(It.hasNext){
    print(It.next() + " ")
  }
}

package TraitExamples

trait Printable {
  def print():Unit = println("Printing....")
}

trait Scannable {
  def scan():Unit = println("Scanning...")
}

class MultiFunctionPointer extends Printable with Scannable

object Main2 extends App{
 val mfp = new MultiFunctionPointer
 mfp.scan()
  mfp.print()
}
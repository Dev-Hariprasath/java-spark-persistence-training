package polimorphism

class Add {
  def add(a: Int, b: Int): Int = {
    a + b
  }
  def add(a: String, b: String): String = {
    a + b
  }
}

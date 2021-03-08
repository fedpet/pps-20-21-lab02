package u02

object Hello extends App {
  def parity(x: Int) = if (x % 2 == 0) "even" else "odd"

  println("Hello, Scala")
}

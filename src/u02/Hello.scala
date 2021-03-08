package u02

object Hello {
  def parity(x: Int): String = if (x % 2 == 0) "even" else "odd"

  def neg[T](predicate: T => Boolean): T => Boolean = !predicate(_)

  val p1: Int => Int => Int => Boolean = (x:Int) => (y:Int) => (z:Int) => x <= y && y <= z
  val p2: (Int, Int, Int) => Boolean = (x:Int, y:Int, z:Int) => x <= y && y <= z
  def p3(x:Int): Int => Int => Boolean = (y:Int) => (z:Int) => x <= y && y <= z
  def p4(x:Int, y:Int, z:Int): Boolean = x <= y && y <= z

  def compose[A, B, C](f:B => C, g:A => B): A => C = x => f(g(x))
}

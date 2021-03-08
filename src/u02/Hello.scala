package u02

object Hello {
  def parity(x: Int): String = if (x % 2 == 0) "even" else "odd"

  def neg[T](predicate: T => Boolean): T => Boolean = !predicate(_)
  val vneg:(String => Boolean) => String => Boolean = (predicate:String => Boolean) => !predicate(_)
  /**
   * Unico problema risontrato: impossibilità di rendere vneg generica
   */

  val p1: Int => Int => Int => Boolean = (x:Int) => (y:Int) => (z:Int) => x <= y && y <= z
  val p2: (Int, Int, Int) => Boolean = (x:Int, y:Int, z:Int) => x <= y && y <= z
  def p3(x:Int): Int => Int => Boolean = (y:Int) => (z:Int) => x <= y && y <= z
  def p4(x:Int, y:Int, z:Int): Boolean = x <= y && y <= z

  def compose[A, B, C](f:B => C, g:A => B): A => C = x => f(g(x))

  def fib(n:Int):Int = {
    @annotation.tailrec
    def fib2(n:Int, a:Int, b:Int):Int = n match {
      case 0 => a
      case 1 => b
      case _ => fib2(n-1, b, a+b)
    }
    fib2(n, 0, 1)
  }
}

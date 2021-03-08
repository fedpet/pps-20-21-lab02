package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Hello.fib

class FibonacciTest {
  @Test def testFib() {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
    assertEquals(2, fib(3))
    assertEquals(3, fib(4))
  }
}

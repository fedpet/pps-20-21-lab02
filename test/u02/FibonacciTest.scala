package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FibonacciTest {
  @Test def testFib() {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(2, fib(1))
    assertEquals(3, fib(2))
    assertEquals(4, fib(3))
  }
}

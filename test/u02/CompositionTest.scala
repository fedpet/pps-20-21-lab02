package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Lab2Impl.compose

class CompositionTest {
  @Test def testComposition() {
    assertEquals(0, compose[Int, Int, Int](_ * 2, _ - 1)(1))
    assertEquals(2, compose[Int, Int, Int](_ * 2, _ - 1)(2))
    assertEquals(6, compose[Int, Int, Int](_ * 2, _ - 1)(4))
    assertEquals(9, compose[Int, Int, Int](_ - 1, _ * 2)(5))
  }
}

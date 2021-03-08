package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Hello.compose

class CompositionTest {
  @Test def testComposition() {
    val f: Int => Int = _ * 2
    val g: Int => Int = _ - 1
    assertEquals(0, compose(f, g)(1))
    assertEquals(2, compose(f, g)(2))
    assertEquals(6, compose(f, g)(4))
  }
}

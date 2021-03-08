package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Hello.neg

class NegTest {
  @Test def testNeg() {
    val empty: String => Boolean = _==""
    val notEmpty = neg(empty)

    assertEquals(true, notEmpty("foo"))
    assertEquals(false, notEmpty(""))
  }
}

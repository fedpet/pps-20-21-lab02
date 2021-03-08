package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Hello.{neg, vneg}

class NegTest {
  val empty: String => Boolean = _==""

  @Test def testNeg() {
    val notEmpty = neg(empty)

    assertEquals(true, notEmpty("foo"))
    assertEquals(false, notEmpty(""))
  }
  @Test def testVneg() {
    val notEmpty = vneg(empty)

    assertEquals(true, notEmpty("foo"))
    assertEquals(false, notEmpty(""))
  }
}

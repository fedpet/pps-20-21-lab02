package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Hello.parity

class ParityTest {
  @Test def testParity() {
    assertEquals("even", parity(0))
    assertEquals("even", parity(-4))
    assertEquals("odd", parity(3))
  }
}

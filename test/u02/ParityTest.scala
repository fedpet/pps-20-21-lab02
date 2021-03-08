package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ParityTest {
  @Test def test() {
    assertEquals("even", parity(0))
    assertEquals("even", parity(-4))
    assertEquals("odd", parity(3))
  }
}

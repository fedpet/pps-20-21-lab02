package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Hello.{p1, p2, p3, p4}

class CurryingTest {
  @Test def testCurrying() {
    assertEquals(true, p1(1)(2)(3))
    assertEquals(false, p1(1)(2)(0))
    assertEquals(true, p2(1,2,3))
    assertEquals(false, p2(1,2,0))
    assertEquals(true, p3(1)(2)(3))
    assertEquals(false, p3(1)(2)(0))
    assertEquals(true, p4(1,2,3))
    assertEquals(false, p4(1,2,0))
  }
}

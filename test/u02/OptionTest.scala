package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import Optionals.Option._

class OptionTest {
  @Test def testFilter() {
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None, filter(Some(5))(_ > 8))
  }
  @Test def testMap() {
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(None, map(None[Int]())(_ > 2))
  }
  @Test def testMap2() {
    assertEquals(Some(10), map2(Some(2), Some(8))(_ + _))
    assertEquals(None, map2(None(), Some(8))(_ + _))
  }
}

package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Shapes.Shape.{Circle, Rectangle, Square}
import u02.Shapes.{area, perimeter}

class ShapesTest {
  @Test def testPerimeter() {
    assertEquals(10, perimeter(Rectangle(2,3)))
    assertEquals(8, perimeter(Square(2)))
    assertEquals(2*Math.PI, perimeter(Circle(1)))
  }
  @Test def testArea() {
    assertEquals(6, area(Rectangle(2,3)))
    assertEquals(4, area(Square(2)))
    assertEquals(Math.PI, area(Circle(1)))
  }
}

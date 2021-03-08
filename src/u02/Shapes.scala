package u02

object Shapes {
  sealed trait Shape
  object Shape {
    case class Rectangle(width:Double, height:Double) extends Shape
    case class Circle(radius:Double) extends Shape
    case class Square(size:Double) extends Shape
  }

  def perimeter(s:Shape):Double = 0

  def area(s:Shape):Double = 0
}

package u02

import u02.Shapes.Shape.{Circle, Rectangle, Square}

object Shapes {
  sealed trait Shape
  object Shape {
    case class Rectangle(width:Double, height:Double) extends Shape
    case class Circle(radius:Double) extends Shape
    case class Square(size:Double) extends Shape
  }

  def perimeter(s:Shape):Double = s match {
    case Rectangle(width, height) => 2 * (width + height)
    case Square(size) => 4 * size
    case Circle(radius) => 2 * Math.PI * radius
  }

  def area(s:Shape):Double = s match {
    case Rectangle(width, height) => width * height
    case Square(size) => size * size
    case Circle(radius) => Math.PI * radius * radius
  }
}

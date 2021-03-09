package u02

object Optionals extends App {

  sealed trait Option[A] // An Optional data type
  object Option {
    case class None[A]() extends Option[A]
    case class Some[A](a: A) extends Option[A]

    def isEmpty[A](opt: Option[A]): Boolean = opt match {
      case None() => true
      case _ => false
    }

    def getOrElse[A, B >: A](opt: Option[A], orElse: B): B = opt match {
      case Some(a) => a
      case _ => orElse
    }

    def flatMap[A,B](opt: Option[A])(f:A => Option[B]): Option[B] = opt match {
      case Some(a) => f(a)
      case _ => None()
    }

    def filter[A](opt: Option[A])(p:A => Boolean): Option[A] = opt match {
      case None() => None()
      case Some(a) => p(a) match {
        case true => opt
        case false => None()
      }
    }

    def map[A](opt: Option[A])(predicate:A => Boolean): Option[Boolean] = opt match {
      case None() => None()
      case Some(a) => Some(predicate(a))
    }

    def map2[A, B](opt1: Option[A], opt2:Option[A])(mapper:(A,A) => B): Option[B] = (opt1, opt2) match {
      case (Some(v1), Some(v2)) => Some(mapper(v1, v2))
      case _ => None()
    }

    def mapContent[A](opt: Option[A])(mapper:A => A): Option[A] = flatMap(opt)(x => Some(mapper(x)))

    def double(opt: Option[Int]) = mapContent(opt)(_ * 2)

    def invert(opt: Option[Boolean]) = mapContent(opt)(!_)
  }
}

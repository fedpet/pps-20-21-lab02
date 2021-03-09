package u02

object BTrees extends App {

  // A custom and generic binary tree of elements of type A
  sealed trait Tree[A]
  object Tree {
    case class Leaf[A](value: A) extends Tree[A]
    case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

    def size[A](t: Tree[A]): Int = mapReduce[A, Int](t, _ => 1, _+_)

    def find[A](t: Tree[A], elem: A): Boolean = mapReduce[A, Boolean](t, _ == elem, _||_)

    def count[A](t: Tree[A], elem: A): Int = mapReduce[A, Int](t, x => if (x==elem) 1 else 0, _+_)
    // or  _.equals(elem).compare(false) if we don't want to use "if" yet

    private def mapReduce[A, B](t: Tree[A], map:A => B, reduce:(B,B) => B): B = t match {
      case Branch(l, r) => reduce(mapReduce(l, map, reduce), mapReduce(r, map, reduce))
      case Leaf(e) => map(e)
    }
  }
}

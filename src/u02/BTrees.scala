package u02

object BTrees extends App {

  // A custom and generic binary tree of elements of type A
  sealed trait Tree[A]
  object Tree {
    case class Leaf[A](value: A) extends Tree[A]
    case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

    private def traverse[A, B](t: Tree[A])(branchMapper:(Tree[A], Tree[A]) => B)(leafMapper:A => B): B = t match {
      case Branch(l, r) => branchMapper(l, r)
      case Leaf(e) => leafMapper(e)
    }

    def size[A](t: Tree[A]): Int = traverse(t)((l,r) => size(l) + size(r))(_ => 1)

    def find[A](t: Tree[A], elem: A): Boolean = traverse(t)((l,r) => find(l, elem) || find (r,elem))(_ == elem)

    def count[A](t: Tree[A], elem: A): Int = traverse(t)((l, r) => count(l, elem) + count(r, elem))(_ match {
        case x if x == elem => 1
        case _ => 0
      }) // or better yet if(_ == elem) 1 else 0
  }
}

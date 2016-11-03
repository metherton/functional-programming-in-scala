
import fpinscala.datastructures._

object datastructures {

  val x = List(1,2,3,4,5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t) => h + List.sum(t)
    case _ => 101
  }

  def tail[A](xs: List[A]): List[A] = xs match {
    case Nil => sys.error("not allowed")
    case Cons(h, t) => t
  }

  def setHead[A](h: A, l: List[A]): List[A] = l match {
    case Nil => sys.error("not allowed on empty list")
    case Cons(_, t) => Cons(h, t)
  }

  val myList = List(1,2,3)
  tail(myList)

  val newList = setHead(4, myList)
}

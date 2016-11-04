
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

  def drop[A](l: List[A], n: Int): List[A] =
    if (n <= 0) l
    else l match {
      case Nil => Nil
      case Cons(_,t) => drop(t, n-1)
    }

  def dropWhile[A](l: List[A], f: A => Boolean): List[A] =     l match {
    case Cons(h,t) if f(h) => dropWhile(t, f)
    case _ => l
  }

  def init[A](l: List[A]): List[A] = l match {
      case Cons(h, Nil) => Nil
      case Cons(h, t) => Cons(h, init(t))
  }


  val myList = List(1,2,3,1)
  tail(myList)
  val initlist = init(myList)
  val newList = setHead(4, myList)
  val n = drop(newList, 4)
  n
  val m = dropWhile(myList, (x: Int) => x < 2)

  val z = List.foldRight(myList, 0)((x, y) => x + y)

  val v = List.length(myList)
}

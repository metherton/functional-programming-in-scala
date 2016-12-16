import fpinscala.datastructures.Cons
import fpinscala.datastructures.List._
import fpinscala.datastructures._

object ds {
  val x = List(1,2,3,4,5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t) => h + sum(t)
    case _ => 101
  }

  val y = List.tail(List(1,2,3))

  val z = List.setHead(List(1,2,3), 4)

  val s = List.drop(List(1,2,3,4), 2)

  val p = List.dropWhile(List(1,2,3,4), (x: Int) => (x < 3))

  val r = List.init(List(1,2,3,4))

  val n = List.foldRight(List(1,2,0,4, 5), 1.0)(_ * _)
  val nleft = List.foldLeft(List(1,2,3,4, 5), 1.0)(_ * _)

   val m = List.length(List(1,2,3))

  val z1 = List.sum3(List(1,2,3))

  val z2 = List.product3(List(1,2,3))

  val m1 = List.length1(List(1,2,3))

  val m2 = List.addOne(List(1,2,3))

  val m3 = List.convertDoubleToString(List(1.0,2.1,3.2))

  val m4 = List.map(List(1,2))((x: Int) => (x + 1))

  val m5 = List.flatMap(List(List(1,2), List(3,4)))((x: List[Int]) => map(x)(_ + 1))


 // val odd = List.filter(List(1,2,3))((x: Int) => ((x % 2) == 1))
 // val oddFlatMap = List.filter1(List(1,2,3))((x: Int) => ((x % 2) == 1))

  List.hasSubsequence(List(1,2,3), List(1,2))


}

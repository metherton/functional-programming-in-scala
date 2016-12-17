package fpinscala.datastructures

import scala.annotation.tailrec

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]


object Tree {


  def size[A](t: Tree[A]): Int = t match {
    case Leaf(_) => 1
    case Branch(l,r) => 1 + size(l) + size(r)
  }

  def max(t: Tree[Int]): Int = {

    def loop(t: Tree[Int], acc: Int): Int = t match {
      case Leaf(x) => x max acc
      case Branch(l, r) => loop(l, acc) max loop(r, acc)
    }

    loop(t, 0)
  }


  def maximum(t: Tree[Int]): Int = t match {
    case Leaf(n) => n
    case Branch(l,r) => maximum(l) max maximum(r)
  }

//  def depth(t: Tree[Int]): Int = {
//    def loop(t: Tree[Int], acc: Int): Int = t match {
//      case Leaf(_) => acc
//      case Branch(l, r) => loop(l, acc + 1) max loop(r, acc + 1)
//    }
//    loop(t, 0)
//  }

  /*
  Again, note how similar the implementation is to `size` and `maximum`.
  */
  def depth[A](t: Tree[A]): Int = t match {
    case Leaf(_) => 0
    case Branch(l,r) => 1 + (depth(l) max depth(r))
  }


}

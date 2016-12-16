import fpinscala.gettingstarted.MyModule._
import fpinscala.gettingstarted.PolymorphicFunctions._

object gs {

  val bla = fib(7)
  val names = Array("fred", "gill", "albert")
  def compare(first: String, second: String):Boolean = first > second
  val isSortedProperly = isSorted(names, compare)


}
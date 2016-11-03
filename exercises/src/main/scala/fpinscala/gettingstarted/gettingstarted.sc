import fpinscala.gettingstarted._
object gettingstartedsheet {
  MyModule.abs(-46)
  MyModule.fib(3)
  val myList = Array(4, 1,2,3)
  def gt(i: Int, j: Int): Boolean = {
    i > j
  }
  PolymorphicFunctions.isSorted(myList, gt)
  //def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
}

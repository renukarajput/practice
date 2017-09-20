package scala.concept

/**
  * Created by rrn3194 on 4/14/16.
  */
object CurryingExample extends App{
  def curriedSum(a: Int)(b: Int) = a + b

  def sum(a:Int, b:Int) = a + b

  println(sum(3,4))
  println(curriedSum(5)(5))
}

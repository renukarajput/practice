package scala.concept

/**
  * Created by rrn3194 on 4/14/16.
  */
object CurryingExample extends App {
  def curriedSum(a: Int)(b: Int) = a + b

  def sum(a: Int, b: Int) = a + b

  println(sum(3, 4))

  println(curriedSum(5)(5))

  val f = curriedSum(3) _ //_ is needed to represent partial function call and avoid compile error
  println(f(6))

  def multiply(a: Int, b: Int) = a * b

  println(curriedSum(4)(multiply(3, 5))) //curried sum is loosely coupled and re-usable to add not just 2 integers

  def divide(a: Int, b: Int) = a /b
  println(curriedSum(4)(divide(50, 10)))
  //https://stackoverflow.com/questions/8063325/usefulness-as-in-practical-applications-of-currying-v-s-partial-application-i
}

package com.scala.concept

/**
  * Created by rrn3194 on 4/14/16.
  */
object PatternMatchEx extends App{
  def fibonacci(in: Any): Int = in match {
    case 0 => 0
    case 1 => 1
    case n: Int => fibonacci(n - 1) + fibonacci(n - 2)
    case _ => 0
  }
  println(fibonacci(4))
}

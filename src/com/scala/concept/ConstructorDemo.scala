package com.scala.concept

/**
  * Created by rrn3194 on 4/11/16.
  */
class Rational(n:Int, d:Int){    // this is primary constructor
  def this(n: Int) = this(n, 1)      // secondary constructor
  override def toString() = "(" + n + "/" +d + ")";
}

object ConstructorDemo {
  def main(args: Array[String]) {
    val a = new Rational(3,10)

    println(a.toString)
    println(new Rational(5).toString())

  }
}


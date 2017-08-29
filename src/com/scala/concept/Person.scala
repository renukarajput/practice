package com.scala.concept

/**
  * Created by rrn3194 on 4/6/16.
  */
class Person{
   val id: Int = 1
   val name : String = "abc"
}

object PersonDemo{
  def max2(x: Int, y: Int) = if (x > y) x else y
  def main(args: Array[String]) {
    val p = new Person
    println(p.id + " "+ p.name)

    var a = 5
    var b = a
    b = 10
    a = b
    println("a : " + a+" b: "+ b)

    var s1 = "hello"
    var s2 = "world"
    s2 = "abc"
    s1 = s2
    println("s1: "+s1+" s2: "+s2)
  }
}

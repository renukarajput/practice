package com.scala.concept

/**
  * Created by rrn3194 on 4/6/16.
  */
object StringDemo{
  def main(args: Array[String]) {
    val msg = "hello, world"
    var s1 :String = "hello"
    var s2 : String = "aaaaa"
    s2 = s1
    println("s2 === "+s2)
    s2 = "bbbb"
    println(s2+"=== "+ s1)
    val s3 : String = null
   // println(s3.equals(s1))
//    println((s1!= s2)+"== "+s1.equals(s2))
  }
}


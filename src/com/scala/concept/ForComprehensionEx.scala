package com.scala.concept

/**
  * Created by rrn3194 on 4/13/16.
  */
object ForComprehensionEx {
  def main(args: Array[String]) {
    val fruits: List[String] = "apple" :: "banana" :: "orange" :: Nil
    val capFruits = for (f <- fruits) yield f.toUpperCase
    println(capFruits)

    val names = List("smith", "john","joy")
    val capNames = for (n <- names) yield n.capitalize
    println(capNames)

    val animals = List("bat", "cat","goat")
    val capAnimals = for (a <- animals) yield a.replace('a' , 'x')
    println(capAnimals)
  }
}

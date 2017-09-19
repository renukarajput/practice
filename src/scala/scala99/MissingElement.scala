package scala.scala99

import scala.collection.immutable.HashSet

/**
  * Created by rrn3194 on 5/22/16.
  */
object MissingElement extends App{
  val arr1: Array[Int] = Array(1,4,2,3,6,8)
  val arr2 = Array(1,4,2,3,8)
  findMissingElm(arr1, arr2)

  def findMissingElm(arr1:Array[Int] ,arr2:Array[Int]): Int ={
    val set1 = HashSet(arr1)
    val set2 = HashSet(arr2)
    println(set1 ," == " , set2.toList)

    1
  }
}

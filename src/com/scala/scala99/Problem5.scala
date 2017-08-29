package com.scala.scala99

/**
  * Created by rrn3194 on 4/10/16.
  */
object Problem5 {

  def printReversedList(listOfInt: List[Int]): List[Int] = {
     return listOfInt.reverse
  }

  def main(args: Array[String]) {
    val listOfInt : List[Int]= List(1,6,2,3,5,4)
    println(printReversedList(listOfInt))
  }


}

package scala.scala99

import java.util

/**
  * Created by rrn3194 on 4/10/16.
  */
object Problem3 {
  def main(args: Array[String]) {
    val listOfInt : List[Int]= List(1,0,2,3,5,4)

    getKthElement(4,listOfInt)
  }

  def getKthElement(n : Int, list : List[Int]): Unit ={
    for (i <- 0 to list.size){
      if (i == n)
        println(list.indexOf(i))
    }

  }
}

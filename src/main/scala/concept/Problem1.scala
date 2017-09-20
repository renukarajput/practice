package scala.concept

/**
  * Created by rrn3194 on 4/5/16.
  */

object Problem1 {
  def main(args: Array[String]) {
      findTwoDigitNum()
  }

  def findTwoDigitNum(): Unit ={
    for (x <- 0 to 9) {
      for (y <- 0 to 9) {
        if (Math.pow(x, y) == (10 * y + x)) {
          println(x + " --- " + y)
        }
      }
    }
  }

  def pow(x :Int, y : Int): Int ={
    var res : Int = 0
    for (i <- 1 to y){
      res = x * x
    }
    return res
  }
}

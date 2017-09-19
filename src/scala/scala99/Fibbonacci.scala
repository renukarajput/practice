package scala.scala99

import java.util.Scanner

/**
  * Created by rrn3194 on 5/14/16.
  */
class Fibbonacci {

    def fibbSeries(no: Int): Int ={
        if(no == 0)
          return 0
        if(no == 1)
          return 1

       fibbSeries(no-1) + fibbSeries(no-2)

    }
}

object FibbSeries{
  def main(args: Array[String]) {
    val fibb = new Fibbonacci
    println("enter a no")
    val sc = new Scanner(System.in)
    val num = sc.nextInt()
    for (i <- 0 to num)
      print(fibb.fibbSeries(i)+" ")
   }
}

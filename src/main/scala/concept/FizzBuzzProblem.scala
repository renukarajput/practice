package scala.concept

import java.util

/**
  * Created by rrn3194 on 4/7/16.
  */
object FizzBuzzProblem {
  def main(args: Array[String]) {
    println(fizzBuzz(15))
  }

  def fizzBuzz(num:Int): String ={
      val list = new util.ArrayList();
     if (num % 3 == 0 && num % 5 == 0) "FizzBuzz"
     else  if (num % 3 == 0)  "Fizz"
     else if (num % 5 == 0)  "Buzz"
     else num.toString
  }
}

package scala.concept

import java.util.Scanner

/**
  * Created by rrn3194 on 4/7/16.
  */
object FizzBuzzProblem {
  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    println("Enter a number: ")
    val num = sc.nextInt
    println(fizzBuzz(num))
  }

  def fizzBuzz(num:Int): String ={
     if (num % 3 == 0 && num % 5 == 0) "fizzbuzz"
     else  if (num % 3 == 0)  "fizz"
     else if (num % 5 == 0)  "buzz"
     else num.toString
  }
}

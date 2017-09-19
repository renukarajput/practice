package scala.calc

import java.util.Scanner


/**
  * Created by rrn3194 on 4/7/16.
  */
object Calculator{

   def add(no1: Float, no2: Float): Float = no1 + no2

   def divide(no1: Float, no2: Float): Float = no1 - no2

   def multiply(no1: Float, no2: Float): Float = no1 * no2

   def subtract(no1: Float, no2: Float): Float = no1 /  no2

  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    println("enter first number")
    val no1 = sc.nextFloat()
    println("enter second number")
    val no2 = sc.nextFloat()
    println("enter operation type: ")
    val op = sc.next()
    calculate(no1, no2, op)
  }

  def calculate(no1 : Float, no2 : Float, op : String): Unit = {
     op match {
       case "+" => println(add(no1, no2))
       case "-" => println(subtract(no1, no2))
       case "*" => println(multiply(no1, no2))
       case "/" => println(divide(no1, no2))
       case _ => println("Invalid operation")
     }
  }
}

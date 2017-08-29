package com.scala.scala99

import java.util.Scanner

/**
  * Created by rrn3194 on 5/19/16.
  */

object ReplaceWords extends App{
       val input = "abc pqr efg abc"
       val sc = new Scanner(System.in)
       println("enter word u want to replace")
       val in = sc.next()
       println("with the word")
       val by = sc.next()
       val output = input.replaceAll(in, by)
       println(output)
}

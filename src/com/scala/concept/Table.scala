package com.scala.concept

import java.net.{MalformedURLException, URL}

/**
  * Created by rrn3194 on 4/11/16.
  */
object Table {
  val path = " www.google.com"
  val url = try {
    new URL(path)
  }
  catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }

  def multiTable = {
    val table = for (i <- 1 to 10) yield {
      val row = for (j <- 1 to 10) yield {
        val prod = (i * j).toString
        String.format(" %s  ", prod)
      }
      row.mkString + '\n' }
    table.mkString
  }

  def multiTable(s : String): Unit ={
    println("hello "+s)
  }

  def main(args: Array[String]) {
    println(multiTable)

  }
}

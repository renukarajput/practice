package scala.concept

/**
  * Created by rrn3194 on 4/11/16.
  */
object Table {
  def multiTable = {
    val table = for (i <- 1 to 10) yield {
      val row = for (j <- 1 to 10) yield {
        val prod = (i * j).toString
        String.format(" %s  ", prod)
      }
      row.mkString + '\n' }
    table.mkString
  }

  def main(args: Array[String]) {
    println(multiTable)

  }
}

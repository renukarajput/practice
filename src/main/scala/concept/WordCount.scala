package scala.concept

/**
  * Created by rrn3194 on 4/14/16.
  */
object WordCount extends App{
  val file = List("warn 2013 msg", "warn 2012 msg",
    "error 2013 msg", "warn 2013 msg","warn1 2013")

  def wordcount(str: String): Int = str.split(" ").count("msg" == _)

  val num = file.map(wordcount)
  val countOfMsg = file.map(wordcount).reduceRight(_+_)

  println("wordcount:" + countOfMsg+" count in each string : "+num)

}

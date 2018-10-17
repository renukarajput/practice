package concept.scala_tour

/**
  * Created by rrn3194 on 9/6/18.
  */
object ForComprehensionDemo {
  def main(args: Array[String]): Unit = {
    //    foo(10,10)
    val list = List(1, 2, 3, 4, 5, 21, 30)

    list.map(a => if (a > 20) println(a))
    println(list.filter(a => a > 20))
  }

  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v)
      yield (i, j)

  foo(10, 10) foreach {
    case (i, j) => {
      println(s"($i, $j) ") // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
    }
  }


}

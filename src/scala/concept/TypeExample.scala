package scala.concept

/**
  * Created by rrn3194 on 4/14/16.
  */
object TypeExample extends App{
    type Row = List[Int]
    def Row(xs: Int*) = List(xs: _*)

    type Matrix = List[Row]
    def Matrix(xs: Row*) = List(xs: _*)

    val m = Matrix(Row(1,2,3),
      Row(1,2,3,4),
      Row(1,2,3))

    println(m)
    println(m.getClass)
}

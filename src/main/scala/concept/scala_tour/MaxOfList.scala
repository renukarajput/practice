package concept.scala_tour

object MaxOfList extends App {
  val list = List(5, 2, 3, 1, 6, 4)
  println("======= " + max(list))
  println("======= " + fibb(9))

  val xx: Seq[Int] = list.map(_ * 2)


  def max(list: List[Int]): Int = {
    def maxAccum(list: List[Int], max: Int): Int = list match {
      case Nil => max
      case head :: tail =>
        val newMax = if (head > max) head else max
        maxAccum(tail, newMax)
    }
    maxAccum(list, 0);
  }


  def fibb(no : Int): Int = {

    def fibbHelper(no: Int, start:Int=0,end:Int=1 ): Int = no match {
      case 0 => start
      case 1 => print(end + " "); end
      case _ => print(start+ " "); fibbHelper(no-1, end, (start+end))
    }
    fibbHelper(no)
  }
}
//0 1 1 2 3 5 8 13 ======= 34
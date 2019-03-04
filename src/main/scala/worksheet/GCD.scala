package worksheet

//class GCD {
//  def gcd(a: Long, b: Long): Long = if (b == 0) a else gcd(b, a % b)
//}

object TailRecursion {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(reverse(list))
    println(sum2(list))
  }

  def reverse(list: List[Int]): Int = {
    def sum(list: List[Int], total: Int): Int = list match {
      case Nil => total
      case h::t => sum(t, total + h)
    }
    sum(list, 0)
  }

  def sum2(ints: List[Int]): Int = {
    def sumAccumulator(ints: List[Int], accum: Int): Int = {
      ints match {
        case Nil => accum
        case x :: tail => sumAccumulator(tail, accum + x)
      }
    }
    sumAccumulator(ints, 0)
  }
}
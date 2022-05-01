package concept.scala_tour

object Test1 extends App {
  val list = List(6,1,2,3,4,5)

  def isSorted(list : List[Int]) : Boolean = {
    val out = list.foldLeft(0)(compare(_ , _));
    out match {
      case 0 => false
      case 1 => true
    }
  }

  def compare(a: Int, b: Int): Int = {
    if(a <= b) 1 else 0
  }

  println(s"Sort ${isSorted(list)}")

  fibb(9)

  def fibb(no : Int)={

    def fibbHelper(no:Int, start:Int=0, end:Int=1):Int = no match {
      case 0 => start
      case 1 => {
        println(s"${end} ")
        end
      }
      case _ => {
        println(s"Start: ${start}")
        fibbHelper(no-1, end, (start+end))
      }
    }
    fibbHelper(no)
  }

}

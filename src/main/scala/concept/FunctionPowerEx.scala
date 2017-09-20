package scala.concept

/**
  * Created by rrn3194 on 4/13/16.
  */
object FunctionPowerEx {

  val list = List(11, 2, 6, 4)

  def main(args: Array[String]) {
    containsOdd(list)
  }

  def containsOdd(list: List[Int]): Boolean = {
    for (i <- list) {
      if (i % 2 == 1)
        return true;
    }
    return false;
  }
  println("list contains Odd ? " + containsOdd(list))

  //in short we can accomplish above functionality as below
//list.exists(_ % 2 == 1)
  val result = list.exists((x: Int) => x % 2 ==1)
  println("result= "+ result)

}

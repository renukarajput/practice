

object LongestNumber extends App{
//val arr=Array(0,2,5,0)
val arr=Array(0,0,0,0)
 val brr=largestNumber(arr);
  print(brr.mkString(" "));
  def largestNumber(A: Array[Int]): String  = {
    if (A.forall(_ == 0)) {
      print("--if--")
      "0"
    }
    else {
      A.map(_.toString).sortWith {
        case (l, r) => {
          val ll = l + r
          val rr = r + l
          rr > ll
        }
      }.reverse.mkString("")
    }
  }
}


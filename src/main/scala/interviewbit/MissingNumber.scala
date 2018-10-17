package interviewbit

object MissingNumber extends App {
  private val arr = Array(1, 2, 3)
  val missingNumber=firstMissingPositive(arr);
  println(missingNumber)
  def firstMissingPositive(A: Array[Int]): Int  = {
    val len = A.length
    val buff = Array.ofDim[Int](len)
    A.foreach(ai => if (ai > 0 && ai <= len) buff(ai - 1) = buff(ai - 1) + 1)

    for {
      i <- buff.indices
      ai = buff(i)
      if ai == 0
    } return i + 1
    len + 1
  }
}


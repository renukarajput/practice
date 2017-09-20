package scala.scala99

/**
  * Created by rrn3194 on 5/17/16.
  */
class GCD {

  def gcdRByecursion(m : Int,n : Int) : Int ={
    if ((m % n) == 0)
      return n;
    else
      return gcdRByecursion(n, m % n);
  }

  def gcd(m : Int, n : Int) : Int = {
    if(m == n)
      return m;
    else if (m > n)
      return gcd(m-n, n);
    else
      return gcd(m, n-m);
  }
}

object GCDTest{
  def main(args: Array[String]) {
    val res = new GCD().gcdRByecursion(468,24)
    println(res)
    val result = new GCD().gcd(4,12);
    println(result)
  }
}

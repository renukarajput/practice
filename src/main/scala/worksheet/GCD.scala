package worksheet

class GCD {
  def gcd(a: Long, b: Long): Long = if (b == 0) a else gcd(b, a % b)
}

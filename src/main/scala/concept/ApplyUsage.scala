package scala.concept

/**
  * Created by rrn3194 on 4/13/16.
  */
  case class UsageOfApply(no : Int) {
    def apply(i : Int): Int = {
      no + i
    }
  }

  object UsageOfApply{
    def main(args: Array[String]) {
      val obj = UsageOfApply(5)
      println("output : "+obj(5))
    }
  }

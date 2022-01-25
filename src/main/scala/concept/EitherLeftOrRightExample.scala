package scala.concept

/**
  * Created by rrn3194 on 4/13/16.
  */
object EitherLeftOrRightExample {
    /**
      * A simple method to demonstrate how to declare that a method returns an Either,
      * and code that returns a Left or Right.
      */
    def divideXByY(x: Int, y: Int): Either[String, Int] = {
      if (y == 0) Left("Can't divide by 0")
      else Right(x/y)
    }
    // a few different ways to use Either, Left, and Right

  def main(args: Array[String]) {
    println(divideXByY(1, 0))
    println(divideXByY(1, 1))

    divideXByY(1, 0) match {
      case Left(s) => println("Answer: " + s)
      case Right(i) => println("Answer: " + i)
    }
  }
}

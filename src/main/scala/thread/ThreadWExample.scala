package scala.thread

/**
  * Created by rrn3194 on 4/13/16.
  */
object ThreadExample {
  def main(args: Array[String]) {
    for (i <- 1 to 6) {
      val thread = new Thread {
        override def run: Unit = {
          print(i + " , ")
        }
      }
      thread.start
      Thread.sleep(200)
    }
  }
}

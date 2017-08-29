package com.scala.thread

/**
  * Created by rrn3194 on 4/13/16.
  */

// thread using runnable
class MyThread extends Runnable {
    def run {
      for (i <- 0 to 6) {
        print((i + 1) + " ,")
        Thread.sleep(200)
      }
    }
}

object RunThread{
  def main(args: Array[String]) {
    new Thread(new MyThread).start
  }
}

package concept.scala_tour

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object FutureTest extends App{

  val tasks: Seq[Future[Int]] = for (i <- 1 to 10) yield Future {
    println("Executing task " + i)
    Thread.sleep(i * 1000L)
    i * i
  }
  val aggregated: Future[Seq[Int]] = Future.sequence(tasks)
  val squares: Seq[Int] = Await.result(aggregated, 15.seconds)
  println("Squares: " + squares)
}

/*
class MyActor extends Actor {
  def receive = {
    case "test" => println("received test")
    case _ =>      println("received unknown message")
  }}

val myActor = Actor.actorOf[MyActor]
myActor.start
*/

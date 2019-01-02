package scala.inheritance

/**
  * Created by rrn3194 on 4/7/16.
  */
class Mammal extends Animal with Dog{

  override def eat(): Unit = println("animal eats food")

  override def travel(): Unit = println("animal travels/runs")

  override def getNoOfLegs(): Int = 4

  override def getNameOFAnimal: Unit ={
    println("in mammal class getNameOfAnimal method")
  }
}

object Mammal {
  val str = "hello"
  def main(args: Array[String]) {
    val mammal = new Mammal
    mammal.eat
    mammal.travel
    println(mammal.getNoOfLegs())
    println(str) //way to call singleton object <Mammal.str>
    val list = List("hello", "World", "Are", "you", "there")
    println(list.map(x => x.concat("$$")))
    println(list.flatMap(x => x.concat("**")))
  }
}

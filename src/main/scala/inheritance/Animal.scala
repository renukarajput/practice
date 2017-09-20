package scala.inheritance

/**
  * Created by rrn3194 on 4/7/16.
  */
trait Animal {
  def eat() : Unit
  def travel() : Unit
  def getNoOfLegs() : Int
  def getNameOfAnimal: Unit ={
    println("getting name of animal")
  }
}

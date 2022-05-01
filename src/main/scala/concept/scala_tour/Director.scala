package concept.scala_tour

case class Director(firstName: String, lastName: String, yearOfBirth: Int) {
  def name: String = s"$firstName $lastName"
}

object Director {
  def older(director1: Director, director2: Director): Director =
    if (director1.yearOfBirth < director2.yearOfBirth) director1 else director2
}

object Test extends App {
  private val director1 = Director("renuka", "rajput", 2000)
  private val director2 = Director("rakesh", "kumar", 1999)
  private val dir: Director = director1.copy()
  println("+++++++ "+ dir)
  println(Director.older(director1, director2).name)
  println(director1.copy(director2.firstName, director2.lastName, director2.yearOfBirth).name)
}
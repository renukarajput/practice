package scala99

// this Union Type class is for Generic Map Addition
trait Union[A,B]{
  def union(val1:Map[A,B], val2:Map[A,B]):Map[A,B]
}

object integerAdditionImplicit extends Union[String,Int] {
  override def union(val1: Map[String, Int], val2: Map[String, Int]): Map[String, Int] = {
    val1.foldLeft(val2){(secondMap, mapVal) =>
      secondMap.+(mapVal._1 -> (secondMap.getOrElse(mapVal._1,0)+mapVal._2))
    }
  }
}

object StringAdditionImplicit extends Union[String,String] {
  override def union(val1: Map[String, String], val2: Map[String, String]): Map[String, String] = {
    val1.foldLeft(val2){(secondMap, mapVal) =>
      secondMap.+(mapVal._1 -> (secondMap.getOrElse(mapVal._1,"")+mapVal._2))
    }
  }
}

// this UnionOf Type class is for Generic Any type Addition
trait UnionOf[A]{
  def add(val1:A, val2:A) :A
}

object UnionOf {

  implicit object IntAdd extends UnionOf[Int] {
    override def add(val1: Int, val2: Int): Int = {
      val1 + val2
    }
  }

  implicit object StringAdd extends UnionOf[String] {
    override def add(val1: String, val2: String): String = {
      val1.concat(val2)
    }
  }

  implicit object SetAdd extends UnionOf[Set[Int]] {
    override def add(val1: Set[Int], val2: Set[Int]): Set[Int] = {
      val1.foldLeft(val2) { (secondSet, setVal) => secondSet + setVal }
    }
  }

  implicit object MapAdd extends UnionOf[Map[Char, Int]] {
    override def add(val1: Map[Char, Int], val2: Map[Char, Int]): Map[Char, Int] = {
      val1.foldLeft(val2) { (secondMap, mapVal) =>
        secondMap.+(mapVal._1 -> (secondMap.getOrElse(mapVal._1, 0) + mapVal._2))
      }
    }
  }

}


object Addition{
  def apply[A](v1:A,v2:A)(implicit unionOf: UnionOf[A])={
    unionOf.add(v1,v2)
  }
}

object UnionUsingTypeClasses extends App{
  import UnionOf._
  val set1 = Set(1, 2, 3)
  val set2 = Set(4, 5, 6, 1)

  val map1 = Map('a'-> 1, 'b' -> 2, 'c' -> 6)
  val map2 = Map('a'-> 2, 'b' -> 4)

  def setAddition={
    Addition(set1,set2)
  }
  println(setAddition)

  def mapAddition ={
    Addition(map1,map2)
  }
  println(mapAddition)

  def stringAddition ={
    Addition("Nil","esh")
  }
  println(stringAddition)

  def intAddition ={
    Addition(23,10)
  }
  println(intAddition)


}
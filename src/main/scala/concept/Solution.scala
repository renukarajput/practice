package concept

sealed trait Department

case object IT extends Department

case object QA extends Department

case object ADMIN extends Department

object Solution extends App {
    val mapA = Map(IT -> 2000.0, QA -> 1000.0, ADMIN -> 3000.0)
    val mapB = Map(IT -> 1000.0, QA -> 1000.0, ADMIN -> 3000.0)
    val mapC = Map(QA -> 2000.0, ADMIN -> 3000.0)
    var result = Map[Department, Double]()

    def groupBy() {
      mapA.foreach(k => result += (k._1 -> (result.getOrElse(k._1, 0.0) + k._2)))
      mapB.foreach(k => result += (k._1 -> (result.getOrElse(k._1, 0.0) + k._2)))
      mapC.foreach(k => result += (k._1 -> (result.getOrElse(k._1, 0.0) + k._2)))
    mapA.groupBy(k => k._1)
    }

    groupBy()
    print("++++++ "+ result)
}


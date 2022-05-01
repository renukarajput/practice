package scala99

object ListOps {
  def main(args: Array[String]): Unit = {
    val list1 = List(Emp(1,"john"), Emp(2,"jenny"), Emp(3,"smith"))
    val list2 = List(Emp(4,"yali"), Emp(5,"jeff"), Emp(3,"jonny"))

    list1.map(x => x).filter(x => x.id == 3).map(x => (x.name = list2.find(_.id == 3).get.name))
    val res: Seq[Emp] = list1.filterNot(x => list2.exists(_.id == x.id))

    println("list1 = "+ list1)
    println("list3 =  "+ res)
  }
}

case class Emp(val id:Int, var name:String)
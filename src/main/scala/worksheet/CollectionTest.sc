case class Emp(val id:Int, var name:String)

val list1 = List(Emp(1,"john"), Emp(2,"jenny"), Emp(3,"smith"))
val list2 = List(Emp(4,"yali"), Emp(5,"jeff"), Emp(3,"jonny"))

val findOp = list2.find(_.id == 3).get

val mapOp = list2.map(_.id == 3)

val mapOp1 = list1.map(_.id * 2)

val filterOp = list1.filter(_.id == 3)

val filterNotOp = list1.filterNot(x => list2.exists(_.id == x.id))

val filterAndMap = list1.filter(x => x.id == 3).map(x => (x.name = list2.find(_.id == 3).get.name))

print(list1)

val existOp = list1.exists(a => a.name == "john")  // list1.exists(_.name = "")

list1.filter(a => a.id == 1)

list1.filterNot(a => a.id == 1) // list.filterNot(_.id == 1)

list1.map(a => a).filter(a => a.id == 3) // this is equivalent to filter

val concatList = list1.++(list2) // merge two lists

val countrySet = Set("Spain", "Germany", "Italy", "France", "United Kingdom")

val countryList = List("Netherlands", "Germany", "Sweden" ,"United Kingdom", "Ireland")

val res = countryList.filter(countrySet)

val result = countryList.filterNot(countrySet)

val numbers = List(1,2,3,4,5)

val foldOp = numbers.fold(0)((z,i) => z+i )
val foldOp1 = numbers.fold(0)(_+_)

val foldLeftOp = numbers.foldLeft(List[Int]())((a, b) => b :: a)

val foldRightOp = numbers.foldRight(List[Int]())((a, b) => a :: a :: b)

val forEachOp: Unit = numbers.foreach(x => (x+1))

val x = numbers.map(x => x+1)




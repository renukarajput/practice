import scala.annotation.tailrec

val a = List(1, 2, 3)
val b = List(4, 5, 6)

//Val c= 4 5 6 8 10 12 12 15 18

a.map(i => (b.map(j => i * j))).flatten

val output = a.flatMap(i => (b.map(j => i * j)))

output.filter(i => i % 2==0)

def multiply(a: Int, b:Int) = {a*b}

a.foldLeft(1)(multiply(_ ,_))

a.zip(b)

def reverseHelper1(list : List[Int]) : Int = {
  @tailrec
  def sum(list : List[Int], total:Int):Int = list match {
    case Nil => total
    case h::tail => sum(tail, total+h)
  }
  sum(list,0)
}

def reverse(list : List[Int]) = {
  reverseHelper1(list)
}

val aa = List(1, 2, 3, 4, 5)
reverse(aa)

a.reduceRight(_+_)

a.take(3)

// partially applied function
def plus(a: Int)(b: Int) = a + b
def plus2 = plus(2)(_)
val result = plus2(3)

//curried function
def add(x: Int, y: Int) = x + y
val addFunction: (Int, Int) => Int = add _
val curriedFunction = (add _).curried
curriedFunction(20)(30)

val res = a.reduce((acc, sum) => acc+sum)

a.:::(List(4,5))

(List(4,5)).:::(a)
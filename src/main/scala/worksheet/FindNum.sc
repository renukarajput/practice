
def findNum = {
  for(i <- 0 to 9; j <- 0 to 9){
    if(Math.pow(i, j) == (j * 10 + i)) println("The num is: " + (j*10 + i))
  }
}

findNum

def sad = "meow"
val cat = sad
println(cat)

val arr: Array[Int] = Array(10, 20,30)
arr.update(1,5)
for (x <- arr) {
  println(x)
}
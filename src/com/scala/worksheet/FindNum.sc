
def findNum = {
  for(i <- 0 to 9; j <- 0 to 9){
    if(Math.pow(i, j) == (j * 10 + i)) println("The num is: " + (j*10 + i))
  }
}

findNum


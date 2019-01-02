package interviewbit.backtracking



class Permutation {
  def permute(A: Array[Int]): Array[Array[Int]]  = {

    def permute(A: Array[Int], acc: Array[Array[Int]]): Array[Array[Int]]  = {

      if(A.length == 0) Array[Array[Int]]()
      else if(A.length == 1)  Array[Array[Int]](A)
      else {
        var result = acc
        for(i <- 0 until A.length) {
          //fix position i at head
          //split at i
          val (left, right) = A.splitAt(i)
          val shiftedA = (right(0) +: left) ++ right.drop(1)
          val fixElm = shiftedA.head
          val remPerms = permute(shiftedA.tail, acc)
          val perms = remPerms.map(e =>  e :+ fixElm)
          result = result ++ perms
        }
        result
      }
    }
    permute(A, Array[Array[Int]]())
  }
}


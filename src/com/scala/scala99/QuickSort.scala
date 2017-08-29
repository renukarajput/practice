package com.scala.scala99


object QuickSort extends App{
  def small(p:Int, xs:List[Int]): List[Int]= xs.filter(e => e < p)

  def large(p:Int, xs:List[Int]): List[Int]= xs.filter(e => e > p)

  def qs(list:List[Int]): List[Int]=
    if(list.isEmpty)
      List()
    else
      qs(small(list.head, list.tail)) ++ List(list.head) ++ qs(large(list.head,list.tail))

  val list: List[Int] = List(2,5,3,6,8,2,1,7,4,0)
  println(qs(list))
}


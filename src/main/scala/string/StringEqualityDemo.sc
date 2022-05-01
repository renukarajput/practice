
val s1 = "Hello"
val s2 = new String("HellO")
s1 == s2
s1.equals(s2)




val abcd = Seq('a', 'b', 'c', 'd')
val efgj = Seq('e', 'f', 'g', 'h')
val alphabet = Seq(abcd, efgj)
val alphabet1 = List(abcd, efgj)
alphabet.flatten

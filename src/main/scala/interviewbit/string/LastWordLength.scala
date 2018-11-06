package interviewbit.string

class LastWordLength {
  def lengthOfLastWord(s: String): Int  =
    s.foldRight(0, false) { case (c, (len, inWord)) =>
      if (c == ' ' && inWord) return len
      else if (c == ' ') (len, false)
      else if (inWord) (len + 1, true)
      else (1, true)
    }._1
}


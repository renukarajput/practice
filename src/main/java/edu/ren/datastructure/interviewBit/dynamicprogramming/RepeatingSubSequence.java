package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class RepeatingSubSequence {
    boolean isRepeating(String str) {
        return isRepeating(str.toCharArray());
    }

    boolean isRepeating(char[] str) {
        for (int startOfSeq = 0; startOfSeq < str.length - 2; startOfSeq++) {
            for (int startOfRepeatSeq = startOfSeq + 1; startOfRepeatSeq < str.length - 1; startOfRepeatSeq++) {
                if (str[startOfRepeatSeq] == str[startOfSeq]) {
                    for (int nextCharInSeq = startOfSeq + 1; nextCharInSeq < str.length; nextCharInSeq++) {
                        for (int nextCharInRepeatSeq = startOfRepeatSeq + 1; nextCharInRepeatSeq < str.length; nextCharInRepeatSeq++) {
                            if (nextCharInRepeatSeq != nextCharInSeq && str[nextCharInSeq] == str[nextCharInRepeatSeq]) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

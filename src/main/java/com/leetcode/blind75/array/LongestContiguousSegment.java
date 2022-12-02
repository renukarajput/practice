package com.leetcode.blind75.array;

//https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
//relevant -> https://leetcode.com/problems/max-consecutive-ones/submissions/
//relevant -> https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
public class LongestContiguousSegment {

    public boolean checkZeroOnes(String str) {
        int countOfZero = 0;
        int countOfOne = 0;
        int maxCountZero = -1;
        int maxCountOne = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') { //1100,  1101 : 1=2, 0=1
                countOfOne++;
                maxCountZero = Math.max(countOfZero, maxCountZero);
                countOfZero = 0;
            } else {
                countOfZero++;
                maxCountOne = Math.max(countOfOne, maxCountOne);//2
                countOfOne = 0;
            }
        }
        maxCountZero = Math.max(countOfZero, maxCountZero);
        maxCountOne = Math.max(countOfOne, maxCountOne);
        System.out.println(" 1s = " + maxCountOne +" 0s " + maxCountZero);

        return maxCountOne > maxCountZero ? true : false;
    }
}

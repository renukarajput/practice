package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class RepeatingSubSequence2 extends RepeatingSubSequence {
    @Override
    boolean isRepeating(char[] str) {
        return maxRepeatingSeqLength(str, 0, 0) > 1;
    }

    //ab
    //aa
    //abab
    int maxRepeatingSeqLength(char[] arr, int i, int j) {
        if (i == arr.length-1 || j == arr.length-1) {
           // System.out.println(i+" "+j+"  "+arr[i] +" "+arr[j]);
            if (arr[i] == arr[j] && i != j) {
                return 1;
            }
            return 0;
        }
       // System.out.println(i+" "+j+"  "+arr[i] +" "+arr[j]);

        if (arr[i] == arr[j] && i != j) {
            return 1 + maxRepeatingSeqLength(arr, i + 1, j + 1);
        }

        return Math.max(maxRepeatingSeqLength(arr, i, j + 1), maxRepeatingSeqLength(arr, i+1, j));
    }
}

package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;

public class RegexMatch {

    boolean isMatch(String one, String two) {
        return isMatch(one.toCharArray(), two.toCharArray());
    }

    boolean isMatch(char[] one, char[] two) {
        int[][] resultCache = new int[one.length + 1][two.length + 1];
        for (int[] row : resultCache) {
            Arrays.fill(row, -1);
        }
        return isMatch(one, 0, two, 0, resultCache) == 1;
    }
    //abcdefg
    //*g

    //abgcefg
    //*g

    int isMatch(char[] word, int i, char[] pattern, int j, int[][] resultCache) {
        if (word.length - 1 == i && pattern.length - 1 == j) {
            if (word[i] == pattern[j] || pattern[j] == '?' || pattern[j] == '*') {
                return 1;
            }
            return 0;
        }
        if(i>word.length-1 ){
            if(j<pattern.length  && pattern[j]!='*') {
                return 0;
            }
            if(j==pattern.length-1){
                return 1;
            }
            return isMatch(word,i,pattern,j+1,resultCache);
        }
   
//        System.out.println("i= " + i + " j= " + j + " " + word[i] + " " + pattern[j]);
        if (word.length == i || pattern.length == j) {
            return 0;
        }
        if (pattern[j] == '*') {
            int matchStar = isMatch(word, i + 1, pattern, j, resultCache);
            int matchNextOfStar = isMatch(word, i, pattern, j + 1, resultCache);
            if (matchStar == 1 || matchNextOfStar == 1) {
                return 1;
            }
            return 0;
        }

        if (word[i] == pattern[j] || pattern[j] == '?') {
            return isMatch(word, i + 1, pattern, j + 1, resultCache);
        } else {
            return 0;
        }

    }
}

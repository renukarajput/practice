package edu.leetcode.dp;

public class MinStepsToStringsEquality {
    public int minDistance(String word1, String word2) {
        return minDistance(word1,word2,0,0);
    }
    public int minDistance(String word1, String word2,int idx1,int idx2) {
        if(idx1==word1.length()){
            return word2.length()-idx2;
        }
        if(idx2==word2.length()){
            return word1.length()-idx1;
        }
        if(word1.charAt(idx1)!=word2.charAt(idx2)){
            return 1+Math.min(minDistance(word1,word2,idx1+1,idx2),
                    minDistance(word1,word2,idx1,idx2+1));
        }
        return minDistance(word1,word2,idx1+1,idx2+1);
    }
}


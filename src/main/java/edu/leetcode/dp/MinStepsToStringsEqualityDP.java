package edu.leetcode.dp;

public class MinStepsToStringsEqualityDP extends MinStepsToStringsEquality {
    @Override
    public int minDistance(String word1, String word2) {
        if(word1.length()==0)
            return word2.length();
        if(word2.length()==0)
            return word1.length();
        int[][] editDistance = new int[word1.length()+1][word2.length()+1];
        editDistance[0][0] = 0;
        for (int i = 0; i <= word1.length(); i++) {
            editDistance[i][0] = i;
        }
        for (int i = 0; i <= word2.length(); i++) {
            editDistance[0][i] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {

                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    editDistance[i][j] = editDistance[i - 1][j - 1];

                } else {
                    editDistance[i][j] = 1 + Math.min(editDistance[i - 1][j], editDistance[i][j - 1]);
                }
            }


        }
        return editDistance[word1.length()][word2.length()];
    }
}

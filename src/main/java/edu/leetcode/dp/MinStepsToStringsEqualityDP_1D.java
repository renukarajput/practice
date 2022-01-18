package edu.leetcode.dp;

public class MinStepsToStringsEqualityDP_1D extends MinStepsToStringsEquality {
    @Override
    public int minDistance(String word1, String word2) {
        if(word1.length()==0)
            return word2.length();
        if(word2.length()==0)
            return word1.length();
        int[][] editDistance = new int[2][word2.length()+1];
        editDistance[0][0] = 0;
        editDistance[1][0]=1;
        for (int i = 0; i <= word2.length(); i++) {
            editDistance[0][i] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {

                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    editDistance[i%2][j] = editDistance[(i - 1)%2][j - 1];

                } else {
                    editDistance[i%2][j] = 1 + Math.min(editDistance[(i - 1)%2][j], editDistance[i%2][j - 1]);
                }
            }


        }
        return editDistance[word1.length()%2][word2.length()];
    }
}

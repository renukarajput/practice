package edu.ren.hackerrank.dp;

public class StringAbbreviationDP extends StringAbbreviation {

    // a /B
    @Override
    boolean isFeasible(String first, String second) {
        return isFeasible(first.toCharArray(), second.toCharArray());

    }

    boolean isFeasible(char[] first, char[] second) {
        boolean[][] result = new boolean[first.length + 1][second.length + 1];
        result[0][0] = true;

        for (int i = 1; i <=first.length ; i++) {
            if(Character.isLowerCase(first[i-1])){
                result[i][0]=true;
            }else {
                break;
            }
        }
        for (int i = 1; i <= first.length; i++) {
            for (int j = 1; j <= second.length; j++) {

                if (first[i - 1] == second[j - 1]) {
                    result[i][j] = result[i - 1][j - 1];
                } else if (Character.toUpperCase(first[i - 1]) == second[j - 1]) {
                    result[i][j] = result[i - 1][j - 1] || result[i - 1][j];
                    result[i][j] = true;
                } else if (Character.isLowerCase(first[i - 1])) {
                    result[i][j] = result[i - 1][j];
                }
            }
        }
        return result[first.length][second.length];
    }
}

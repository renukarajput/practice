package edu.ren.hackerrank.dp;

//AaBC //ABC
public class StringAbbreviation {
    boolean isFeasible(String first, String second) {
        int i = first.length() - 1, j = second.length() - 1;
        return isFeasible(first.toCharArray(), i, second.toCharArray(), j);
    }

    boolean isFeasible(char[] first, int i, char[] second, int j) {
        if (i == 0 && j == 0 && Character.toUpperCase(first[i]) == second[j]) {
            return true;
        }
        if (i < 0 || j < 0) {
            return false;
        }
        if (second[j] == first[i]) {
            return isFeasible(first, i - 1, second, j - 1);
        }
        if (Character.toUpperCase(first[i]) == second[j]) {
            return isFeasible(first, i - 1, second, j - 1)||isFeasible(first,i-1,second,j);
        }
        return isFeasible(first, i - 1, second, j);
    }
}

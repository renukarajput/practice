package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class IsInterleavingOfTwoString {
    boolean matches(String one, String two, String pattern) {
        return matches(one.toCharArray(), 0, two.toCharArray(), 0, pattern.toCharArray(), 0);
    }

    boolean matches(char[] one, int i, char[] two, int j, char[] pattern, int k) {
        if (k == pattern.length) {
            return true;
        }

        if (i < one.length && pattern[k] == one[i]) {
            return matches(one, i + 1, two, j, pattern, k + 1);
        }
        
        if (j < two.length && pattern[k] == two[j]) {
            return matches(one, i, two, j + 1, pattern, k + 1);
        }
        return false;
    }
}

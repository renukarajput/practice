package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class IsInterleavingOfTwoString {

    public boolean matches(String one, String two, String pattern) {
        if (one.length() + two.length() != pattern.length()) {
            return false;
        }
        return matches(one.toCharArray(), two.toCharArray(), pattern.toCharArray());
    }

    protected boolean matches(char[] one, char[] two, char[] pattern) {
        return matches(one, 0, two, 0, pattern, 0);
    }

    private boolean matches(char[] one, int i, char[] two, int j, char[] pattern, int k) {
        if (k == pattern.length) {
            return true;
        }
        if (i < one.length && j < two.length && pattern[k] == one[i] && pattern[k] == two[j]) {
            return matches(one, i + 1, two, j, pattern, k + 1) || matches(one, i, two, j + 1, pattern, k + 1);
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

package edu.leetcode.misc;

public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        int diff = s.length() - t.length();
        if (diff < -1 || diff > 1) {
            return false;
        }
        if (s.length() == 0 || t.length() == 0) {
            return !s.equals(t);
        }
        boolean edited = false;
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) {
                if (edited) {
                    return false;
                }
                edited = true;
                if (diff < 0) {
                    j++;
                    continue;
                }
                if (diff == 0) {
                    i++;
                    j++;
                } else {
                    i++;
                }

            } else {
                i++;
                j++;
            }
        }

        if (i != s.length() || j != t.length()) {
            edited = !edited;
        }

        return edited;
    }
}

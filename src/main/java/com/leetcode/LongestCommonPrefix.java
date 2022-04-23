package com.leetcode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] arr) {
        String str = arr[0];
        for (int i = 1; i < arr.length; i++) {
            str = getPrefix(str, arr[i]);
            if (str.isEmpty()) return str;
        }
        return str;
    }

    String getPrefix(String s1, String s2) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < Math.min(s1.length(),s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                prefix.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return prefix.toString();
    }
}

package com.leetcode;

public class Subsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")==true);
        System.out.println(isSubsequence("axc", "ahbgdc")==false);
        System.out.println(isSubsequence("acb", "ahbgdc")==false);
        System.out.println(isSubsequence("aec", "abcde")==false);
        System.out.println(isSubsequence("", "abcde")==true);
        System.out.println(isSubsequence("b", "abcde")==true);
        System.out.println(isSubsequence("f", "abcde")==false);
        System.out.println(isSubsequence("abc", "")==false);
    }

    public static boolean isSubsequence(String s, String t) {
        int idx = 0;
        int i = 0;
        int len = t.length();
        if (s.isEmpty()) return true;
        while (i != len) {
            if (s.length() == idx) break;
            if (s.charAt(idx) == t.charAt(i)) {
                idx++;
            }
            i++;
        }
        return idx == s.length();
    }
}

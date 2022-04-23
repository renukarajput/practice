package com.leetcode;

//aabbbeecccccd
public class LongestContinuousRepeatingChar {
    //
    public String findLongestContinuousRepeatingSubstring(String str) { // baaa, aaab  aabbbccddddaaaaaa
        if (str.isEmpty() || str == null) return "";
        String res = "";
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) != str.charAt(i)) {
                sb = new StringBuilder();
            }
            sb.append(str.charAt(i));
        }
        if (sb.length() > res.length()){
            res=sb.toString();
        }
        return res;
    }
}

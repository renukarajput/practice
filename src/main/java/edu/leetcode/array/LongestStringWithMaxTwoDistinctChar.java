package edu.leetcode.array;

public class LongestStringWithMaxTwoDistinctChar {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int first = 0, second = 1;
        int maxLen = 2;
        for (int i = 2; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (ch != s.charAt(second) && ch != s.charAt(first)) {
                first++;
            }
            while (second < i && s.charAt(first) == s.charAt(second)) {
                second++;
            }
            maxLen = Math.max(i - first + 1, maxLen);
        }
        return maxLen;
    }
}

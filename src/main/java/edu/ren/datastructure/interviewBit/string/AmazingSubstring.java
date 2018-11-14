package edu.ren.datastructure.interviewBit.string;

// https://www.interviewbit.com/problems/amazing-subarrays/

public class AmazingSubstring {
    private static final char[] VOWELS = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

    private boolean isVowel(char ch){
        for (char v : VOWELS){
            if (ch == v)
                return true;
        }
        return false;
    }

    public int countOfSubstrings(String input) {
        int length = 0;
        String substring = "";
        input = input.replaceAll("\\W+", "");

        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                substring = input.substring(i);
                length += substring.length();
            }
        }
        if (length >= 10003)
            length = length % 10003;
        return length;
    }
}

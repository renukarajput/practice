package edu.ren.datastructure.interviewBit.string;

//https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/

public class MakePalindrome {

    public int charactersToMakePalindrome(String input) {
        input = input.toLowerCase();
        int length = input.length();
        int requiredCharCount = length;

        while (length > 1 && !isPalindrome(input, length)) {
            length--;
        }
        return requiredCharCount - length;
    }


    private boolean isPalindrome(String input, int length) {
        int start = 0, end = length - 1;
        while (start <= end && (input.charAt(start) == input.charAt(end))) {
            start++;
            end--;
        }
        if (start > end) {
            return true;
        }
        return false;
    }
}
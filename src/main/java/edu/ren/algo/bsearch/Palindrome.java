package edu.ren.algo.bsearch;

public class Palindrome {

    /**
     * returns minimum number of chars required to be inserted at BEGINNING to make the string a palindrome
     * inserts can only be done at start of string
     * @param input
     * @return
     */
    public int numberOfCharsRequired(String input) {
        char[] arr = input.toCharArray();
        int len = arr.length;
        return getNumberOfCharsToInsert(arr, 0, len - 1);
    }

    private int getNumberOfCharsToInsert(char[] str, int start, int end) {
        int count = 0, matchedCount = 0;
        while (end > start) {
            if (str[start] == str[end]) {
                start++;
                matchedCount++;
                end--;
            } else {
                if (str[end] == str[0]) {  //can make palindrome by 1 insert at beginning only if it's equal to 1st char
                    count++;
                } else {
                    count = str.length - end; //this substring has to be inserted at start
                    if (matchedCount > 0) {
                        start--;
                        matchedCount--;
                    }
                }
                end--;
            }
        }

        return count;
    }

    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start <= end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive palindrome
    public static boolean isStringPalindrome(String input, int start, int end) {

        if (start == end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        if (start < end)
            return isStringPalindrome(input, start + 1, end - 1);

        return true;
    }
}

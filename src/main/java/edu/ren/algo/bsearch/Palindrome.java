package edu.ren.algo.bsearch;

public class Palindrome {

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
}

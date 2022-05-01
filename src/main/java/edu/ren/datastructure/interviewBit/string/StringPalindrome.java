package edu.ren.datastructure.interviewBit.string;

//https://www.interviewbit.com/problems/palindrome-string/
public class StringPalindrome {

    public static int isPalindrome(String inputStr) {
        String input = inputStr.toLowerCase();
        int start = 0, end = input.length() - 1;

        while (start <= end) {
            if (!Character.isLetterOrDigit(input.charAt(end))) {
                end--;
                continue;
            }
            if (!Character.isLetterOrDigit(input.charAt(start))) {
                start++;
                continue;
            }
            if (input.charAt(start) == input.charAt(end)) {
                start++;
                end--;
            } else {
                return 0;
            }


        }
        return 1;
    }
}

package edu.ren.datastructure.interviewBit.string;


public class LastWordLength {
    public static int lengthOf1(String inputStr) {
        String input = inputStr.trim();
        String[] split = input.split(" ");
        String lastWord = split[split.length - 1];
        return lastWord.length();
    }

    public static int lengthOf(String inputStr) {
        int length = 0;
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            if (inputStr.charAt(i) != ' ') {
                length++;
                if (i > 0 && inputStr.charAt(i - 1) == ' ') {
                    break;
                }
            }
            /* else {//current char is space and right is letter
                if (i < inputStr.length()-1 && inputStr.charAt(i + 1) != ' ') {
                    break;
                }*/
        }
        return length;
    }
}

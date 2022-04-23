package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class MergeStrings {
    public static void main(String[] args) {
//        System.out.println(mergeAlternately("abc", "pqr"));
//        System.out.println(mergeAlternately("abc", "pqrs"));
//        System.out.println(mergeAlternately("abcde", "pqr"));
//        System.out.println(mergeAlternately("", ""));
//        System.out.println(mergeAlternately("", "pqr"));
        System.out.println(mergeAlternately("abc", ""));
//        System.out.println(reverseVowelsInString("hello"));
//        System.out.println(reverseVowelsInString("leetcode"));
        translate("hello world");
        translate("delicious apples");
        translate("Hello World");
    }

    private static String translate(String input) {
        final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int i =0;
        String result="";
        if (!vowels.contains(input.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            for (String s : input.split(" ")) {
                final char firstChar = s.charAt(0);
                if (!Character.isUpperCase(firstChar)) {
                    sb.append(convertToLatin(s, "ay")).append(" ");
                } else {
                    final String latin = convertToLatin(s.toLowerCase(), "ay");
                    final String[] arr = latin.split(" ");
                    final char upper = Character.toUpperCase(arr[0].charAt(0));
                    sb.append(upper).append(arr[0].substring(1)).append(" ");
                    i++;
                }
            }
            result = sb.toString().trim();
        } else {
            result = input + "ay";
        }
        System.out.println(result + "********");
        return  result;
    }

    private static String convertToLatin(String input, String suffix) {
        StringBuilder sb = new StringBuilder();
        sb.append(input.substring(1)).append(input.charAt(0)).append(suffix);
        return sb.toString();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0, k = 0;
        int length1 = word1.length();
        int length2 = word2.length();
        while (i < length1 && j < length2) {
            if (k % 2 == 0) {
                sb.append(word1.charAt(i));
                i++;
            } else {
                sb.append(word2.charAt(j));
                j++;
            }
            k++;
        }
        String word = null;
        int index = 0;
        if (i < length1) {
            word = word1;
            index = i;
        } else if (j < length2) {
            word = word2;
            index = j;
        }
        while (word != null && index < word.length()) {
            sb.append(word.charAt(index));
            k++;
            j++;
            index++;
        }

        return sb.toString();
    }

    //hello, leetcode
    public static String reverseVowelsInString(String str) {
        char[] input = str.toCharArray();
        final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int start = 0, end = input.length - 1;
        while (start < end) {
            if (!vowels.contains(input[start])) {
                start++;
            } else if (!vowels.contains(input[end])) {
                end--;
            } else {
                swap(input, start, end);
                start++;
                end--;
            }

        }
        return String.valueOf(input);
    }

    private static void swap(char[] input, int start, int end) {
        char temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }
}

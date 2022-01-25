package edu.ren.datastructure.interviewBit;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  Hello world  "));
    }
    //"a bc" " bc"
    public static int lengthOfLastWord(final String str1) {
       String str=str1.trim();
        int lastSpaceIndex = str.lastIndexOf(' ');
        return str.length()-lastSpaceIndex-1;
    }
}

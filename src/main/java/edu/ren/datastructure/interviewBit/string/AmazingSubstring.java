package edu.ren.datastructure.interviewBit.string;

public class AmazingSubstring {

    public int countOfSubstrings(String input) {
        int length = 0;
        String substring = "";
        input = input.replaceAll("\\W+", "");

        for (int i = 0; i < input.length(); i++) {
            if (Character.toUpperCase(input.charAt(i)) == 'A' || Character.toUpperCase(input.charAt(i)) == 'E' ||
                    Character.toUpperCase(input.charAt(i)) == 'I' || Character.toUpperCase(input.charAt(i)) == 'O' ||
                    Character.toUpperCase(input.charAt(i)) == 'U') {
                System.out.println("char = " + input.charAt(i));
                substring = input.substring(i);
                length += substring.length();
            }
        }
        length = length % 10003;
        return length;
    }
}

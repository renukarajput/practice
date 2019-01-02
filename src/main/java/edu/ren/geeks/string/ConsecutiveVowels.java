package edu.ren.geeks.string;

public class ConsecutiveVowels {

    public String removeConsecutiveVowels(String inputStr) {
        StringBuilder sb = new StringBuilder();
        sb.append(inputStr.charAt(0));
        for (int i = 1; i < inputStr.length(); i++) {
            if (!isVowel(inputStr.charAt(i - 1)) || !isVowel(inputStr.charAt(i))) {
                sb.append(inputStr.charAt(i));
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
package edu.leetcode.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
public class RemoveDigitsToMaximizeResult {

    public String removeDigit(String number, char digit) {
        List<String> digits = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String result = number.substring(0, i) + number.substring(i + 1);
                digits.add(result);
            }
        }
        Collections.sort(digits);
        System.out.println("list = " + digits);
        return digits.get(digits.size() - 1);
    }

    public String removeDigitApproach2(String s, char digit) {
        int n = s.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == digit) {
                String sub = s.substring(0, i) + s.substring(i + 1);
                if (sub.compareTo(res) > 0) {
                    res = sub;
                }
            }
        }
        return res;
    }
}

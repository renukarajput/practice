package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterPhone {
    static final Map<Character, String> keyPad = new HashMap<>();

    {
        keyPad.put('0', "0");
        keyPad.put('1', "1");
        keyPad.put('2', "abc");
        keyPad.put('3', "def");
        keyPad.put('4', "ghi");
        keyPad.put('5', "jkl");
        keyPad.put('6', "mno");
        keyPad.put('7', "pqrs");
        keyPad.put('8', "tuv");
        keyPad.put('9', "wxyz");
    }

    List<String> getLetters(String number) {
        List<String> result = new ArrayList<>();
        getLetters(number.toCharArray(), 0, result, new StringBuilder());
        return result;
    }

    private void getLetters(char[] number, int index, List<String> result, StringBuilder current) {
        for (int i = index; i < number.length; i++) {
            char key = number[i];
            char[] chars = keyPad.get(key).toCharArray();
            for (char ch : chars) {
                current.append(ch);
                getLetters(number, i + 1, result, current);
                if (current.length() == number.length) {
                    result.add(current.toString());
                }
                current.deleteCharAt(current.length() - 1);
            }

        }
    }
}

package edu.leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombination {
    private List<String> result = new ArrayList();
   static Map<Character,String> map = new HashMap<>();
   static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
//    Map<Character,String> map = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) {
            return result;
        }
        backtrack(0, new StringBuilder(), digits);
        return result;
    }

    private void backtrack(int index, StringBuilder path, String digits) {
        if(digits.length() == index){
            result.add(path.toString());
            return;
        }

        String possibleLetters = map.get(digits.charAt(index));
        for(char ch : possibleLetters.toCharArray()) {
            path.append(ch);
            backtrack(index+1, path, digits);
            path.deleteCharAt(path.length()-1);
        }
    }
}

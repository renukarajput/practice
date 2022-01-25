package edu.leetcode.backtracking;

import java.util.*;

public class PalindromePermutationv2 extends PalindromePermutation {
    @Override
    public List<String> generatePalindromes(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer count = charCountMap.getOrDefault(s.charAt(i), 0);
            charCountMap.put(s.charAt(i), count + 1);
        }
        int numberOfOdds = 0;
        for (char key : charCountMap.keySet()) {
            if (charCountMap.get(key) % 2 != 0) {
                numberOfOdds++;
            }
        }
        boolean isPalindrome= (s.length() % 2 == 0 && numberOfOdds == 0) || (s.length() % 2 != 0 && numberOfOdds == 1);
        if(!isPalindrome)
            return Collections.emptyList();
        ArrayList<String> permutations = new ArrayList<>();
        generatePalindromes(s.toCharArray(), 0, s.length() - 1, charCountMap, permutations);
        return permutations;
    }

    void generatePalindromes(char[] s, int start, int end, Map<Character, Integer> charCountMap, List<String> permutations) {

        if (start > end) {
            for (Character ch : charCountMap.keySet()) {
                if (charCountMap.get(ch) > 0) {
                    return;
                }
            }
            permutations.add(new String(s));
            return;
        }

        for (Character ch : charCountMap.keySet()) {
            Integer count = charCountMap.get(ch);
            if(count==0)
                continue;
            int usedCount;
            if (count == 1) {
                    s[s.length / 2] = ch;
                usedCount = (start == end) ? 2 : 1;
            } else {
                s[start] = ch;
                s[end] = ch;
                usedCount = 2;
            }

            charCountMap.put(ch, count - usedCount);
            generatePalindromes(s, start + usedCount-1, end - usedCount+1, charCountMap, permutations);
            charCountMap.put(ch, count);
        }
    }
}

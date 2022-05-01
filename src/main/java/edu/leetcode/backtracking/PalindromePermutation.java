package edu.leetcode.backtracking;

import java.util.*;

public class PalindromePermutation {
    boolean canPermutePalindrome(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer count = charCount.getOrDefault(s.charAt(i), 0);
            charCount.put(s.charAt(i), count + 1);
        }
        int numberOfOdds = 0;
        for (char key : charCount.keySet()) {
            if (charCount.get(key) % 2 != 0) {
                numberOfOdds++;
            }
        }
        return (s.length() % 2 == 0 && numberOfOdds == 0) || (s.length() % 2 != 0 && numberOfOdds == 1);

    }

    public List<String> generatePalindromes(String s) {
        Set<String> permutations = new HashSet<>();
        canPermutePalindrome(s.toCharArray(), 0, permutations);
        return new ArrayList<>(permutations);
    }

    private void canPermutePalindrome(char[] s, int startIndex, Set<String> permutations) {

        if (isPalindrome(s)) {
            permutations.add(new String(s));
            return;
        }

        if (startIndex > s.length - 1)
            return;

        for (int i = 0; i < s.length; i++) {
            swap(s, i, startIndex);
            canPermutePalindrome(s, startIndex + 1, permutations);
            swap(s, startIndex, i);
        }
    }

    void swap(char[] s, int i, int j) {
        char temp = s[j];
        s[j] = s[i];
        s[i] = temp;
    }

    boolean isPalindrome(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            if (s[i] != s[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}

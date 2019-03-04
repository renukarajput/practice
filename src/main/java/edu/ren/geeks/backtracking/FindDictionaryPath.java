package edu.ren.geeks.backtracking;

import java.util.Arrays;
import java.util.Set;

public class FindDictionaryPath {
    /**
     * You are given 2 words with equal number of characters. Find an algorithm to go from first word to second word,
     * changing one character at each step, in such a way that each intermediate word exist in a given dictionary.
     * Example:
     * Words are pit, map. A possible solution:
     * pit, pot, pet, met, mat, map
     *
     * @param wordOne
     * @param wordTwo
     * @param dictionary
     */
    void path(String wordOne, String wordTwo, Set<String> dictionary) {

    }

    boolean path(char[] wordOne, char[] wordTwo, int index, Set<String> dictionary) {

        if (index == 0) {
            return Arrays.equals(wordOne, wordTwo);
        }
        for (char i = 'a'; i < 'z'; i++) {
            if (wordOne[index] == i)
                continue;
            char temp = wordOne[index];
            wordOne[index] = i;
            if (dictionary.contains(new String(wordOne)) && path(wordOne, wordTwo, index - 1, dictionary)) {
                return true;
            } else {
                wordOne[index] = temp;
            }
        }
        return false;
    }
}

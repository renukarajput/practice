package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Set;

public class WordBreakDP extends WordBreak {
    @Override
    boolean isBreakFeasible(String word, Set<String> dictionary) {
        boolean[] result = new boolean[word.length() + 1];
        for (int i = 1; i <= word.length(); i++) {
            if (result[i] == false && dictionary.contains(word.substring(0, i))) {
                result[i] = true;
            }
            if (result[i] == true) {

                if (i == word.length()) {
                    return true;
                }

                for (int j = i + 1; j <= word.length(); j++) {
                    if (result[j] == false && dictionary.contains(word.substring(i, j))) {
                        result[j] = true;
                    }
                    if (result[j] == true &&j == word.length()){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

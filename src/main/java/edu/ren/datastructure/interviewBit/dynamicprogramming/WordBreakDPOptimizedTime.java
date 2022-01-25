package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WordBreakDPOptimizedTime extends WordBreakDP {
    @Override
    boolean isBreakFeasible(String word, Set<String> dictionary) {
        boolean[] result = new boolean[word.length()];
        List<Integer> toMatchIndexList = new ArrayList<>(result.length);
        toMatchIndexList.add(-1);
        for (int i = 0; i < word.length(); i++) {

            for (int j = toMatchIndexList.size() - 1; j >= 0; j--) {
                int matchIndex = toMatchIndexList.get(j);
                String subWord = word.substring(matchIndex + 1, i + 1);
                if (dictionary.contains(subWord)) {
                    toMatchIndexList.add(i);
                    result[i] = true;
                    break;
                }
            }

        }
        return result[word.length() - 1];
    }
}

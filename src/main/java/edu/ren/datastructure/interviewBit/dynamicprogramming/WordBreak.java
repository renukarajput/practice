package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Set;

public class WordBreak {

    boolean isBreakFeasible(String word,Set<String> dictionary) {
        return isBreakFeasible(word,0,dictionary);
    }
   private boolean isBreakFeasible(String word, int index, Set<String> dictionary) {
       System.out.println(index);
        if(index==word.length()){
            return true;
        }
        for (int i = index+1; i <= word.length(); i++) {
            if (dictionary.contains(word.substring(index, i))) {
                if (isBreakFeasible(word, i, dictionary)) {
                    return true;
                }
            }
        }
        return false;
    }
}

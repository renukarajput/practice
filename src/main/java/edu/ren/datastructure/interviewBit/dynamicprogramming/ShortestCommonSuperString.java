package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.List;

public class ShortestCommonSuperString {
    //abcd
    int getLength(List<String> words) {
        //abcd  cdef
        //cdef abcd
        String prev=words.get(0);
        for (int i = 1; i <words.size() ; i++) {
            String current=words.get(i);
            if(prev.contains(current)){
                continue;
            }
            int i1 = lenOfLongestSuffixWhichIsPrefix(prev, current);
            int i2 = lenOfLongestSuffixWhichIsPrefix(current, prev);

               String prev1=prev.concat(current.substring(i1));
               String prev2=current.concat(prev.substring(i2));
               if(prev1.length()<prev2.length()){
                   prev=prev1;
               }else {
                   prev=prev2;
               }

        }
        return prev.length();
    }

    int lenOfLongestSuffixWhichIsPrefix(String first, String second) {
        int firstIndex = first.length() - 1;
        int secondIndex = 0;
        while (firstIndex >= 0 && secondIndex < second.length() && first.charAt(firstIndex) == second.charAt(secondIndex)) {
            firstIndex--;
            secondIndex++;
        }
        return secondIndex;
    }
}

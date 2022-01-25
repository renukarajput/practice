package edu.ren.datastructure.interviewBit.string;

import java.util.HashSet;
import java.util.Set;

public class AmazingSubstringCount {
    private Set<Character> vowel = new HashSet<>();

    {
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
    }

    int count(String str) {
        return count(str.toCharArray());
    }

    private int count(char[] word) {
        int total=0;
        for (int i = 0; i <word.length ; i++) {
            if(isVowel(word[i])) {
                total += (word.length - i)%10003;
                total=total%10003;
            }
        }
        return total;
    }

    private boolean isVowel(char ch) {
        return vowel.contains(Character.toLowerCase(ch));
    }

}

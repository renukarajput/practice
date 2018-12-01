package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;
import java.util.Stack;

public class RegexMatch2 extends RegexMatch {

    @Override
    boolean isMatch(char[] word, char[] pattern) {

        int i = 0, j = 0;
        Stack<Retry> retryStack = new Stack<>();
        while (j <= pattern.length) {
            if (j == pattern.length && i < word.length) {
                if (retryStack.isEmpty()) {
                    return false;
                }
                Retry retry = retryStack.pop();
                i = retry.i;
                j = retry.j;
                continue;
            }
            if (i >= word.length) {
                while (j < pattern.length) {
                    if (pattern[j] != '*') {
                        break;
                    }
                    j++;
                }
                if (j == pattern.length) {
                    return true;
                } else {
                    if (retryStack.isEmpty()) {
                        return false;
                    }
                    Retry retry = retryStack.pop();
                    i = retry.i;
                    j = retry.j;
                    continue;
                }
            } else if (pattern[j] == '*') {
                retryStack.push(new Retry(i, j + 1));
                i++;
            } else if (word[i] == pattern[j] || pattern[j] == '?') {
                i++;
                j++;
            } else {
                if (retryStack.isEmpty()) {
                    return false;
                } else {
                    Retry retry = retryStack.pop();
                    i = retry.i;
                    j = retry.j;
                }
            }
        }

        return true;
    }

    class Retry {
        int i;
        int j;

        public Retry(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

}

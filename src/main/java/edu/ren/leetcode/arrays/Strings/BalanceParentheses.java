package edu.ren.leetcode.arrays.Strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class BalanceParentheses {
    public List<String> removeInvalidParentheses(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        return null;
    }

    void remove(String str, int i, int len, List<String> result) {
        int numOpen = 0, numClose = 0;
        Deque<Character> stack = new ArrayDeque<>();
        if (i == len) {
            result.add(str);
            return;
        }

        if (str.charAt(i) == '(') {
            numOpen++;
        } else if (str.charAt(i) == ')') {
            numClose++;
        }
        if (numClose > numOpen) {
            remove(str.substring(0, i).concat(str.substring(i + 1, len)), i, len - 1, result);
        }

    }
}


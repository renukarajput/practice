package edu.leetcode.stack;

import java.util.Stack;

//https://leetcode.com/problems/remove-k-digits/submissions/
public class RemoveKDigitsToMinimizeNumber {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack();
        for(char ch : num.toCharArray()) {
            while(!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        for(int i=0; i < k; i++){
            stack.pop();
        }
        StringBuilder res = new StringBuilder();
        boolean leadingZero = true;
        for(char ch : stack) {
            if(leadingZero && ch == '0')
                continue;
            leadingZero = false;
            res.append(ch);
        }
        if (res.length() == 0) return "0";
        return res.toString();
    }
}


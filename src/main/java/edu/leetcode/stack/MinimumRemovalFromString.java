package edu.leetcode.stack;

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemovalFromString {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack();
        Set<Integer> deleteIndex = new HashSet();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(i);
            } else if(ch == ')') {
                if(stack.isEmpty()){
                    deleteIndex.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            deleteIndex.add(stack.pop());
        }
        for(int i = 0; i<s.length(); i++) {
            if(!deleteIndex.contains(i)){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}

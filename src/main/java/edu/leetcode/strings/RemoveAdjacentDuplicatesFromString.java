package edu.leetcode.strings;

import java.util.Stack;
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class RemoveAdjacentDuplicatesFromString {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) { // abbaca >ab
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
    class RemoveDuplicatesFromStringUsingTwoPointer extends RemoveAdjacentDuplicatesFromString {
        @Override
        public String removeDuplicates(String s) {
            int writeIndex = 0, n = s.length();
            char[] res = s.toCharArray();
            for (int readIndex = 0; readIndex < n; ++readIndex, ++writeIndex) {
                res[writeIndex] = res[readIndex];
                if (writeIndex > 0 && res[writeIndex - 1] == res[writeIndex]) // count = 2
                    writeIndex -= 2;
            }
            return new String(res, 0, writeIndex);
        }
    }




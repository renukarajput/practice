package edu.ren.datastructure.stack;

import java.util.*;
import java.util.Stack;

public class MathExpression {

    public boolean isValidExpression(String input) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : input.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }

            if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty())
                    return false;
                Character top = stack.peek();
                if (isMatchingPair(top, ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            System.out.println("stack = " + Arrays.toString(stack.toArray()));
        }
        if (stack.isEmpty()) return true;

        return false;
    }

    private boolean isMatchingPair(Character top, char charAtIndex) {
        if (top == '{' && charAtIndex == '}')
            return true;
        if (top == '(' && charAtIndex == ')')
            return true;
        if (top == '[' && charAtIndex == ']')
            return true;
        else
            return false;
    }
}

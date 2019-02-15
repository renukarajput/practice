package edu.ren.datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RedundantBraces extends MathExpression {

    //((a + b))=1, a + ((a+b))=1, (a+(a+b))=0
    public boolean isRedundant(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        int operatorCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char item = input.charAt(i);
            if (isOperator(item) || item == '(') {
                stack.push(item);
            }
            if (item == ')') {
                while (stack.peek() != '(') {
                    if (isOperator(stack.peek())) {
                        operatorCount++;
                    }
                    stack.pop();
                }
                if (operatorCount == 0) {
                    return true;
                }
                stack.pop();
                operatorCount = 0;
            }

        }
        return false;
    }

    private boolean isOperator(Character ch) {
        if (ch == '+' || ch == '-' || ch == '/' || ch == '*')
            return true;
        else
            return false;
    }

}

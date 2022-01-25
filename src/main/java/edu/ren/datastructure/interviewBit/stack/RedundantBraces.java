package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class RedundantBraces {
    static final Set<Character> OPERATORS = new HashSet<>();

    {
        OPERATORS.add('+');
        OPERATORS.add('-');
        OPERATORS.add('*');
        OPERATORS.add('/');
        OPERATORS.add('/');
    }

    //((a + b))   (a + (a + b))
    boolean hasReduntant(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        boolean isBracePairMatch=true;
        for (int i = 0; i < expression.length(); i++) {
            final char element = expression.charAt(i);
            if (element == '(') {
                isBracePairMatch=true;
                stack.push(element);
            } else if (element == ')') {
                if (isBracePairMatch==true && stack.peek() == '(') {
                    return true;
                }
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
                isBracePairMatch = true;
            }else if(isOperator(element)){
                stack.push(element);
                isBracePairMatch = false;
            }
        }
        return false;
    }

   private boolean isOperator(Character c) {
        return OPERATORS.contains(c);
    }
}

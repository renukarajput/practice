package edu.ren.datastructure.stack;

import java.util.Stack;
//MinStack
public class SpecialStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minElementStack = new Stack<>();

    public void push(int elm) {
        if (stack.isEmpty()) {
            stack.push(elm);
            minElementStack.push(elm);
        } else {
            stack.push(elm);
            Integer top = minElementStack.peek();
            if (elm < top) {
                minElementStack.push(elm);
            } else {
                minElementStack.push(top);
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
        minElementStack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (minElementStack.isEmpty()) {
            return -1;
        }
        return minElementStack.peek();
    }
}

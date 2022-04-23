package com.leetcode;

import java.util.Stack;

public class MinimumStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinimumStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
//        minStack.push(Math.min(stack.peek(), minStack.peek()));  alternate for line 17
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek()))
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinimumStack minStack = new MinimumStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // -3
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin()); // -2
    }
}

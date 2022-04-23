package com.leetcode;

import java.util.Stack;

public class MinStackUsingSingleStack {

    private final Stack<int[]> stack;

    public MinStackUsingSingleStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()){
            stack.push(new  int[]{val,val});
            return;
        }
        int currMin = stack.peek()[1];
        stack.push(new int[]{val, Math.min(val, currMin)});
    }

    public void pop() {
        stack.peek();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

    public static void main(String[] args) {
        MinStackUsingSingleStack minStack = new MinStackUsingSingleStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // -3
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin()); // -2
    }
}

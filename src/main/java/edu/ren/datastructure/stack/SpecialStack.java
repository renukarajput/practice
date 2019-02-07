package edu.ren.datastructure.stack;

public class SpecialStack extends java.util.Stack {

    java.util.Stack<Integer> minElementStack = new java.util.Stack<>();

    public void push(Integer elm) {
        if (isEmpty()) {
            super.push(elm);
            minElementStack.push(elm);
        } else {
            super.push(elm);
            Integer top = minElementStack.peek();
            if (elm < top) {
                minElementStack.push(elm);
            } else {
                minElementStack.push(top);
            }
        }
    }

    public Integer pop() {
        if (super.isEmpty()) {
            return -1;
        }
        Object top = super.pop();
        minElementStack.pop();
        return (Integer) top;
    }

    public Integer getMin() {
        if (minElementStack.isEmpty()) {
            return -1;
        }
        return minElementStack.peek();
    }

    public Integer top() {
        if (super.isEmpty()) {
            return -1;
        }
        return minElementStack.pop();
    }
}

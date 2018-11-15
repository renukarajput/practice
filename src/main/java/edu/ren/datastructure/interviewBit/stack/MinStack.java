package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayDeque;

public class MinStack<T extends Comparable<? super T>> {
    private final ArrayDeque<T> stack;
    private final ArrayDeque<T> minStack;

    public MinStack() {
       stack=new ArrayDeque<>();
       minStack=new ArrayDeque<>();
    }

    void push(T element) {
        T min;
        if (minStack.isEmpty()) {
            minStack.push(element);
            stack.push(element);
        } else {
            min = minStack.getFirst();
            if (element.compareTo(min) < 0) {
                minStack.push(element);
            } else {
                minStack.push(min);
            }
            stack.push(element);
        }
    }

    T pop() {
        T popped = stack.pop();
        minStack.pop();
        return popped;
    }

    T min(){
        if(minStack.isEmpty()){
            return null;
        }
        return minStack.getFirst();
    }
}

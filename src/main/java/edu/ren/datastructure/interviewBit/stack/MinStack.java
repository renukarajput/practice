package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayDeque;

public class MinStack<T extends Comparable<? super T>> {
    private final ArrayDeque<T> stack;
    private final ArrayDeque<MinValueIndexPair> minStack;

    class MinValueIndexPair {
        T value;
        int index;

        public MinValueIndexPair(T value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    void push(T element) {
        T min;
        stack.push(element);
        if (minStack.isEmpty()) {
            minStack.push(new MinValueIndexPair(element, stack.size()));
        } else {
            min = minStack.getFirst().value;
            if (element.compareTo(min) < 0) {
                minStack.push(new MinValueIndexPair(element, stack.size()));
            }
        }

    }

    T top() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.getFirst();
}
    T pop() {
        if (minStack.getFirst().index == stack.size()) {
            minStack.pop();
        }
        T popped = stack.pop();
        return popped;
    }

    T min() {
        if (minStack.isEmpty()) {
            return null;
        }
        return minStack.getFirst().value;
    }
}

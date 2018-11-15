package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayDeque;

public class MinStackOptimised<T extends Comparable<? super T>>  extends MinStack<T> {

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

    public MinStackOptimised() {
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

package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayDeque;

public class Solution {
    private final ArrayDeque<Integer> stack;
    private final ArrayDeque<MinValueIndexPair> minStack;

    class MinValueIndexPair {
        Integer value;
        int index;

        public MinValueIndexPair(Integer value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public Solution() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    void push(int element) {
        Integer min;
        stack.push(element);
        if (minStack.isEmpty()) {
            minStack.push(new MinValueIndexPair(element, stack.size()));
        } else {
            min = minStack.getFirst().value;
            if (min.compareTo(element) > 0) {
                minStack.push(new MinValueIndexPair(element, stack.size()));
            }
        }

    }

    void pop() {
        if(stack.isEmpty()){
            return ;
        }
        if (minStack.getFirst().index == stack.size()) {
            minStack.pop();
        }
        stack.pop();
    }

    int min() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.getFirst().value;
    }
}

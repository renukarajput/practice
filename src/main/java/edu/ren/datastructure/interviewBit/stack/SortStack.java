package edu.ren.datastructure.interviewBit.stack;

import java.util.Stack;

public class SortStack {

    void sort(Stack<Integer> stack) {

        int prevTop = stack.pop();
        insertInSorted(stack, prevTop);
    }

    private void insertInSorted(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int oldTop = stack.pop();
        insertInSorted(stack,oldTop);
        if(item>oldTop){
            stack.push(item);
        }else {
            stack.pop();
            insertInSorted(stack,item);
            stack.push(oldTop);
        }

    }
}

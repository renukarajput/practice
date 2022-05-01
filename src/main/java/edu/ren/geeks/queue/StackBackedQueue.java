package edu.ren.geeks.queue;

import java.util.Stack;

public class StackBackedQueue<T> {
    Stack<T> stackOne = new Stack();
    Stack<T> stackTwo = new Stack<>();
    private boolean isFirstActive = true;

    public boolean add(T elm) {
        getActiveStack().push(elm);
        return true;
    }

    public T remove() {
        while (!stackOne.isEmpty()) {
            T top = stackOne.pop();
            stackTwo.push(top);
        }
        T result = stackTwo.pop();
        return result;
    }

    public T remove1() {
        Stack<T> activeStack = getActiveStack();
        Stack<T> tempStack = getTempStack();

        while (!activeStack.isEmpty()) {
            T top = activeStack.pop();
            tempStack.push(top);
        }
        T result = tempStack.pop();

        if (activeStack.isEmpty()){
            while (!tempStack.isEmpty()){
                activeStack.push(tempStack.pop());
            }
        }

        return result;
    }

    private Stack<T> getActiveStack() {
        return isFirstActive ? stackOne : stackTwo;
    }

    private Stack<T> getTempStack() {
        return getActiveStack() == stackOne ? stackTwo : stackOne;
    }
}


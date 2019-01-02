package edu.ren.datastructure.stack;

import edu.ren.datastructure.list.LinkedList;

import java.util.EmptyStackException;

public class Stack<T> {
    private int size;
    private int index = 0;
    LinkedList<T> linkedList = null;

    public Stack(int size) {
        this.size = size;
        linkedList = new LinkedList<>();
    }

    public void push(T element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }

        linkedList.insertAtBeginning(element);
        index++;
    }

    public void pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        linkedList.deleteFirst();
        index--;
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

}

package edu.ren.datastructure.stack;

import org.junit.Test;

public class MyStackTest {
    @Test
    public void input_1() {
        MyStack stack = new MyStack();
        stack.push(20);
        stack.push(10);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
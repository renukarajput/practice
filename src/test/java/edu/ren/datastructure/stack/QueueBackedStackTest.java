package edu.ren.datastructure.stack;

import org.junit.Test;

public class QueueBackedStackTest {

    @Test
    public void input_1() {
        QueueBackedStack stack = new QueueBackedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        stack.push(4);
        stack.push(5);
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
    }
}
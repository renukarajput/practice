package edu.ren.datastructure.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StackTest {
    @Test
    public void IntegerInput() {
        int size = 10;
        Stack<Integer> stack = new Stack<>(size);

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        assertEquals(5,stack.size());
//        stack.push(500);
        stack.pop();
        assertEquals(4,stack.size());
        stack.pop();

        System.out.println("isEmpty : " + stack.isEmpty());
    }


}

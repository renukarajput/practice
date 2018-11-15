package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import javax.swing.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinStackTest {

    @Test
    public void minStack() {
        MinStack<Integer> minStack = new MinStack<>();
        minStack.push(6);
        minStack.push(8);
        minStack.push(3);
        minStack.push(5);
        minStack.push(1);
        assertThat(minStack.min(), is(1));
        minStack.pop(); //pop 1
        assertThat(minStack.min(), is(3));
        minStack.pop(); //pop 5
        assertThat(minStack.min(), is(3));
        minStack.pop(); //pop 3
        assertThat(minStack.min(), is(6));
        minStack.pop(); //pop 8
        assertThat(minStack.min(), is(6));
        minStack.pop(); //pop 6
        assertNull(minStack.min());

    }
}
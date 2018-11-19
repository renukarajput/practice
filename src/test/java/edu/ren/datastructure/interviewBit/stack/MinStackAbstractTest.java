package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import javax.swing.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class MinStackAbstractTest {

    @Test
    public void minStack() {
        MinStack<Integer> minStack = getMinStack();
        minStack.push(6);
        minStack.push(8);
        minStack.push(3);
        minStack.push(5);
        minStack.push(1);
        assertThat(minStack.min(), is(1));
        assertThat(minStack.top(), is(1));
        minStack.pop(); //pop 1
        assertThat(minStack.top(),is(5));
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

    @Test
    public void minStack_1() {
        MinStack<Integer> minStack = getMinStack();
        minStack.push(6);
        minStack.push(8);
        minStack.push(3);
        minStack.push(5);
        minStack.push(11);
        assertThat(minStack.min(), is(3));
        minStack.pop(); //pop 11
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

    @Test
    public void minStack_2() {
        MinStack<Integer> minStack = getMinStack();
        minStack.push(2);
        minStack.push(8);
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(11);
        minStack.push(11);


        for (int i = 0; i <6 ; i++) {
            minStack.pop();
        }
        assertThat(minStack.min(),is(2));
        minStack.pop();
        assertNull(minStack.min());
    }

    @Test
    public void minStack_3() {
        MinStack<Integer> minStack = getMinStack();
        minStack.push(0);
        minStack.push(0);
        minStack.push(-1);
        assertThat(minStack.min(),is(-1));
        minStack.pop();
        assertThat(minStack.min(),is(0));
        minStack.pop();
        assertThat(minStack.min(),is(0));
        minStack.pop();
        assertNull(minStack.min());


    }

    @Test
    public void minStack_4() {
        MinStack<Integer> minStack = getMinStack();
        minStack.push(0);
    }

    protected abstract MinStack<Integer> getMinStack();
}
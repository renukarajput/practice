package edu.ren.datastructure.stack;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SpecialStackTest {

    SpecialStack stack = new SpecialStack();

    @Test
    public void input_1() {
        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.push(15);
        stack.push(16);
        assertThat(stack.getMin(), is(15));
    }

    @Test
    public void input_2() {
        stack.push(18);
        stack.push(19);
        stack.push(29);
        assertThat(stack.getMin(), is(18));
    }

    @Test
    public void input_3() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertThat(stack.getMin(), is(10));
        stack.push(5);
        assertThat(stack.getMin(), is(5));
    }

    @Test
    public void input_4() {
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(11);
        stack.push(11);
        for (int i = 0; i < 6; i++) {
            stack.pop();
        }
        assertThat(stack.getMin(), is(2));
        stack.pop();
        assertThat(stack.getMin(), is(-1));
    }

    @Test
    public void input_5() {
        stack.push(0);
        stack.push(0);
        stack.push(-1);
        assertThat(stack.getMin(), is(-1));
        stack.pop();
        assertThat(stack.getMin(), is(0));
        stack.pop();
        assertThat(stack.getMin(), is(0));
        stack.pop();
        assertThat(stack.getMin(), is(-1));
    }
    
    @Test
    public void input_6() {
        stack.push(6);
        stack.push(8);
        stack.push(3);
        stack.push(5);
        stack.push(11);
        assertThat(stack.getMin(), Matchers.is(3));
        stack.pop();
        assertThat(stack.getMin(), Matchers.is(3));
        stack.pop();
        assertThat(stack.getMin(), Matchers.is(3));
        stack.pop();
        assertThat(stack.getMin(), Matchers.is(6));
        stack.pop();
        assertThat(stack.getMin(), Matchers.is(6));
        stack.pop();
        assertThat(stack.getMin(), is(-1));
    }
}
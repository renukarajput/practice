package edu.ren.datastructure.stack;

import org.junit.Test;
import java.util.Stack;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReverseStackTest {

    @Test
    public void input1() {
        Stack<Integer> stack = new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.push(4);
        stack.push(5);
        ReverseStack.reverseMyStack(stack);
        assertThat(stack.toString(),is("[5, 4, 0, 1, 2, 3]"));
    }

    @Test
    public void input2() {
        Stack<Integer> stack = new Stack();
        stack.push(30);
        stack.push(2);
        stack.push(10);
        stack.push(-1);
        ReverseStack.reverseMyStack(stack);
        assertThat(stack.toString(),is("[-1, 10, 2, 30]"));
    }

}
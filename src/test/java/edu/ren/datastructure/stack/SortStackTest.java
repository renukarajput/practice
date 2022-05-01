package edu.ren.datastructure.stack;

import org.junit.Test;
import java.util.Stack;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SortStackTest {

    @Test
    public void recursiveSortInput1() {
        Stack<Integer> stack = new Stack();
        stack.push(8);
        stack.push(6);
        stack.push(9);
        stack.push(14);
        stack.push(25);
        SortStack.sortStackRecursively(stack);
        assertThat(stack.toString(),is("[6, 8, 9, 14, 25]"));
    }

    @Test
    public void recursiveSortInput2() {
        Stack<Integer> stack = new Stack();
        stack.push(20);
        stack.push(60);
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(50);
        SortStack.sortStackRecursively(stack);
        assertThat(stack.toString(),is("[10, 20, 30, 40, 50, 60]"));

    }

    @Test
    public void iterativeSortAscendingInput() {
        Stack<Integer> stack = new Stack();
        stack.push(20);
        stack.push(60);
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(50);
        stack.push(-50);
        SortStack.sortStackInAscendingOrder(stack);
        assertThat(stack.toString(),is("[-50, 10, 20, 30, 40, 50, 60]"));
    }


    @Test
    public void iterativeSortDescendingInput() {
        Stack<Integer> stack = new Stack();
        stack.push(20);
        stack.push(60);
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(50);
        SortStack.sortStackInDescendingOrder(stack);
        assertThat(stack.toString(),is("[60, 50, 40, 30, 20, 10]"));

    }
}

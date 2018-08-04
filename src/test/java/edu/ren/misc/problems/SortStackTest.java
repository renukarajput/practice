package edu.ren.misc.problems;

import org.junit.Test;

import java.util.Stack;

public class SortStackTest {

    @Test
    public void sortAscending() {
        Stack<Integer> stack = new Stack();
        stack.push(8);
        stack.push(6);
        stack.push(9);
        stack.push(14);
        stack.push(25);
        System.out.println(stack);
        SortStack.sortStackRecursively(stack);
        System.out.println(stack);
    }

    @Test
    public void sortAscendingInput1() {
        Stack<Integer> stack = new Stack();
        stack.push(20);
        stack.push(60);
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(50);
        System.out.println(stack);
        SortStack.sortStackRecursively(stack);
        System.out.println(stack);
    }

    @Test
    public void sortStackIterativelyInput1() {
        Stack<Integer> stack = new Stack();
        stack.push(20);
        stack.push(60);
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(50);
        stack.push(-50);
        System.out.println("input = "+stack);
        Stack<Integer> st = SortStack.sortStackIteratively(stack);
        System.out.println("output "+st);
    }

}

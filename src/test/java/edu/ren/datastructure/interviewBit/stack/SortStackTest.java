package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class SortStackTest {
SortStack sortStack=new SortStack();
    @Test
    public void sort() {
        Stack<Integer> stack=new Stack<>();
        stack.addAll(Arrays.asList(5,2,6,3));
        assertThat(stack,contains(5,2,6,3));
        sortStack.sort(stack);
        assertThat(stack,contains(2,3,5,6));
    }
}
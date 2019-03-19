package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountNumberOfBinaryTreeTest {
CountNumberOfBST countNumberOfBST=new CountNumberOfBST();
CountNumberOfBinaryTree countNumberOfBinaryTree=new CountNumberOfBinaryTree();
    @Test
    public void get() {
        int expected =6* countNumberOfBST.get(3);
        assertThat(countNumberOfBinaryTree.get(3),is(expected));
    }
}
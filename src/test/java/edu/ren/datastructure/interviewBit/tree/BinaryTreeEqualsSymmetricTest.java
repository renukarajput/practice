package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinaryTreeEqualsSymmetricTest {

    @Test
    public void isEqual() {
        int[] nodes1 = {2, 1, 3};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);
        assertThat(new BinaryTreeEqualsSymmetric().isEqual(binarySearchTree1),is(1));
    }

    @Test
    public void isEqual_1() {
        int[] nodes1 = {2, 1, 3,4,5};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);
        assertThat(new BinaryTreeEqualsSymmetric().isEqual(binarySearchTree1),is(0));
    }


    @Test
    public void isEqual_2() {
        int[] nodes1 = {6,4,8,2,5,7};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);
        assertThat(new BinaryTreeEqualsSymmetric().isEqual(binarySearchTree1),is(0));
    }

    @Test
    public void isEqual_3() {
        int[] nodes1 = {6,4,8,2,5,7,9};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);
        assertThat(new BinaryTreeEqualsSymmetric().isEqual(binarySearchTree1),is(1));
    }
}
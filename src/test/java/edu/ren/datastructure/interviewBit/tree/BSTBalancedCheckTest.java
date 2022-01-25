package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

public class BSTBalancedCheckTest {

    @Test
    public void isBalanced() {
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(new int[]{3, 1, 5});
        assertThat(new BSTBalancedCheck().isBalanced(binarySearchTree),is(true));
    }

    @Test
    public void isBalanced_not_1() {
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(new int[]{10,9,7,8,15,18,20,13});
        assertThat(new BSTBalancedCheck().isBalanced(binarySearchTree),is(false));
    }

    @Test
    public void isBalanced_1() {
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(new int[]{10,9,7,11,12});
        assertThat(new BSTBalancedCheck().isBalanced(binarySearchTree),is(true));
    }

    @Test
    public void isBalanced_not() {
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(new int[]{3, 2, 1});
        assertThat(new BSTBalancedCheck().isBalanced(binarySearchTree),is(false));
    }
}
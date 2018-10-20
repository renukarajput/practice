package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class InvertBinaryTreeTest {

    @Test
    public void invert() {
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{1,2,3,4,5,6,7});
        new InvertBinaryTree().invert(binarySearchTree);
        assertThat(binarySearchTree.root.val,is(1));

        assertThat(binarySearchTree.root.left.val,is(3));
        assertThat(binarySearchTree.root.right.val,is(2));

        assertThat(binarySearchTree.root.left.left.val,is(7));
        assertThat(binarySearchTree.root.left.right.val,is(6));

        assertThat(binarySearchTree.root.right.left.val,is(5));
        assertThat(binarySearchTree.root.right.right.val,is(4));
    }

    @Test
    public void invert_1() {
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{1,2,3,4,5,-1,7});
        new InvertBinaryTree().invert(binarySearchTree);
        assertThat(binarySearchTree.root.val,is(1));

        assertThat(binarySearchTree.root.left.val,is(3));
        assertThat(binarySearchTree.root.right.val,is(2));

        assertThat(binarySearchTree.root.left.left.val,is(7));
        assertThat(binarySearchTree.root.left.right,is(nullValue()));

        assertThat(binarySearchTree.root.right.left.val,is(5));
        assertThat(binarySearchTree.root.right.right.val,is(4));
    }
}
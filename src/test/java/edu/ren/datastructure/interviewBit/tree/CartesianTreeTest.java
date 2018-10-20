package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CartesianTreeTest /*extends BinarySearchTree*/{

    @Test
    public void build() {
        Integer[] arr = {5, 10, 40, 30, 28};
        BinarySearchTree tree = new CartesianTree().build(Arrays.asList(arr));
        TreeNode root = tree.root;
        //BinaryTreePrinter.printNode(root);
        assertThat(root.val, is(40));
        assertThat(root.left.val, is(10));
        assertThat(root.left.left.val, is(5));
        assertThat(root.right.val, is(30));
        assertThat(root.right.right.val, is(28));
    }

    @Test
    public void build_1() {
        Integer[] arr = {1,2,3};
        BinarySearchTree tree = new CartesianTree().build(Arrays.asList(arr));
        TreeNode root = tree.root;
        //BinaryTreePrinter.printNode(root);
        assertThat(root.val, is(3));
        assertThat(root.left.val, is(2));
        assertThat(root.left.left.val, is(1));
    }
}
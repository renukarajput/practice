package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayList;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.junit.Assert.*;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class IterativeInorderTest {

    @Test
    public void inorder() {
        int[] nodes = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree=fromArray(nodes);
        ArrayList<Integer> inorderList = new IterativeInorder().inorder(binarySearchTree);
        assertThat(inorderList,contains(3,4,5,13,15,20));
    }

    @Test
    public void inorder_1() {
        int[] nodes = {50, 30,90,60};
        BinarySearchTree binarySearchTree=fromArray(nodes);
        ArrayList<Integer> inorderList = new IterativeInorder().inorder(binarySearchTree);
        assertThat(inorderList,contains(30,50,60,90));
    }

    @Test
    public void inorder_2() {
        int[] nodes = { 30,50,70,80};
        BinarySearchTree binarySearchTree=fromArray(nodes);
        ArrayList<Integer> inorderList = new IterativeInorder().inorder(binarySearchTree);
        assertThat(inorderList,contains(30,50,70,80));
    }
}
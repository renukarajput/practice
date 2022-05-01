package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayList;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class BinaryTreeEqualsTest {

    @Test
    public void isEqual() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);

        int[] nodes2 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree2 = fromArray(nodes2);


        assertThat(new BinaryTreeEquals().isEqual(binarySearchTree1,binarySearchTree2),is(1));
    }

    @Test
    public void isUnEqual() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);

        int[] nodes2 = {5, 2, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree2 = fromArray(nodes2);


        assertThat(new BinaryTreeEquals().isEqual(binarySearchTree1,binarySearchTree2),is(0));
    }

    @Test
    public void isUnEqual_1() {
        int[] nodes1 = {2, 1, 3};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);

        int[] nodes2 = {2, 1, 4};
        BinarySearchTree binarySearchTree2 = fromArray(nodes2);


        assertThat(new BinaryTreeEquals().isEqual(binarySearchTree1,binarySearchTree2),is(0));
    }
    @Test

    public void isUnEqual_2() {
        int[] nodes1 = {2, 1, 3};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);

        int[] nodes2 = {2, 1};
        BinarySearchTree binarySearchTree2 = fromArray(nodes2);


        assertThat(new BinaryTreeEquals().isEqual(binarySearchTree1,binarySearchTree2),is(0));
    }
    @Test

    public void isUnEqual_3() {
        int[] nodes1 = {2, 1};
        BinarySearchTree binarySearchTree1 = fromArray(nodes1);

        int[] nodes2 = {2, 1,5};
        BinarySearchTree binarySearchTree2 = fromArray(nodes2);


        assertThat(new BinaryTreeEquals().isEqual(binarySearchTree1,binarySearchTree2),is(0));
    }
}
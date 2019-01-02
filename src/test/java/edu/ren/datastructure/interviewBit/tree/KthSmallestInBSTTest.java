package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class KthSmallestInBSTTest {

    private final KthSmallestInBST kthSmallestInBST = new KthSmallestInBST();

    @Test
    public void getKthSmallest() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(kthSmallestInBST.getKthSmallest(binarySearchTree, 1), is(3));
    }

    @Test
    public void getKthSmallest_1() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(kthSmallestInBST.getKthSmallest(binarySearchTree, 2), is(4));
    }

    @Test
    public void getKthSmallest_2() {
        int[] nodes1 = {5};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(kthSmallestInBST.getKthSmallest(binarySearchTree, 1), is(5));
    }


    @Test
    public void getKthSmallest_4() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(kthSmallestInBST.getKthSmallest(binarySearchTree, 4), is(13));
    }

}
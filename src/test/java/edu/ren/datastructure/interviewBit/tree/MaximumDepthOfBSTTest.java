package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumDepthOfBSTTest {

    @Test
    public void maxDepth() {
        int[] nodes1 = {1, 3, 4, 15, 18, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MaximumDepthOfBST().maxDepth(binarySearchTree),is(6));
    }

    @Test
    public void maxDepth_1() {
        int[] nodes1 = {3, 1, 4, 15, 18, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MaximumDepthOfBST().maxDepth(binarySearchTree),is(5));
    }


    @Test
    public void maxDepth_2() {
        int[] nodes1 = {3, 1, 5};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MaximumDepthOfBST().maxDepth(binarySearchTree),is(2));
    }

    @Test
    public void maxDepth_3() {
        int[] nodes1 = {1, 2};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MaximumDepthOfBST().maxDepth(binarySearchTree),is(2));
    }
}

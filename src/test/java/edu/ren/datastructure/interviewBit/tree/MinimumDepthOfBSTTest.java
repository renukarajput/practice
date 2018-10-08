package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinimumDepthOfBSTTest {

    @Test
    public void minDepth() {
        int[] nodes1 = {1, 3, 4, 15, 18, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MinimumDepthOfBST().minDepth(binarySearchTree),is(6));
    }

    @Test
    public void minDepth_1() {
        int[] nodes1 = {3, 1, 4, 15, 18, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MinimumDepthOfBST().minDepth(binarySearchTree),is(2));
    }


    @Test
    public void minDepth_2() {
        int[] nodes1 = {3, 1, 5};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MinimumDepthOfBST().minDepth(binarySearchTree),is(2));
    }

    @Test
    public void minDepth_3() {
        int[] nodes1 = {1, 2};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MinimumDepthOfBST().minDepth(binarySearchTree),is(2));
    }

    @Test
    public void minDepth_4() {
        int[] nodes1 = {5, 3,4};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MinimumDepthOfBST().minDepth(binarySearchTree),is(3));
    }

    @Test
    public void minDepth_5() {
        int[] nodes1 = {5, 3,4,8,11};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MinimumDepthOfBST().minDepth(binarySearchTree),is(3));
    }

    @Test
    public void minDepth_6() {
        int[] nodes1 = {1};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(new MinimumDepthOfBST().minDepth(binarySearchTree),is(1));
    }

}
package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxSumPathInTreeTest {
    MaxSumPathInTree maxSumPathInTree = new MaxSumPathInTree();

    @Test
    public void getMaxSum() {
        BinaryTree binaryTree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, 3});
        BinaryTreePrinter.printNode(binaryTree.root);
        assertThat(maxSumPathInTree.getMaxSum(binaryTree), is(6));
    }

    @Test
    public void getMaxSum_1() {
        BinaryTree binaryTree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, 3,4,5,6});
        BinaryTreePrinter.printNode(binaryTree.root);
        assertThat(maxSumPathInTree.getMaxSum(binaryTree), is(17));
    }

    @Test
    public void getMaxSum_2() {
        BinaryTree binaryTree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, -1, 3, 4, -1, -1, -1, -1});
        BinaryTreePrinter.printNode(binaryTree.root);
        assertThat(maxSumPathInTree.getMaxSum(binaryTree), is(9));
    }
    @Test
    public void getMaxSum_3() {
        BinaryTree binaryTree = BinaryTree.buildFromLevelOrder(new int[]{-100 ,-200, -1, -300, -400, -1, -1, -1, -1});
        BinaryTreePrinter.printNode(binaryTree.root);
        assertThat(maxSumPathInTree.getMaxSum(binaryTree), is(-100));
    }

    @Test
    public void getMaxSum_4() {
        BinaryTree binaryTree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, 8,-1,6,-1,3,-1,10,-11,-1,-1,14,-1,16,17});
        BinaryTreePrinter.printNode(binaryTree.root);
        assertThat(maxSumPathInTree.getMaxSum(binaryTree), is(36));
    }
}
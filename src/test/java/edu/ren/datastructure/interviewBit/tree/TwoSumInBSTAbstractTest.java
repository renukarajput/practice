package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class TwoSumInBSTAbstractTest {

   @Test
    public void twoSum() {
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(new int[]{5, 3, 4, 6, 2, 7});
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(getTwoSumInBST().twoSum(binarySearchTree,10),is(true));
    }

    @Test
    public void twoSum_1() {
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(new int[]{5, 3, 4, 6, 2, 7});
        assertThat(getTwoSumInBST().twoSum(binarySearchTree,9),is(true));
    }
    @Test
    public void twoSum_absent() {
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(new int[]{5, 3, 4, 6, 2, 7});
        assertThat(getTwoSumInBST().twoSum(binarySearchTree,14),is(false));
    }
    @Test
    public void twoSum_absent_1() {
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(new int[]{5, 3, 4, 6, 2, 7});
        assertThat(getTwoSumInBST().twoSum(binarySearchTree,4),is(false));
    }

    @Test
    public void twoSum_11() {
        BinarySearchTree binarySearchTree = new TreeFromBFS().createFromArray(new int[]{10,9,20,-1,-1,-1,-1});
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(getTwoSumInBST().twoSum(binarySearchTree,19),is(true));
    }
    //7 10 9 20 -1 -1 -1 -1
   abstract protected TwoSumInBST getTwoSumInBST();
}

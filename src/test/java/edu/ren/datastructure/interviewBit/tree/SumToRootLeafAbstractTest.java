package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class SumToRootLeafAbstractTest {

    @Test
    public void getSum() {
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{1,2,3});
        assertThat(getSumRootToLeaf().getSum(binarySearchTree),is(25));
    }

    @Test
    public void getSum_1() {
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{1,2,6,3,5,8,-1,4,-1,7,-1,2,3});
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(getSumRootToLeaf().getSum(binarySearchTree),is(841));
    }


    abstract  protected SumRootToLeaf getSumRootToLeaf();
}

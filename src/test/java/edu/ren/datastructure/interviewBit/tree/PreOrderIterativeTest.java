package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PreOrderIterativeTest {

    @Test
    public void preOrder() {
    }

    @Test
    public void getSum_1() {
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{1,2,6,3,5,8,-1,4,-1,7,-1,2,3});
       // BinaryTreePrinter.printNode(binarySearchTree.root);
        List<Integer> expected= Arrays.asList(1,2,3,4,5,7,6,8,2,3);
        assertThat(getPreOrderIterative().preOrder(binarySearchTree.root),is(expected));
    }

    protected PreOrderIterative getPreOrderIterative() {
        return new PreOrderIterative();
    }
}
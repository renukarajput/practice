package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EqualChildSumNodeTest {

    @Test
    public void equalToDescendants() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{10, 3, 4, 2, 1});
       int c= getEqualChildSumNode().equalToDescendants(tree.getRoot());
       assertThat(c,is(2));
    }

    protected EqualChildSumNode getEqualChildSumNode() {
        return new EqualChildSumNode();
    }
}
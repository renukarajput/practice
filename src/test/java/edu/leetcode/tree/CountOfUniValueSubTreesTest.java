package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTreePrinter;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountOfUniValueSubTreesTest {

    @Test
    public void countUnivalSubtrees() {
        BinaryTree tree=BinaryTree.buildFromLevelOrder(new int[]{1,1,1,5,5,-1,5});
        BinaryTreePrinter.printNode(tree.getRoot());
        int res=new CountOfUniValueSubTrees().countUnivalSubtrees(tree.getRoot());
        assertThat(res,is(3));
    }

    @Test
    public void countUnivalSubtrees_1() {
        BinaryTree tree=BinaryTree.buildFromLevelOrder(new int[]{5,1,5,5,5,-1,5});
        BinaryTreePrinter.printNode(tree.getRoot());
        int res=new CountOfUniValueSubTrees().countUnivalSubtrees(tree.getRoot());
        assertThat(res,is(4));
    }
}
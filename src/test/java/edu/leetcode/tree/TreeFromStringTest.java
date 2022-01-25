package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTreeEquals;
import edu.ren.datastructure.interviewBit.tree.BinaryTreePrinter;
import edu.ren.datastructure.interviewBit.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeFromStringTest {

    @Test
    public void str2tree() {
        TreeNode treeNode = new TreeFromString().str2tree("4(2(3)(1))(6(5))");
        BinaryTreePrinter.printNode(treeNode);
        BinaryTree expected = BinaryTree.buildFromLevelOrder(new int[]{4, 2, 6, 3, 1, 5});
        assertTrue(new BinaryTreeEquals().isEqual(BinaryTree.withRoot(treeNode),expected)==1);
    }

    @Test
    public void str2tree_1() {
        TreeNode treeNode = new TreeFromString().str2tree("4(2(3)(1))(6(5)(7))");
        BinaryTreePrinter.printNode(treeNode);
        BinaryTree expected = BinaryTree.buildFromLevelOrder(new int[]{4, 2, 6, 3, 1, 5,7});
        assertTrue(new BinaryTreeEquals().isEqual(BinaryTree.withRoot(treeNode),expected)==1);
    }


    @Test
    public void str2tree_2() {
        TreeNode treeNode = new TreeFromString().str2tree("-4(2(3)(1))(6(5)(7))");
        BinaryTreePrinter.printNode(treeNode);
        BinaryTree expected = BinaryTree.buildFromLevelOrder(new int[]{-4,2,6,3,1,5,7});
        assertTrue(new BinaryTreeEquals().isEqual(BinaryTree.withRoot(treeNode),expected)==1);
    }
}
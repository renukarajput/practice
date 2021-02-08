package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTreePrinter;
import edu.ren.datastructure.interviewBit.tree.TreeNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckEqualSumTreeTest {

    @Test
    public void checkEqualTree() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{5, 10, 10, -1, -1, 2, 3});
        BinaryTreePrinter.printNode(tree.getRoot());
        boolean res=new CheckEqualSumTree().checkEqualTree(tree.getRoot());
        System.out.println(res);
        assertThat(res,is(true));

    }

    @Test
    public void checkEqualTree_1() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, 10, -1, -1, 2, 20});
        BinaryTreePrinter.printNode(tree.getRoot());
        boolean res=new CheckEqualSumTree().checkEqualTree(tree.getRoot());
        System.out.println(res);
        assertThat(res,is(false));

    }

    @Test
    public void checkEqualTree_2() {
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(-1);
        root.right=new TreeNode(1);
        BinaryTreePrinter.printNode(root);
        boolean res=new CheckEqualSumTree().checkEqualTree(root);
        System.out.println(res);
        assertThat(res,is(false));

    }

    @Test
    public void checkEqualTree_3() {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(-1);
        BinaryTreePrinter.printNode(root);
        boolean res=new CheckEqualSumTree().checkEqualTree(root);
        System.out.println(res);
        assertThat(res,is(false));
    }

    @Test
    public void checkEqualTree_4() {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(1);
        BinaryTreePrinter.printNode(root);
        boolean res=new CheckEqualSumTree().checkEqualTree(root);
        System.out.println(res);
        assertThat(res,is(true));
    }

    @Test
    public void checkEqualTree_5() {
        TreeNode root=new TreeNode(0);
        BinaryTreePrinter.printNode(root);
        boolean res=new CheckEqualSumTree().checkEqualTree(root);
        System.out.println(res);
        assertThat(res,is(false));
    }

    @Test
    public void checkEqualTree_6() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{2,1,3,0,2,-1,-1,-1,-1,2,-1,1,-1,-1,1});
        TreeNode root=tree.getRoot();
        BinaryTreePrinter.printNode(root);
        boolean res=new CheckEqualSumTree().checkEqualTree(root);
        System.out.println(res);
        assertThat(res,is(true));
    }

    @Test
    public void checkEqualTree_7() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{2,1,3,0,2,-1,-1,-1,-1,2,-1,1,-1,-1,1});
        TreeNode root=tree.getRoot();
        BinaryTreePrinter.printNode(root);
        boolean res=new CheckEqualSumTree().checkEqualTree(root);
        System.out.println(res);
        assertThat(res,is(true));
    }
}
package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class FindSwappedNodesInBSTTest {

    @Test
    public void testSwappedNodes() {
        int arr[] = {10, 15, 7, 8, 13, 9, 14};
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(arr);
        BinaryTreePrinter.printNode(binarySearchTree.root);
        binarySearchTree.root.left.right.val = 13;
        binarySearchTree.root.right.left.val = 8;
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);

        TreeNode[] treeNode = new FindSwappedNodesInBST().get(binarySearchTree);
        assertThat(treeNode[0].val, is(13));
        assertThat(treeNode[1].val, is(8));
    }

    @Test
    public void testSwappedNodes_1() {
        int arr[] = {10, 5, 8, 2, 20};
        BinarySearchTree binarySearchTree = BinarySearchTree.fromArray(arr);
        BinaryTreePrinter.printNode(binarySearchTree.root);
        binarySearchTree.root.left.right.val = 20;
        binarySearchTree.root.right.val = 8;
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);

        TreeNode[] treeNode = new FindSwappedNodesInBST().get(binarySearchTree);
        assertThat(treeNode[0].val, is(20));
        assertThat(treeNode[1].val, is(8));
    }

    @Test
    public void testSwappedNodes_2() {
        BinarySearchTree tree = getTree();
        swap(tree.root.left.left,tree.root.right.left);
        BinaryTreePrinter.printNode(tree.root);
        TreeNode[] treeNode = new FindSwappedNodesInBST().get(tree);
        assertThat(treeNode[0].val, is(22));
        assertThat(treeNode[1].val, is(12));
    }

    @Test
    public void testSwappedNodes_3() {
        BinarySearchTree tree = getTree();
        swap(tree.root.left.left.left.left.left,tree.root.left.left.left.left);
        BinaryTreePrinter.printNode(tree.root);
        TreeNode[] treeNode = new FindSwappedNodesInBST().get(tree);
        assertThat(treeNode[0].val, is(5));
        assertThat(treeNode[1].val, is(4));
    }
    @Test
    public void testSwappedNodes_4() {
        BinarySearchTree tree = getTree();
        swap(tree.root.right.right,tree.root.right);
        BinaryTreePrinter.printNode(tree.root);
        TreeNode[] treeNode = new FindSwappedNodesInBST().get(tree);
        assertThat(treeNode[0].val, is(28));
        assertThat(treeNode[1].val, is(25));
    }

    protected void swap(TreeNode one,TreeNode two) {
        int temp = one.val;
        one.val = two.val;
        two.val = temp;
    }

    protected BinarySearchTree getTree() {
        int arr[] = {20, 15, 18, 12, 10, 5, 6, 4, 25, 28, 22, 24};
        return BinarySearchTree.fromArray(arr);
    }
}

package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.List;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LCAOfBinaryTreeTest {

    @Test
    public void preOrder() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        List<TreeNode> path = new LCAOfBinaryTree().getPath(binarySearchTree, 15);
        System.out.println(path);
    }
    @Test
    public void lca1() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
       int result = new LCAOfBinaryTree().LCA(binarySearchTree, 13,20);
        assertThat(result,is(15));

    }

    @Test
    public void lca2() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        int result = new LCAOfBinaryTree().LCA(binarySearchTree, 13,4);
        assertThat(result,is(5));
    }

    @Test
    public void lca3() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20,14};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        int result = new LCAOfBinaryTree().LCA(binarySearchTree, 8,50);
        assertThat(result,is(-1));
    }

    @Test
    public void lca4() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20,14};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        int result = new LCAOfBinaryTree().LCA(binarySearchTree, 8,13);
        assertThat(result,is(-1));
    }

    @Test
    public void lca5() {
        int[] nodes1 = {10, 5, 12, 4, 7, 6,8,12,13,14};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        int result = new LCAOfBinaryTree().LCA(binarySearchTree, 5,12);
        assertThat(result,is(10));
    }

    @Test
    public void lca6() {
        BinarySearchTree binarySearchTree = getBinarySearchTree();
        int result = new LCAOfBinaryTree().LCA(binarySearchTree, 5,33);
        assertThat(result,is(5));
    }

    public static BinarySearchTree getBinarySearchTree() {
        TreeNode node=getNode(15);
        node.left=getNode(20);
        node.left.left=getNode(35);
        node.left.left.left=getNode(26);
        node.left.right=getNode(5);
        node.left.right.left=getNode(25);
        node.left.right.right=getNode(23);
        node.left.right.right.left=getNode(11);
        node.left.right.right.left.left=getNode(33);
        node.left.right.right.left.right=getNode(13);
        node.left.right.right.right=getNode(32);
        node.left.right.left=getNode(25);
        node.left.right.left.left=getNode(7);
        node.left.right.left.right=getNode(24);
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.root=node;
        return binarySearchTree;
    }

    static TreeNode getNode(int num){
        return new TreeNode(num);
    }
}
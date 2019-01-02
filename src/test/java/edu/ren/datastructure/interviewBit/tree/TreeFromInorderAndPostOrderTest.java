package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TreeFromInorderAndPostOrderTest {

    @Test
    public void buildFrom() {
        int arr[]={1,2,3,4,5,6,7,8};
        BinaryTree binaryTree=BinaryTree.buildFromLevelOrder(arr);
        final TreeNode root = binaryTree.root;
        BinaryTreePrinter.printNode(root);
        ArrayList<Integer> inorder = new IterativeInorder().inorder(root);
        System.out.println(inorder);
        List<Integer> postOrder = new PostOrderTraversal().postOrder(binaryTree);
        System.out.println(postOrder);
        BinaryTree binaryTree1 = new TreeFromInorderAndPostOrder().buildFrom(inorder, postOrder);
        BinaryTreePrinter.printNode(binaryTree1.root);
        assertThat(new BinaryTreeEquals().isEqual(binaryTree1,binaryTree),is(1));

    }

    @Test
    public void buildFrom_1() {
        int arr[]={1,2,3,4,-1,5,6,7,8,9};
        BinaryTree binaryTree=BinaryTree.buildFromLevelOrder(arr);
        final TreeNode root = binaryTree.root;
        BinaryTreePrinter.printNode(root);
        ArrayList<Integer> inorder = new IterativeInorder().inorder(root);
        System.out.println(inorder);
        List<Integer> postOrder = new PostOrderTraversal().postOrder(binaryTree);
        System.out.println(postOrder);
        BinaryTree binaryTree1 = new TreeFromInorderAndPostOrder().buildFrom(inorder, postOrder);
        BinaryTreePrinter.printNode(binaryTree1.root);
        assertThat(new BinaryTreeEquals().isEqual(binaryTree1,binaryTree),is(1));

    }
}
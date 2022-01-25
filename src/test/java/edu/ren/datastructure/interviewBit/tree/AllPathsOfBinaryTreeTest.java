package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class AllPathsOfBinaryTreeTest {

    @Test
    public void getAllPaths() {
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{1,2,6,3,5,8,-1,4,-1,7,-1,2,3});
        BinaryTreePrinter.printNode(binarySearchTree.root);
        AllPathsOfBinaryTree allPaths = new AllPathsOfBinaryTree();
        assertThat(allPaths.getAllPaths(binarySearchTree).get(0),contains(1,2,3,4));
        assertThat(allPaths.getAllPaths(binarySearchTree).get(1),contains(1,2,5,7));
        assertThat(allPaths.getAllPaths(binarySearchTree).get(2),contains(1,6,8,2));
        assertThat(allPaths.getAllPaths(binarySearchTree).get(3),contains(1,6,8,3));
    }

    @Test
    public void test() {
       // BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{1,2,6,3,5,8,-1,4,-1,7,-1,20,3});
       BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{5,6,9,8,12,13,2,14});
        BinaryTreePrinter.printNode(binarySearchTree.root);
        //System.out.println("preorder");
       postorder(binarySearchTree.root);
    }
    void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    void preorder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(TreeNode root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
}
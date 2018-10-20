package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeFromInorderAndPreOrderTest {

    @Test
    public void buildFrom() {
        int arr[]={1,2,3,4,5,6,7,8};
        BinaryTree binaryTree=BinaryTree.buildFromLevelOrder(arr);
        final TreeNode root = binaryTree.root;
        BinaryTreePrinter.printNode(root);
        ArrayList<Integer> inorder = new IterativeInorder().inorder(root);
        System.out.println(inorder);
        ArrayList<Integer> preOrder = new PreOrderIterative().preOrder(root);
        System.out.println(preOrder);
        Integer[] inOrderArr={8, 4, 2, 5, 1, 6, 3, 7};
        Integer[] preOrderArr={1, 2, 4, 8, 5, 3, 6, 7};
        BinaryTree binaryTree1 = new TreeFromInorderAndPreOrder().buildFrom(arrayList(preOrderArr), arrayList(inOrderArr));
        BinaryTreePrinter.printNode(binaryTree1.root);
    }


    protected ArrayList<Integer> arrayList(Integer[] inOrderArr) {
        return new ArrayList<>(Arrays.asList(inOrderArr));
    }
}
package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortedArrayToBalalancedBSTTest {

    @Test
    public void fromSortedArray() {
        Integer [] arr={1, 2, 3,4,5,6,7,8};
        BinaryTree binaryTree = new SortedArrayToBalalancedBST().fromSortedArray(new ArrayList<>(Arrays.asList(arr)));
        TreeNode root = binaryTree.root;
        BinaryTreePrinter.printNode(root);
    }

    @Test
    public void fromSortedArray_1() {
        Integer [] arr={1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15};
        BinaryTree binaryTree = new SortedArrayToBalalancedBST().fromSortedArray(new ArrayList<>(Arrays.asList(arr)));
        TreeNode root = binaryTree.root;
        BinaryTreePrinter.printNode(root);
    }
    @Test
    public void fromSortedArray_2() {
        Integer [] arr={1};
        BinaryTree binaryTree = new SortedArrayToBalalancedBST().fromSortedArray(new ArrayList<>(Arrays.asList(arr)));
        TreeNode root = binaryTree.root;
        BinaryTreePrinter.printNode(root);
    }
}
package edu.ren.datastructure.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTConversionTest {
    BSTConversion bstConversion = new BSTConversion();

    @Test
    public void convertToGreaterTree_1() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(5,2,13/*20,15,10,30,50*/);
        BinaryTreePrinter.printNode(binarySearchTree.root);
        bstConversion.convertToGreaterTree(binarySearchTree.root);
        BinaryTreePrinter.printNode(binarySearchTree.root);
    }
    @Test
    public void convertToGreaterTree_2() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20,15,10,30,50);
        BinaryTreePrinter.printNode(binarySearchTree.root);
        bstConversion.convertToGreaterTree(binarySearchTree.root);
        BinaryTreePrinter.printNode(binarySearchTree.root);
    }

    private BinarySearchTree<Integer> getIntegerBinaryTree(int... values) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (Integer value : values) {
            tree.insert(value);
        }
        return tree;
    }
}
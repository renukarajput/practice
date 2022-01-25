package edu.ren.datastructure.tree;

import org.junit.Test;

public class BinaryTreePathsTest {
    BinaryTreePaths binaryTree = new BinaryTreePaths();

    @Test
    public void input_1() {
        BinaryTree<Integer> t1 = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 7, 1, 2);
        BinaryTreePrinter.printNode(t1.root);
        binaryTree.printPathRec(t1.root);
    }

    @Test
    public void input_2() {
        BinaryTree<Integer> t1 = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(t1.root);
        binaryTree.printSum(t1.root);
    }

    private BinaryTree<Integer> getIntegerBinaryTree(int... values) {
        BinaryTree<Integer> treeOne = new BinaryTree<>();
        for (int value : values) {
            treeOne.insertInLevelOrder(value);
        }
        return treeOne;
    }

}
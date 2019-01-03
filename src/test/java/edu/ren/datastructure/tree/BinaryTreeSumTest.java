package edu.ren.datastructure.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeSumTest {

    @Test
    public void sumOfTwoTrees() {
        BinaryTree<Integer> t1 = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTree<Integer> t2 = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        Node<Integer> resultTree = BinaryTreeSum.sumOfTwoTrees(t1.root, t2.root);
        BinaryTreePrinter.printNode(resultTree);
    }

    private BinaryTree<Integer> getIntegerBinaryTree(int... values) {
        BinaryTree<Integer> treeOne = new BinaryTree<>();
        for (int value : values) {
            treeOne.insertInLevelOrder(value);
        }
        return treeOne;
    }
}
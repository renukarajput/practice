package edu.ren.datastructure.tree;

import org.junit.Test;

public class ViewOfTreeTest extends BinaryTreeTest {
    ViewOfTree viewOfTree = new ViewOfTree();

    @Test
    public void left_1() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        BinaryTreePrinter.printNode(treeOne.root);
        viewOfTree.printLeftView(treeOne.root);
    }
    @Test
    public void right_1() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        BinaryTreePrinter.printNode(treeOne.root);
        viewOfTree.printRightView(treeOne.root);
    }

    private BinaryTree<Integer> getIntegerBinaryTree(int... values) {
        BinaryTree<Integer> treeOne = new BinaryTree<>();
        for (int value : values) {
            treeOne.insert(value);
        }
        return treeOne;
    }
}
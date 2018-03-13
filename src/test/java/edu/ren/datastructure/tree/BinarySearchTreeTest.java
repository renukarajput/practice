package edu.ren.datastructure.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Created by rrn3194 on 3/11/18.
 */
public class BinarySearchTreeTest {

    @Test
    public void kThSmallest() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.kThSmallest(3), is(40));
    }

    @Test
    public void searchInBst() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.searchInBst(binarySearchTree.root, 30), is(true));
    }

    @Test
    public void getMinValue() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.getMinValue(), is(10));
    }

    @Test
    public void getMaxValue() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 30, 10, 5, 40, 11, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.getMaxValue(), is(70));
    }

    @Test
    public void inOrderTraversal() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 30, 10, 5, 40, 11, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        binarySearchTree.inOrderTraversal();
    }

    @Test
    public void searchAlongWithPath() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30, 40, 5, 12, 50, 1, 6, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.search(6), is(Arrays.asList(20, 10, 5, 6)));
    }

    @Test
    public void searchAlongWithPathNegativeInput() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30, 40, 5, 12, 50, 1, 6, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.search(100), is(Arrays.asList()));
    }

    @Test
    public void deleteTree() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        Node<Integer> someNode = binarySearchTree.root.rightChild.rightChild;
        binarySearchTree.deleteTree();
        assertNull(binarySearchTree.root);
        assertNull(someNode.leftChild);
        assertNull(someNode.rightChild);
        assertNull(someNode.val);
       // assertThat(binarySearchTree.deleteTree());
    }

    private BinarySearchTree<Integer> getIntegerBinaryTree(int... values) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (Integer value : values) {
            tree.insert(value);
        }
        return tree;
    }

}

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
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30, 40);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.kThSmallest(3), is(30));
    }

    @Test
    public void kThSmallestWithOneElement() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.kThSmallest(1), is(20));
    }

    @Test
    public void kThSmallestWithElements() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20,15,10,30,50);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.kThSmallest(2), is(15));
    }
    @Test
    public void kThSmallestinput2() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(binarySearchTree.kThSmallest(6), is(60));
    }

    @Test
    public void preOrderInput1() {
        BinarySearchTree<Integer> binarySearchTree = getIntegerBinaryTree(20, 10, 30,9,11, 40, 35,25);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binarySearchTree.root);
        //binarySearchTree.preOrder();
    }

    @Test
    public void maxHeightInput1() {
        BinarySearchTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6);
        BinaryTreePrinter.printNode(treeOne.root);
        assertThat(treeOne.heightOfTree(treeOne.root), is(6));
    }

    @Test
    public void maxHeightInput2() {
        BinarySearchTree<Integer> treeOne = getIntegerBinaryTree(20, 10, 30,5,8,3,1);
        BinaryTreePrinter.printNode(treeOne.root);
        assertThat(treeOne.heightOfTree(treeOne.root), is(5));
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
        assertNull(someNode.getVal());
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

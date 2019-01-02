package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinarySearchCheckTest {

    @Test
    public void bstInput_1() {
        int[] arr = {5, 3, 4, 7, 8, 9, 1};
        BinarySearchTree tree = new TreeFromBFS().createFromArray(arr);
        BinaryTreePrinter.printNode(tree.root);
        assertThat(new BinarySearchCheck().isBinarySearchTree(tree.root), is(false));
    }

    @Test
    public void bstInput_2() {
        int[] arr = {5, 3, 4, 6, 7};
        BinarySearchTree tree = BinarySearchTree.fromArray(arr);
        BinaryTreePrinter.printNode(tree.root);
        assertThat(new BinarySearchCheck().isBinarySearchTree(tree.root), is(true));
    }

    @Test
    public void bstInput_3() {
        int[] arr = {3, 1, 2};
        BinarySearchTree tree = BinarySearchTree.fromArray(arr);
        BinaryTreePrinter.printNode(tree.root);
        assertThat(new BinarySearchCheck().isBinarySearchTree(tree.root), is(true));
    }

    @Test
    public void bstInput_4() {
        int[] arr = {5, 3, 4, 7, 8, 9, 1};
        BinarySearchTree tree = new BinarySearchTree().fromArray(arr);
        BinaryTreePrinter.printNode(tree.root);
        assertThat(new BinarySearchCheck().isBinarySearchTree(tree.root), is(true));
    }

    @Test
    public void bstCheck() {
        BinarySearchTree binarySearchTree = new TreeFromBFS().createFromArray(new int[]{10, 9, 12, 7, 15, 11, 20});
        BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(new BinarySearchCheck().isBinarySearchTree(binarySearchTree.root), is(false));
    }

    @Test
    public void max() {
        BinarySearchTree binarySearchTree = new TreeFromBFS().createFromArray(new int[]{10, 9, 12, 7, 15, 11, 20});
        BinaryTreePrinter.printNode(binarySearchTree.root);
    }
}

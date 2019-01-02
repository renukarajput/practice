package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class PathSumExistsAbstractTest {

    @Test
    public void sumExists() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(getPathSumExists().sumExists(binarySearchTree, 12), is(true));
    }

    @Test
    public void sumExists_1() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(getPathSumExists().sumExists(binarySearchTree, 33), is(true));
    }

    @Test
    public void sumExists_2() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(getPathSumExists().sumExists(binarySearchTree, 40), is(true));
    }

    @Test
    public void sumExists_missing() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(getPathSumExists().sumExists(binarySearchTree, 18), is(false));

    }

    @Test
    public void sumExists_missing_1() {
        int[] nodes1 = {5, 3, 4, 15, 13, 20};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(getPathSumExists().sumExists(binarySearchTree, 48), is(false));

    }

    @Test
    public void sumExists_missing_2() {
        int[] nodes1 = {5};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(getPathSumExists().sumExists(binarySearchTree, 6), is(false));

    }

    @Test
    public void sumExists_missing_3() {
        int[] nodes1 = {5};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        assertThat(getPathSumExists().sumExists(binarySearchTree, 5), is(true));

    }

    @Test
    public void sum_1() {
        BinarySearchTree binarySearchTree = getBinarySearchTree();
        assertThat(getPathSumExists().sumExists(binarySearchTree, 21), is(true));
    }

    private static BinarySearchTree getBinarySearchTree() {
        TreeNode node = getNode(5);
        node.left = getNode(4);
        node.left.left = getNode(2);
        node.left.left.right = getNode(1);

        node.right = getNode(11);
        node.left.right = getNode(3);

        node.right.left = getNode(6);
        node.right.right = getNode(4);

        node.right.right.left = getNode(1);
        node.right.right.right = getNode(8);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = node;
        return binarySearchTree;
    }

    abstract protected PathSumExists getPathSumExists();

    static TreeNode getNode(int num) {
        return new TreeNode(num);
    }
}


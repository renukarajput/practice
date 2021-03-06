package edu.ren.datastructure.tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinaryTreeTest {

    @Test
    public void testInsertInLevelOrder() {
        BinaryTree<Integer> binaryTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binaryTree.root);
    }

    @Test
    public void testSearchPath() {
        BinaryTree<Integer> binaryTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binaryTree.root);
        assertThat(binaryTree.searchPath(50), is(Arrays.asList(20, 10, 50)));
    }

    @Test
    public void testSearchPath1() {
        BinaryTree<Integer> binaryTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binaryTree.root);
        assertThat(binaryTree.searchPath(100), is(Collections.EMPTY_LIST));
    }

    @Test
    public void testSearchPath2() {
        BinaryTree<Integer> binaryTree = getIntegerBinaryTree(20, 10, 30, 40, 50, 60, 70);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binaryTree.root);
        assertThat(binaryTree.searchPath(40), is(Arrays.asList(20, 10, 40)));
    }

    @Test
    public void testInsert() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(20);
        binaryTree.insert(10);
        binaryTree.insert(30);
        binaryTree.insert(40);
        binaryTree.insert(50);
        binaryTree.insert(60);
        binaryTree.insert(70);

        List<Integer> preOrder = binaryTree.preOrderValues();
        System.out.print(preOrder);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binaryTree.root);
    }

    @Test
    public void testParentNode() {

        BinaryTree<Integer> treeOne = getIntegerBinaryTree(10, 5, 8, 1, 2, 3, 4);

        List<Integer> preOrder = treeOne.preOrderValues();
        System.out.print(preOrder);
        System.out.println("\n");
        BinaryTreePrinter.printNode(treeOne.root);

        Node childNode = treeOne.root.leftChild.rightChild;
        Node parentNode = treeOne.getParentNode(treeOne.root, childNode);
        assertThat(parentNode.getVal(), is(5));

        Node childNode1 = treeOne.root.leftChild;
        Node parentNode1 = treeOne.getParentNode(treeOne.root, childNode1);
        assertThat(parentNode1.getVal(), is(10));

        Node rightMostNode = (treeOne.getRightMostNode(treeOne.root));
        assertThat(rightMostNode.getVal(), is(4));

        treeOne.deleteGivenNode(treeOne.root.leftChild);
        System.out.println("\n");
        BinaryTreePrinter.printNode(treeOne.root);
    }

    @Test
    public void testTreeStructuralSimilarity() {

        BinaryTree<Integer> treeOne = getIntegerBinaryTree(10, 5, 8, 1, 2, 3, 4);

        BinaryTree<Integer> treeTwo = getIntegerBinaryTree(10, 5, 8, 1, 2, 3, 4);

        assertThat(treeOne.isTreeSame(treeOne, treeTwo), is(true));
    }

    @Test
    public void testTreeStructuralDisSimilarity () {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(10, 5, 8, 1, 2, 3, 4);

        BinaryTree<Integer> treeTwo = getIntegerBinaryTree(10, 5, 8, 1, 2, 3, 4, 11);

        assertThat(treeOne.isTreeSame(treeOne, treeTwo), is(false));
    }

    @Test
    public void isSameTree () {

        BinaryTree<Integer> treeOne = getIntegerBinaryTree(10, 5, 8, 1, 2, 3, 4);

        BinaryTree<Integer> treeTwo = getIntegerBinaryTree(10, 5, 8, 1, 2, 3, 4);

        assertThat(treeOne.isSameTree(treeOne.root, treeTwo.root), is(1));
    }

    @Test
    public void isSameTree_1 () {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(10, 5, 8, 1, 2, 3, 4);

        BinaryTree<Integer> treeTwo = getIntegerBinaryTree(10, 5, 4, 1, 2, 3, 6);

        assertThat(treeOne.isSameTree(treeOne.root, treeTwo.root), is(0));
    }

    @Test
    public void testLCA() {

        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        BinaryTreePrinter.printNode(treeOne.root);
        testLCA(treeOne, 2, 5);
        System.out.println();
        testLCA(treeOne, 9, 5);
        // testLCA(treeOne,0,0);
    }

    private void testLCA(BinaryTree<Integer> treeOne, int p, int q) {
        Node<Integer> out = treeOne.findLowestCommonAncestor(treeOne.root, p, q);
        System.out.println("\nLCA of " + p + " and " + q + "= " + out.getVal());
//        assertThat(treeOne.findLCA(treeOne.root, 2, 3), is(1));
        System.out.println("number of recursive calls = " + BinaryTree.cnt);
    }

    @Test
    public void testBFSLineByLine() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.printBfsByLine();
    }

    @Test
    public void testIterativeInOrder() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.iterativeInorder();
    }

    @Test
    public void testInOrderByLoop() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.inOrderByLoop();
    }

    @Test
    public void kThSmallestElment() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(treeOne.root);
        assertThat(treeOne.kThSmallest(3), is(4));
    }

    @Test
    public void testZigZagOrderTraversalUsingStack() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.printZigZagOrderUsingStack();
    }

    //input upto 2 level
    @Test
    public void testZigZagOrderTraversal() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.printZigZagOrder();
    }

    @Test
    public void testZigZagOrder1() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.printZigZagOrder1();
    }

    //input for more than 2 level
    @Test
    public void testZigZagOrder() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.printZigZagOrder();
    }

    @Test
    public void testBFSInOneLine() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.printByBfs();
    }

    @Test
    public void testBFSLineByLineUsingMarker() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(treeOne.root);

        treeOne.bfsByLineUsingMarker();
    }

    private BinaryTree<Integer> getIntegerBinaryTree(int... values) {
        BinaryTree<Integer> treeOne = new BinaryTree<>();
        for (int value : values) {
            treeOne.insertInLevelOrder(value);
        }
        return treeOne;
    }

    @Test
    public void testInsertBroken() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insertInBinaryTreee(20);
        binaryTree.insertInBinaryTreee(10);
        binaryTree.insertInBinaryTreee(30);
        BinaryTreePrinter.printNode(binaryTree.root);
        binaryTree.insertInBinaryTreee(40);
        BinaryTreePrinter.printNode(binaryTree.root);
        binaryTree.insertInBinaryTreee(50);
        BinaryTreePrinter.printNode(binaryTree.root);
        binaryTree.insertInBinaryTreee(60);
        BinaryTreePrinter.printNode(binaryTree.root);
        binaryTree.insertInBinaryTreee(70);
        BinaryTreePrinter.printNode(binaryTree.root);
        List<Integer> preOrder = binaryTree.preOrderValues();
        System.out.print(preOrder);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binaryTree.root);
    }

    @Test
    public void testSumOfAllNode() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(12, 40, 20, 30, 1, 2, 3, 4, 5, 6);
        BinaryTreePrinter.printNode(treeOne.root);
        assertThat(treeOne.sumOfNumberOfNodes(treeOne.root), is(10));

    }

    @Test
    public void maxHeightInput1() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6);
        BinaryTreePrinter.printNode(treeOne.root);
        assertThat(treeOne.heightOfTree(treeOne.root), is(3));
    }

    @Test
    public void maxHeightInput2() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7, 8);
        BinaryTreePrinter.printNode(treeOne.root);
        assertThat(treeOne.heightOfTree(treeOne.root), is(4));
    }

    @Test
    public void testMirrorTree() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(treeOne.root);
        Node<Integer> mirrorTree = treeOne.createMirrorTree(treeOne.root);
        BinaryTreePrinter.printNode(mirrorTree);
//        assertThat(treeOne.createMirrorTree(treeOne.root),is(10));
    }

    @Test
    public void isMirrorTree() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 2, 3, 4, 4, 3);
        BinaryTreePrinter.printNode(treeOne.root);
        Node<Integer> mirrorTree = treeOne.createMirrorTree(treeOne.root);
        BinaryTreePrinter.printNode(mirrorTree);
//        assertThat(treeOne.createMirrorTree(treeOne.root),is(10));
    }

    @Test
    public void findKthSmallest() {
        BinaryTree<Integer> treeOne = getIntegerBinaryTree(1, 2, 3, 4, 5, 6, 7);
        BinaryTreePrinter.printNode(treeOne.root);
        treeOne.findkThSmallest(treeOne.root, 3);
    }


}
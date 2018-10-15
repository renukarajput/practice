package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.List;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;

public abstract class PathSumExistsInAllPathsAbstractTest {
    @Test
    public void sumExists_1() {
        int[] nodes1 = {5, 3, 4, 7};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        List<List<Integer>> allPaths = getPathSumExistsInAllPaths().getAllPaths(binarySearchTree, 12);
        assertThat(allPaths.get(0),contains(5,3,4));
        assertThat(allPaths.get(1),contains(5,7));
    }

    @Test
    public void sumExists_2() {
        int[] nodes1 = {5, 3, 4, 7};
        BinarySearchTree binarySearchTree = fromArray(nodes1);
        List<List<Integer>> allPaths = getPathSumExistsInAllPaths().getAllPaths(binarySearchTree, 12);
        assertThat(allPaths.get(0),contains(5,3,4));
        assertThat(allPaths.get(1),contains(5,7));
    }

    @Test
    public void sum(){
        BinarySearchTree binarySearchTree = getBinarySearchTree();
        List<List<Integer>> allPaths = getPathSumExistsInAllPaths().getAllPaths(binarySearchTree, 12);
        assertThat(allPaths.get(0),contains(5,4,2,1));
        assertThat(allPaths.get(1),contains(5,4,3));
    }

    @Test
    public void sum_1(){
        BinarySearchTree binarySearchTree = getBinarySearchTree();
        List<List<Integer>> allPaths = getPathSumExistsInAllPaths().getAllPaths(binarySearchTree, 21);
        assertThat(allPaths.get(0),contains(5,11,5));

        assertThat(allPaths.get(1),contains(5,11,4,1));
    }
    private static BinarySearchTree getBinarySearchTree() {
        TreeNode node=getNode(5);
        node.left=getNode(4);
        node.left.left=getNode(2);
        node.left.left.right=getNode(1);

        node.right=getNode(11);
        node.left.right=getNode(3);

        node.right.left=getNode(5);
        node.right.right=getNode(4);

        node.right.right.left=getNode(1);
        node.right.right.right=getNode(8);

        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.root=node;
        return binarySearchTree;
    }


    @Test
    public void sum_11(){
        BinarySearchTree binarySearchTree = getBinarySearchTree1();
        BinaryTreePrinter.printNode(binarySearchTree.root);
        List<List<Integer>> allPaths = getPathSumExistsInAllPaths().getAllPaths(binarySearchTree, 21);
        assertThat(allPaths.get(0),contains(5,11,0,0,5,0));

        assertThat(allPaths.get(1),contains(5,11,4,1));
    }

    @Test
    public void sum_12(){
        BinarySearchTree binarySearchTree = getBinarySearchTree1();
        List<List<Integer>> allPaths = getPathSumExistsInAllPaths().getAllPaths(binarySearchTree, 12);
        assertThat(allPaths.get(0),contains(5,4,2,1));
        assertThat(allPaths.get(1),contains(5,4,3));
    }

    @Test
    public void sum_13(){
        BinarySearchTree binarySearchTree = getBinarySearchTree1();
        List<List<Integer>> allPaths = getPathSumExistsInAllPaths().getAllPaths(binarySearchTree, 28);
        assertThat(allPaths.get(0),contains(5,11,4,8));
    }


    private static BinarySearchTree getBinarySearchTree1() {
        TreeNode node=getNode(5);
        node.left=getNode(4);
        node.left.left=getNode(2);
        node.left.left.right=getNode(1);

        node.right=getNode(11);
        node.left.right=getNode(3);

        node.right.left=getNode(0);
        node.right.right=getNode(4);
        node.right.left.left=getNode(0);
        node.right.left.left.left=getNode(5);
        node.right.left.left.left.left=getNode(0);

        node.right.right.left=getNode(1);
        node.right.right.right=getNode(8);

        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.root=node;
        return binarySearchTree;
    }

    abstract protected PathSumExistsInAllPaths getPathSumExistsInAllPaths();
    static TreeNode getNode(int num){
        return new TreeNode(num);
    }


}

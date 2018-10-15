package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class AllPathsOfBinaryTreeTest {

    @Test
    public void getAllPaths() {
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{1,2,6,3,5,8,-1,4,-1,7,-1,2,3});
        BinaryTreePrinter.printNode(binarySearchTree.root);
        AllPathsOfBinaryTree allPaths = new AllPathsOfBinaryTree();
        assertThat(allPaths.getAllPaths(binarySearchTree).get(0),contains(1,2,3,4));
        assertThat(allPaths.getAllPaths(binarySearchTree).get(1),contains(1,2,5,7));
        assertThat(allPaths.getAllPaths(binarySearchTree).get(2),contains(1,6,8,2));
        assertThat(allPaths.getAllPaths(binarySearchTree).get(3),contains(1,6,8,3));
    }
}
package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FlattenBinaryTreeTest {

    @Test
    public void flatten() {
        BinaryTree binaryTree = new TreeFromBFS().createFromArray(new int[]{1, 2, 7, 3, 6, 8, 9, 4, 5, -1, -1, -1, -1, -1, -1, -1, -1, 12, 13});
        BinaryTreePrinter.printNode(binaryTree.root);
        TreeNode flattenTree = new FlattenBinaryTree().flatten(binaryTree);
        expect(flattenTree,1, 2, 3, 4, 5, 12, 13, 6, 7, 8, 9);
    }

   @Test
    public void flatten_1() {
        BinaryTree binaryTree = new TreeFromBFS().createFromArray(new int[]{1, 2, 3,4,5,6,7,8,-1,-1,9,10,11,12});
        BinaryTreePrinter.printNode(binaryTree.root);
        TreeNode flattenTree = new FlattenBinaryTree().flatten(binaryTree);
        expect(flattenTree,1, 2, 4, 8, 5, 9, 3, 6, 10, 11, 7, 12);
    }
    @Test
    public void flatten_2() {
        BinaryTree binaryTree = new TreeFromBFS().createFromArray(new int[]{1, -1, 3,4,5,6,7,8,9,10,11,12});
        BinaryTreePrinter.printNode(binaryTree.root);
        TreeNode flattenTree = new FlattenBinaryTree().flatten(binaryTree);
        expect(flattenTree,1, 3, 6, 12, 7);
    }

    @Test
    public void flatten_3() {
        BinaryTree binaryTree = new TreeFromBFS().createFromArray(new int[]{1,8, -1, 3,4,5,6,7,8,9,10,11,12});
        BinaryTreePrinter.printNode(binaryTree.root);
        TreeNode flattenTree = new FlattenBinaryTree().flatten(binaryTree);
        expect(flattenTree,1,8,3,7,8,4,9,10);
    }


    private void expect(TreeNode flattenTree, Integer... expectedElements) {
        final List<Integer> expectedList = new ArrayList<>();
        while (flattenTree != null) {
            expectedList.add(flattenTree.val);
            flattenTree = flattenTree.right;
        }
        assertThat(expectedList, is(Arrays.asList(expectedElements)));
    }
}
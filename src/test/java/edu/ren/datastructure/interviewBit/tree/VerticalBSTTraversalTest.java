package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class VerticalBSTTraversalTest {

   public static BinarySearchTree fromArray(int[] nodes) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int node : nodes) {
            binarySearchTree.insert(node);

        }
        return binarySearchTree;
    }

    @Test
    public void getVerticalNodeValues() {
        int[] nodes = {5, 3, 4, 15, 13, 20};
        ArrayList<ArrayList<Integer>> verticalNodes = new VerticalBSTTraversal().getVerticalNodeValues(fromArray(nodes));
        assertThat(verticalNodes.get(0),contains(3));
        assertThat(verticalNodes.get(1),contains(5,4,13));
        assertThat(verticalNodes.get(2),contains(15));
        assertThat(verticalNodes.get(3),contains(20));
    }
}
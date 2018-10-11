package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class ZigZagTraversalTest {

    @Test
    public void zigzag_0() {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,-1};
        BinarySearchTree tree = new TreeFromBFS().createFromArray(arr);
        ArrayList<ArrayList<Integer>> zigzag = new ZigZagTraversal().zigzag(tree);
        assertThat(zigzag.get(0),contains(1));
        assertThat(zigzag.get(1),contains(3,2));
        assertThat(zigzag.get(2),contains(4,5,6,7));
        assertThat(zigzag.get(3),contains(14,13,12,11,10,9,8));

    }
    @Test
    public void zigzag() {
        int[] arr={3,9,20,-1,-1,15,7};
        BinarySearchTree tree = new TreeFromBFS().createFromArray(arr);
        ArrayList<ArrayList<Integer>> zigzag = new ZigZagTraversal().zigzag(tree);
        assertThat(zigzag.get(0),contains(3));
        assertThat(zigzag.get(1),contains(20,9));
        assertThat(zigzag.get(2),contains(15,7));

    }

    @Test
    public void zigzag_1() {
        int[] arr={3,9,20,5,8,15,7};
        BinarySearchTree tree = new TreeFromBFS().createFromArray(arr);
        ArrayList<ArrayList<Integer>> zigzag = new ZigZagTraversal().zigzag(tree);
        assertThat(zigzag.get(0),contains(3));
        assertThat(zigzag.get(1),contains(20,9));
        assertThat(zigzag.get(2),contains(5,8,15,7));

    }

    @Test
    public void zigzag_2() {
        int[] arr={3,9,20,5,8,-1,7};
        BinarySearchTree tree = new TreeFromBFS().createFromArray(arr);
        ArrayList<ArrayList<Integer>> zigzag = new ZigZagTraversal().zigzag(tree);
        assertThat(zigzag.get(0),contains(3));
        assertThat(zigzag.get(1),contains(20,9));
        assertThat(zigzag.get(2),contains(5,8,7));

    }
}
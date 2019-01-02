package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class TreeFromBFSTest {

    @Test
    public void createFromArray() {
        int[] arr={5,3,4,-1,7,8,9};
        BinarySearchTree tree = new TreeFromBFS().createFromArray(arr);
        assertThat(tree.root.val,is(5));
        assertThat(tree.root.left.val,is(3));
        assertThat(tree.root.right.val,is(4));
        assertThat(tree.root.left.left,is(nullValue()));
        assertThat(tree.root.left.right.val,is(7));
        assertThat(tree.root.right.left.val,is(8));
        assertThat(tree.root.right.right.val,is(9));
    }
}
package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinarySearchTreeTest {

    @Test
    public void binarySearchTree(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(15);
        binarySearchTree.insert(4);
        binarySearchTree.insert(1);
        binarySearchTree.insert(20);
        assertThat(binarySearchTree.root.val,is(5));
        assertThat(binarySearchTree.root.right.val,is(15));
        assertThat(binarySearchTree.root.right.right.val,is(20));
        assertThat(binarySearchTree.root.left.val,is(4));
        assertThat(binarySearchTree.root.left.left.val,is(1));
        assertThat(binarySearchTree.root.left.left.left,is(nullValue()));
        assertThat(binarySearchTree.root.left.left.right,is(nullValue()));
    }

    public static void main(String[] args) {
        final test[] values = Some.some1.values();
        System.out.println(Arrays.toString(values));
    }

    interface test{
         default test[] values(){
            return new test[0];
        }
    }
    enum Some implements test{
        some1,
        some2,
        some3;
    }

}

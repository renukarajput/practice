package edu.ren.datastructure.interviewBit.tree;

import javaPro.B;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class BSTIteratorTest {

    @Test
    public void iterator() {
        BinarySearchTree binarySearchTree= BinarySearchTree.fromArray(new int[]{5,6,7,8,1,2,3,4});
        BinaryTreePrinter.printNode(binarySearchTree.root);
        BSTIterator bstIterator = new BSTIterator(binarySearchTree);
        List<Integer> list=new ArrayList<>();
        while (bstIterator.hasNext()){
            list.add(bstIterator.next());
        }
        assertThat(list,contains(1,2,3,4,5,6,7,8));
    }
}
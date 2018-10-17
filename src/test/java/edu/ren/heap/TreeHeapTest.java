package edu.ren.heap;

import edu.ren.datastructure.tree.BinaryTreePrinter;
import org.junit.Test;

/**
 * Created by rrn3194 on 6/10/18.
 */
public class TreeHeapTest {

    @Test
    public void input_0() {
        Integer[] elements = {10, 5, 8, 1, 2, 3, 4};
        TreeHeap<Integer> treeHeap = new TreeHeap().fromHeapArray(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());

    }
}
package edu.ren.heap;

import edu.ren.datastructure.tree.BinaryTreePrinter;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by rrn3194 on 6/12/18.
 */
public class ArrayHeapTest {

    @Test
    public void input_0() {
       // Integer[] elements = {1, 5, 4, 3, 10, 8, 2};
        Integer[] elements = {4, 1, 3, 2, 16, 9,10,14,8,7};

        System.out.println(Arrays.toString(elements));
        TreeHeap<Integer> treeHeap = new TreeHeap(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
        ArrayHeap<Integer> arrayHeap = new ArrayHeap<>();
        arrayHeap.buildMaxHeap(elements);
        System.out.println(Arrays.toString(elements));
         treeHeap = new TreeHeap(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());

    }

    @Test
    public void input_1() {
         Integer[] elements = {1, 5, 4, 3, 10, 8, 2};
        System.out.println(Arrays.toString(elements));
        TreeHeap<Integer> treeHeap = new TreeHeap(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
        ArrayHeap<Integer> arrayHeap = new ArrayHeap<>();
        arrayHeap.buildMaxHeap(elements);
        System.out.println(Arrays.toString(elements));
        treeHeap = new TreeHeap(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());

    }

}
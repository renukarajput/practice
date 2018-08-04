package edu.ren.heap;

import edu.ren.datastructure.tree.BinaryTreePrinter;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;

/**
 * Created by rrn3194 on 6/12/18.
 */
public class ArrayHeapTest {

    @Test
    public void buildMaxHeapWith_input_0() {
        // Integer[] elements = {1, 5, 4, 3, 10, 8, 2};
        Integer[] elements = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};

        System.out.println(Arrays.toString(elements));
        TreeHeap<Integer> treeHeap = new TreeHeap().fromHeapArray(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
        ArrayHeap<Integer> arrayHeap = new ArrayHeap<>(elements);
        System.out.println(Arrays.toString(elements));
        treeHeap = new TreeHeap().fromHeapArray(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
        Integer[] expectedHeapArray={16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
       assertArrayEquals(expectedHeapArray,arrayHeap.getInternalArray());

    }

    @Test
    public void buildMaxHeapWith_input_1() {
        Integer[] elements = {1, 5, 4, 3, 10, 8, 2};
        System.out.println(Arrays.toString(elements));
        TreeHeap<Integer> treeHeap = new TreeHeap().fromHeapArray(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
        ArrayHeap<Integer> arrayHeap = new ArrayHeap<>(elements);
        System.out.println(Arrays.toString(elements));
        treeHeap = new TreeHeap().fromHeapArray(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
        Integer[] expectedHeapArray={10, 5, 8, 3, 1, 4, 2};
        assertArrayEquals(expectedHeapArray,arrayHeap.getInternalArray());

    }

    @Test
    public void input_2() {
        Integer[] elements = {1, 5, 4, 3, 10, 8, 2};

        TreeHeap<Integer> treeHeap = new TreeHeap().fromHeapArray(elements);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());

        ArrayHeap<Integer> arrayHeap = new ArrayHeap<>(elements);
        treeHeap = new TreeHeap().fromHeapArray(arrayHeap.getInternalArray());
        System.out.println("heap arr = "+ Arrays.toString(arrayHeap.getInternalArray()));

        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
        System.out.println("****************");

        arrayHeap.add(9);
        treeHeap = new TreeHeap().fromHeapArray(arrayHeap.getInternalArray());
        System.out.println("heap arr = "+ Arrays.toString(arrayHeap.getInternalArray()));
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
        Integer[] expectedHeapArray= {10, 9, 8, 5, 1, 4, 2, 3};
        assertArrayEquals(expectedHeapArray,arrayHeap.getInternalArray());
    }

    @Test
    public void insert() {
        Integer[] elements = {1, 5, 4, 3, 10, 8};
        ArrayHeap<Integer> arrayHeap = new ArrayHeap<>(elements);
        for (Integer elm : elements) {
            arrayHeap.add(elm);
        }
        TreeHeap<Integer> treeHeap = new TreeHeap().fromHeapArray(arrayHeap.heapArray);
        BinaryTreePrinter.printNode(treeHeap.getTree().getRoot());
    }
}
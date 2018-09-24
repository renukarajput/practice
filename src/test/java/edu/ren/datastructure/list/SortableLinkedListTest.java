package edu.ren.datastructure.list;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortableLinkedListTest {
    @Test
    public void input1() {
        LinkedList<Integer> linkedList = getIntegerList(3, 1, 4, 2);
        SortableLinkedList<Integer> s1 = new SortableLinkedList<>(linkedList.head);
        assertThat((s1.mergeSort(linkedList.head)).toString(), is("1->2->3->4"));
    }

    @Test
    public void input2() {
        LinkedList<Integer> linkedList = getIntegerList(50, 60, 10, 3, 1, 4, 2);
        SortableLinkedList<Integer> s1 = new SortableLinkedList<>(linkedList.head);
        assertThat((s1.mergeSort(linkedList.head)).toString(), is("1->2->3->4->10->50->60"));
    }

    @Test
    public void testInPlaceMergeSort() {
        LinkedList<Integer> linkedList = getIntegerList(60,10,3,1,4,2,50);

        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList<>(linkedList.head);
        sortableLinkedList.mergeSortInPlace();
        assertThat(sortableLinkedList.toString(), is("1->2->3->4->10->50->60"));
    }

    @Test
    public void testMergeSortInput1() {
        LinkedList<Integer> linkedList = getIntegerList(10, 5, 6, 8, 2, 3, 1, 4);
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList<>(linkedList.head);

        sortableLinkedList.mergeSortInPlace();
        assertThat(sortableLinkedList.toString(), is("1->2->3->4->5->6->8->10"));
    }

    @Test
    public void testMergeSortInput2() {
        LinkedList<Integer> linkedList = getIntegerList(10);
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList<>(linkedList.head);

        sortableLinkedList.mergeSortInPlace();
        assertThat(sortableLinkedList.toString(), is("10"));
    }

    @Test
    public void testMergeSortInput3() {
        LinkedList<Integer> linkedList = getIntegerList(10,5);
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList<>(linkedList.head);

        sortableLinkedList.mergeSortInPlace();
        assertThat(sortableLinkedList.toString(), is("5->10"));
    }

    private LinkedList<Integer> getIntegerList(int... values) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int value : values) {
            list.insertAtEnd(value);
        }
        return list;
    }

    @Test
    public void testMergeSortWithConstantSpace() {
        Integer[] arr1 = {1, 3, 5, 7};
        Integer[] arr2 = {2, 4, 6, 8};
        List<Integer> list1 = new java.util.LinkedList<>();
        List<Integer> list2 = new java.util.LinkedList<>();
        list1.addAll(Arrays.asList(arr1));
        list2.addAll(Arrays.asList(arr2));
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList(null);
        sortableLinkedList.mergeListsInPlace(list1, list2);
        assertThat(list1, contains(1, 2, 3, 4, 5, 6, 7, 8));

    }

    @Test
    public void testMergeSortWithConstantSpaceInput1() {
        Integer[] arr1 = {2, 4, 6, 8};
        Integer[] arr2 = {1, 3, 5, 7};
        List<Integer> list1 = new java.util.LinkedList<>();
        List<Integer> list2 = new java.util.LinkedList<>();
        list1.addAll(Arrays.asList(arr1));
        list2.addAll(Arrays.asList(arr2));
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList(null);
        sortableLinkedList.mergeListsInPlace(list1, list2);
        assertThat(list1, contains(1, 2, 3, 4, 5, 6, 7, 8));

    }


}
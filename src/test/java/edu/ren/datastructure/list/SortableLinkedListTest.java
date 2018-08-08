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
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList<>(new Node<>(50));
        sortableLinkedList.insertAtEnd(60);
        sortableLinkedList.insertAtEnd(10);
        sortableLinkedList.insertAtEnd(3);
        sortableLinkedList.insertAtEnd(1);
        sortableLinkedList.insertAtEnd(4);
        sortableLinkedList.insertAtEnd(2);
        sortableLinkedList.mergeSortInPlace();
        assertThat(sortableLinkedList.toString(), is("1->2->3->4->10->50->60"));
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
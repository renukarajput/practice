package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortableLinkedListTest {
    @Test
    public void input1() {
        LinkedList<Integer> linkedList = getIntegerList(3, 1, 4, 2);
        SortableLinkedList<Integer> s1 = new SortableLinkedList<>(linkedList);
        assertThat((s1.mergeSort(linkedList.head)).toString(), is("1->2->3->4"));
    }

    @Test
    public void input2() {
        LinkedList<Integer> linkedList = getIntegerList(50, 60, 10, 3, 1, 4, 2);
        SortableLinkedList<Integer> s1 = new SortableLinkedList<>(linkedList);
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
}
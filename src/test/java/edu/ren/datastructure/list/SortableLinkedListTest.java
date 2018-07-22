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

    @Test
    public void testReverseK() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 3, 4, 5, 6);
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList<>(linkedList);
        assertThat(sortableLinkedList.toString(), is("1->2->3->4->5->6"));
        sortableLinkedList.reverseK(2);
        assertThat(sortableLinkedList.toString(), is("2->1->4->3->6->5"));
    }

    @Test
    public void testReverseFullList() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 3, 4, 5, 6);
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList<>(linkedList);
        assertThat(sortableLinkedList.toString(), is("1->2->3->4->5->6"));
        Node<Integer> head = sortableLinkedList.head;
        Node<Integer> start = sortableLinkedList.reverseSubList(head, 6);
        assertThat(new SortableLinkedList(start).toString(),is("6->5->4->3->2->1"));
    }

    @Test
    public void testReverseSublist() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 3, 4, 5, 6);
        SortableLinkedList<Integer> sortableLinkedList = new SortableLinkedList<>(linkedList);
        assertThat(sortableLinkedList.toString(), is("1->2->3->4->5->6"));
        Node<Integer> head = sortableLinkedList.head;
        Node<Integer> start = sortableLinkedList.reverseSubList(head, 4);
        assertThat(new SortableLinkedList(start).toString(),is("4->3->2->1"));
    }
        private LinkedList<Integer> getIntegerList(int... values) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int value : values) {
            list.insertAtEnd(value);
        }
        return list;
    }
}
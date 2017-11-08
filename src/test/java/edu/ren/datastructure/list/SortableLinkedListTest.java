package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/2/17.
 */
public class SortableLinkedListTest {
    @Test
    public void input1()  {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(0);
        SortableLinkedList<Integer> s1 = new SortableLinkedList<>(linkedList);
        assertThat((s1.mergeSort(linkedList.head)).toString(), is("0->1->2->3->4->5->6"));
    }

    @Test
    public void input2()  {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(60);
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(2);
        SortableLinkedList<Integer> s1 = new SortableLinkedList<>(linkedList);
        assertThat((s1.mergeSort(linkedList.head)).toString(), is("1->2->3->4->10->50->60"));
    }
}
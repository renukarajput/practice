package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/2/17.
 */
public class SortableLinkedListTest {
    @Test
    public void mergeSort()  {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);   // 50 40 70 80 30 10   // 10 20 40 50 70 80
        linkedList.insertAtEnd(30);   //
        linkedList.insertAtEnd(80);
        linkedList.insertAtEnd(70);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
//        linkedList.insertAtEnd(100);
//        linkedList.insertAtEnd(20);
//        linkedList.insertAtEnd(90);
//        linkedList.insertAtEnd(60);
        SortableLinkedList<Integer> s1 = new SortableLinkedList<>(linkedList);
        assertThat(s1.mergeSort(linkedList.head), is("10->30->40->50->70->80"));
//        assertThat(s1.mergeSort(linkedList.head), is("10->20->30->40->50->60->70->80->90->100"));
    }
}
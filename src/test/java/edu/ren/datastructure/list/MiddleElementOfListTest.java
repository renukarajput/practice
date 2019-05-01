package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MiddleElementOfListTest {

    MiddleElementOfList middleElementOfList = new MiddleElementOfList();
    @Test
    public void getMiddleElement_1() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(50);
        linkedList.insertAtBeginning(30);
        linkedList.insertAtBeginning(40);
        linkedList.insertAtBeginning(60);
        assertThat(middleElementOfList.getMiddleElement(linkedList.head).data, is(30));
    }
    @Test
    public void getMiddleElement_2() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(50);
        linkedList.insertAtBeginning(30);
        linkedList.insertAtBeginning(40);
        linkedList.insertAtBeginning(50);
        linkedList.insertAtBeginning(60);
        assertThat(middleElementOfList.getMiddleElement(linkedList.head).data, is(40));
    }
}
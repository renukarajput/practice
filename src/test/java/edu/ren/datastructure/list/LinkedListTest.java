package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LinkedListTest {
    @Test
    public void stringInput() {
      LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning("renuka");
        linkedList.insertAtBeginning("noopur");
        linkedList.insertAtBeginning("shivani");
        linkedList.insertAtBeginning("sneha");
        linkedList.insertAtEnd("rakesh");
        linkedList.insertAtEndUsingGet("anjali");
        linkedList.insertAtEndUsingGet("jay");
        String [] expectedElem = {"sneha","shivani","noopur","renuka","rakesh","anjali","jay"};

        for (int i = 0; i < expectedElem.length; i++) {
            assertEquals(expectedElem[i],linkedList.get(i));
        }
        assertEquals(7,linkedList.size());

//        linkedList.deleteGivenIndexNode(1);
        linkedList.deleteFirst();
        assertEquals(6,linkedList.size());

//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.print(linkedList.get(i)+" => ");
//        }

        linkedList.deleteLast();
        assertEquals(5,linkedList.size());

        linkedList.deleteLast();
        assertEquals(4,linkedList.size());

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i)+" => ");
        }
    }

    @Test
    public void integerInput() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(50);
        linkedList.insertAtBeginning(30);
        linkedList.insertAtBeginning(40);
        linkedList.insertAtBeginning(60);
        linkedList.insertAtEnd(70);
        linkedList.insertAtEndUsingGet(80);
        linkedList.insertAtEndUsingGet(90);
        linkedList.insertAtEndUsingGet(95);
        linkedList.insertAtEndUsingGet(100);

        Integer [] expectedElem = {60, 40, 30, 50, 10, 70,80, 90, 95, 100};

        for (int i = 0; i < expectedElem.length; i++) {
            assertEquals(expectedElem[i],linkedList.get(i));
        }
        assertEquals(10,linkedList.size());

//        System.out.println(linkedList.getNthFromLast(4));
//        System.out.println(linkedList.getNthFromLastUsingOneLoop(4));
        assertEquals((Integer) 90,linkedList.getNthFromLast(3));
        assertEquals((Integer) 90,linkedList.getNthFromLastUsingOneLoop(3));
        assertThat(linkedList.getNthFromLast(3),is(90));


    }

    @Test
    public void cyclicListInput() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(50);
        linkedList.insertAtBeginning(30);
        linkedList.insertAtBeginning(40);
        linkedList.insertAtBeginning(60);
        LoopLinkList<Integer> loopLinkList = new LoopLinkList<>(linkedList, 1);
        assertThat(loopLinkList.size(),is(6));
        assertThat(loopLinkList.hasLoop(),is(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void cyclicListInputOutOfBound() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(10);

        LoopLinkList<Integer> loopLinkList = new LoopLinkList<>(linkedList, 4);
        Integer [] expectedElem = {60, 40, 30, 50, 10, 20, 50};
    }

    @Test
    public void insertInSortedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        linkedList.insertInSortedList(30);
        Integer [] expectedElem = {10,20,30,40,50};

        for (int i = 0; i < expectedElem.length; i++) {
            assertEquals(expectedElem[i],linkedList.get(i));
        }
    }

    @Test
    public void reverseList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        linkedList.reverseList(linkedList.head);
        assertThat(linkedList.toString(), is("50->40->30->20->10"));
        assertThat(linkedList.get(2), is(30));
    }
}

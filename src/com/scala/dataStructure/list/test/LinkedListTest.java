package com.scala.dataStructure.list.test;

import com.scala.dataStructure.list.java.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

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
        Integer [] expectedElem = {60, 40, 30, 50, 10, 70,80};

        for (int i = 0; i < expectedElem.length; i++) {
            assertEquals(expectedElem[i],linkedList.get(i));
        }
        assertEquals(7,linkedList.size());

    }
}

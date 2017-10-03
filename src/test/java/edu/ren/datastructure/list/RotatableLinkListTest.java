package edu.ren.datastructure.list;

import org.junit.Test;

public class RotatableLinkListTest {

    @Test
    public void input() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        System.out.println(linkedList);
        RotatableLinkList<Integer> rotatableLinkList = new RotatableLinkList<>(linkedList);
        System.out.println("rotated = " + rotatableLinkList);
//        rotatableLinkList.rotateList(new Node<>(60));

    }
}
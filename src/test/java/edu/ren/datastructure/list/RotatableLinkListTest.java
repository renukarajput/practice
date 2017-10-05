package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RotatableLinkListTest {

    @Test
    public void testRotateClockwise() {
        LinkedList<Integer> linkedList = getTestLinkedList();
        RotatableLinkList<Integer> rotatableLinkList = new RotatableLinkList<>(linkedList);
        rotatableLinkList.rotateList(1, RotatableLinkList.DIRECTION.CLOCKWISE);
        assertThat(rotatableLinkList.toString(),is("50->10->20->30->40"));
        assertThat(rotatableLinkList.get(0),is(50));

        linkedList = getTestLinkedList();
        rotatableLinkList = new RotatableLinkList<>(linkedList);
        rotatableLinkList.rotateList(3, RotatableLinkList.DIRECTION.CLOCKWISE);
        assertThat(rotatableLinkList.toString(),is("30->40->50->10->20"));
        assertThat(rotatableLinkList.get(0),is(30));

    }

    @Test
    public void testRotateCounterClockwise() {
        LinkedList<Integer> linkedList = getTestLinkedList();
        RotatableLinkList<Integer> rotatableLinkList = new RotatableLinkList<>(linkedList);
        rotatableLinkList.rotateList(1, RotatableLinkList.DIRECTION.ANTI_CLOCKWISE);
        assertThat(rotatableLinkList.toString(), is("20->30->40->50->10"));
        assertThat(rotatableLinkList.get(0), is(20));

        linkedList = getTestLinkedList();
        rotatableLinkList = new RotatableLinkList<>(linkedList);
        rotatableLinkList.rotateList(3, RotatableLinkList.DIRECTION.ANTI_CLOCKWISE);
        assertThat(rotatableLinkList.toString(), is("40->50->10->20->30"));
        assertThat(rotatableLinkList.get(0), is(40));

    }

    //1->2->3->4->5->6->7->8->9,
    //3->1->2->6->4->5->9->7->8
  //  k = 3
    //d = 1
    @Test
    public void testRotateClockwiseInBlocks() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(8);
        linkedList.insertAtEnd(9);

        RotatableLinkList<Integer> rotatableLinkList = new RotatableLinkList<>(linkedList);
        rotatableLinkList.rotateBlocks(3, RotatableLinkList.DIRECTION.CLOCKWISE,1);
        assertThat(rotatableLinkList.toString(), is("3->1->2->6->4->5->9->7->8"));
        assertThat(rotatableLinkList.get(0), is(3));


    }

    private static LinkedList<Integer> getTestLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        return linkedList;
    }
}
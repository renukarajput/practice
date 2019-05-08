package edu.ren.datastructure.list;

import org.junit.Test;

import java.util.Arrays;

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
        String[] expectedElem = {"sneha", "shivani", "noopur", "renuka", "rakesh", "anjali", "jay"};

        for (int i = 0; i < expectedElem.length; i++) {
            assertEquals(expectedElem[i], linkedList.get(i));
        }
        assertEquals(7, linkedList.size());

//        linkedList.deleteGivenIndexNode(1);
        linkedList.deleteFirst();
        assertEquals(6, linkedList.size());

//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.print(linkedList.get(i)+" => ");
//        }

        linkedList.deleteLast();
        assertEquals(5, linkedList.size());

        linkedList.deleteLast();
        assertEquals(4, linkedList.size());

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " => ");
        }
    }

    @Test
    public void integer() {
        Integer i = 5;
        Integer j = 5;
        System.out.println(i == j);
        Integer i1 = 500001;
        Integer j1 = 500001;
        System.out.println(i1 == j1);
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

        Integer[] expectedElem = {60, 40, 30, 50, 10, 70, 80, 90, 95, 100};

        for (int i = 0; i < expectedElem.length; i++) {
            assertEquals(expectedElem[i], linkedList.get(i));
        }
        assertEquals(10, linkedList.size());

//        System.out.println(linkedList.getNthFromLast(4));
//        System.out.println(linkedList.getNthFromLastUsingOneLoop(4));
        assertEquals((Integer) 90, linkedList.getNthFromLast(3));
        assertEquals((Integer) 90, linkedList.getNthFromLastUsingOneLoop(3));
        assertThat(linkedList.getNthFromLast(3), is(90));


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
        assertThat(loopLinkList.size(), is(6));
        assertThat(loopLinkList.hasLoop(), is(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void cyclicListInputOutOfBound() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(10);

        LoopLinkList<Integer> loopLinkList = new LoopLinkList<>(linkedList, 4);
        Integer[] expectedElem = {60, 40, 30, 50, 10, 20, 50};
    }

    @Test
    public void insertInSortedList() {
        LinkedList<Integer> linkedList = getIntegerList(10, 20, 40, 50);
        linkedList.insertInSortedList(30);
        Integer[] expectedElem = {10, 20, 30, 40, 50};

        for (int i = 0; i < expectedElem.length; i++) {
            assertEquals(expectedElem[i], linkedList.get(i));
        }
    }

    @Test
    public void nThFromLastInput_1() {
        LinkedList<Integer> linkedList = getIntegerList(60, 40, 30, 50, 10/*, 70,80, 90, 95, 100*/);
//        assertEquals((Integer) 90, linkedList.getNthFromLast(3));
        System.out.println(Arrays.asList(linkedList));
        assertEquals((Integer) 50, linkedList.nthFromLast(2));
    }

    @Test
    public void nThFromLast1() {
        LinkedList<Integer> linkedList = getIntegerList(60, 40, 30, 50, 10, 70, 80, 90);
//        assertEquals((Integer) 90, linkedList.getNthFromLast(3));
        System.out.println(Arrays.asList(linkedList));
        linkedList.nthFromLast(2);
    }

    @Test
    public void nThFromLastInput_2() {
        LinkedList<Integer> linkedList = getIntegerList(60, 40, 30, 50, 10, 70, 80, 90, 95, 100);
        System.out.println(Arrays.asList(linkedList));
        assertEquals((Integer) 90, linkedList.nthFromLast(3));
    }

    @Test
    public void nThFromLastInput_3() {
        LinkedList<Integer> linkedList = getIntegerList(60, 40, 30, 50, 10, 70, 80, 90, 95, 100);
        System.out.println(Arrays.asList(linkedList));
        assertEquals((Integer) 80, linkedList.nthFromLast(4));
    }

    @Test
    public void reverseList() {
        LinkedList<Integer> linkedList = getIntegerList(10, 20, 30, 40, 50);
        linkedList.reverseList(linkedList.head);
        assertThat(linkedList.toString(), is("50->40->30->20->10"));
        assertThat(linkedList.get(2), is(30));
    }

    @Test
    public void recursiveReverse() {
        LinkedList<Integer> linkedList = getIntegerList(10, 20, 30, 40, 50);
        linkedList.recursiveReverse(linkedList.head);
        assertThat(linkedList.toString(), is("50->40->30->20->10"));
        assertThat(linkedList.get(2), is(30));
    }

    @Test
    public void recursiveReverseWithOnlyOneElement() {
        LinkedList<Integer> linkedList = getIntegerList(10);

        linkedList.recursiveReverse(linkedList.head);
        assertThat(linkedList.toString(), is("10"));
        assertThat(linkedList.get(0), is(10));
    }

    @Test
    public void rotateClockwise() {  //left
        LinkedList<Integer> linkedList = getIntegerList(10, 20, 30, 40, 50);
        linkedList.rotateClockwise(2);   // 10 20 30 40 50
        assertThat(linkedList.toString(), is("30->40->50->10->20"));
    }

    @Test
    public void middleNodeOfListInput_1() {
        LinkedList<Integer> linkedList = getIntegerList(10, 20, 30, 40, 50);
        assertThat(linkedList.getMiddleNode(linkedList.head), is(30));
    }

    @Test
    public void middleNodeOfListInput_2() {
        LinkedList<Integer> linkedList = getIntegerList(10, 20, 30, 40, 50, 60);
        assertThat(linkedList.getMiddleNode(linkedList.head), is(40));
    }

    @Test
    public void rotateClockwiseLargerThanLength() {
        LinkedList<Integer> linkedList = getIntegerList(10, 20, 30, 40, 50);
        linkedList.rotateClockwise(6);
        assertThat(linkedList.toString(), is("30->40->50->10->20"));
    }

    @Test
    public void deleteGivenNodeInput_1() {
        LinkedList<Integer> linkedList = getIntegerList(4, 5, 1, 9, 8);
        linkedList.deleteGivenNode(5);
        assertThat(linkedList.toString(), is("4->1->9->8"));
    }

    @Test
    public void deleteGivenNodeInput_2() {
        LinkedList<Integer> linkedList = getIntegerList(4, 5, 1, 6, 7, 9, 8);
        linkedList.deleteGivenNode(6);
        assertThat(linkedList.toString(), is("4->5->1->7->9->8"));
    }

    @Test
    public void deleteGivenNodeInput_3() {
        LinkedList<Integer> linkedList = getIntegerList(4, 5, 1, 9, 8);
        linkedList.deleteGivenNode(8);
        assertThat(linkedList.toString(), is("4->5->1->9"));
    }
    @Test
    public void deleteGivenNodeInput_4() {
        LinkedList<Integer> linkedList = getIntegerList(4, 5, 1, 9, 8);
        linkedList.deleteGivenNode(6);
        assertThat(linkedList.toString(), is("4->5->1->9->8"));
    }

    private LinkedList<Integer> getIntegerList(int... values) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int value : values) {
            list.insertAtEnd(value);
        }
        return list;
    }
}

package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class IntersectionPointOfListsTest extends LinkedListTest {
    IntersectionPointOfLists intersectionPointOfLists = new IntersectionPointOfLists();

    @Test
    public void input_1() {
        LinkedList<Integer> list1 = getIntegerList(10, 15, 30);
        LinkedList<Integer> list2 = getIntegerList(3, 6, 9, 15, 30);
        list1.head.next = list2.head.next.next.next;
        assertThat(intersectionPointOfLists.getInstersectionPoint(list1, list2).data, is(15));
    }

    @Test
    public void input_2() {
        LinkedList<Integer> list1 = getIntegerList(1, 10, 20, 30, 40, 50, 60);
        LinkedList<Integer> list2 = getIntegerList(5, 15, 30, 40, 50, 60);
        list1.head.next.next.next = list2.head.next.next;
        assertThat(intersectionPointOfLists.getInstersectionPoint(list1, list2).data, is(30));
    }

    @Test
    public void input_3() {
        LinkedList<Integer> list1 = getIntegerList(1, 10, 20, 30, 40, 50, 60);
        LinkedList<Integer> list2 = getIntegerList(5, 15, 30, 40, 50, 60);
        list1.head.next.next.next = list2.head.next.next;
        assertThat(intersectionPointOfLists.getInstersectionPoint(list1, list2).data, is(30));
    }

    @Test
    public void input_4() {
        LinkedList<Integer> list1 = getIntegerList(1, 10, 20, 30, 40, 50, 60);
        LinkedList<Integer> list2 = getIntegerList(5, 15, 25,45);
        assertThat(intersectionPointOfLists.getInstersectionPoint(list1, list2), nullValue());
    }
}
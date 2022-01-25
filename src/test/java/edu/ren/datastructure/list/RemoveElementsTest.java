package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RemoveElementsTest extends LinkedListTest {
    RemoveElements removeElements = new RemoveElements();

    @Test
    public void input_1() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 6, 3, 4, 5, 6);
        removeElements.removeElements(linkedList, 6);
        assertThat(linkedList.toString(), is("1->2->3->4->5"));
    }

    @Test
    public void input_3() {
        LinkedList<Integer> linkedList = getIntegerList(1, 1, 1, 2, 1, 1, 6, 3, 1, 5);
        removeElements.removeElements(linkedList, 1);
        assertThat(linkedList.toString(), is("2->6->3->5"));
    }

    @Test
    public void input_2() {
        LinkedList<Integer> linkedList = getIntegerList(6, 1, 2, 6, 3, 4, 5, 6);
        removeElements.removeElements(linkedList, 6);
        assertThat(linkedList.toString(), is("1->2->3->4->5"));
    }
}

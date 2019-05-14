package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RemoveAllIdenticalElementsTest extends RemoveElementsTest {

    RemoveAllIdenticalElements removeElements = new RemoveAllIdenticalElements();

    @Test
    public void input_1() {
        LinkedList<Integer> linkedList = getIntegerList(1, 1, 2, 2, 3, 4, 4, 5, 5, 7);
        removeElements.removeIdenticalElements(linkedList);
        assertThat(linkedList.toString(), is("3->7"));
    }

    @Test
    public void input_2() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 2, 3, 4, 4, 5);
        removeElements.removeIdenticalElements(linkedList);
        assertThat(linkedList.toString(), is("1->3->5"));
    }

    @Test
    public void input_3() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 2, 2, 2, 2, 3);
        removeElements.removeIdenticalElements(linkedList);
        assertThat(linkedList.toString(), is("1->3"));
    }

    @Test
    public void input_4() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 2, 2, 3, 3, 3, 4, 5);
        removeElements.removeIdenticalElements(linkedList);
        assertThat(linkedList.toString(), is("1->4->5"));
    }

    @Test
    public void input_5() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 2, 2, 2, 2, 3, 4, 5, 6);
        removeElements.removeIdenticalElements(linkedList);
        assertThat(linkedList.toString(), is("1->3->4->5->6"));
    }

    @Test
    public void input_6() {
        LinkedList<Integer> linkedList = getIntegerList(1, 2, 2, 3, 3, 4, 4, 5);
        removeElements.removeIdenticalElements(linkedList);
        assertThat(linkedList.toString(), is("1->5"));
    }
}
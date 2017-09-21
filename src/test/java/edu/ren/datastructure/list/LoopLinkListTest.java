package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by kumarrak on 22/09/17.
 */
public class LoopLinkListTest {
    @Test
    public void hasLoop() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(60);
        LoopLinkList<Integer> t1 = new LoopLinkList(linkedList, 2);
        assertThat(t1.hasLoop(),is(true));
    }

    @Test
    public void hasLoopUsingPtr() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(60);
        LoopLinkList<Integer> t1 = new LoopLinkList(linkedList, 3);
        assertThat(t1.hasLoop(),is(true));
    }


    @Test
    public void hasLoopNegativeTest() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(60);
        LoopLinkList<Integer> t1 = new LoopLinkList(linkedList,3);
        t1.removeLoop();
        assertThat(t1.hasLoop(),is(false));
    }
    @Test
    public void hasLoopSizeBoundary() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        LoopLinkList<Integer> t1 = new LoopLinkList(linkedList,0);
        t1.removeLoop();
        assertThat(t1.hasLoop(),is(false));
        assertThat(t1.size(),is(2));
    }

    @Test
    public void getStartOfLoop() throws Exception {

    }

    @Test
    public void testLastNodeInLoop() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        LoopLinkList<Integer> loop = new LoopLinkList(linkedList,1);
        assertThat(loop.getStartOfLoop().data,is(20));
        assertThat(loop.getLastNodeInLoop().data,is(30));
    }

    @Test
    public void testLastNodeInLoop1() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        LoopLinkList<Integer> loop = new LoopLinkList(linkedList,0);
        assertThat(loop.getStartOfLoop().data,is(10));
        assertThat(loop.getLastNodeInLoop().data,is(20));
    }

    @Test
    public void testLastNodeInLoop0() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        LoopLinkList<Integer> loop = new LoopLinkList(linkedList,0);
        assertThat(loop.getStartOfLoop().data,is(10));
        assertThat(loop.getLastNodeInLoop().data,is(10));
    }

}
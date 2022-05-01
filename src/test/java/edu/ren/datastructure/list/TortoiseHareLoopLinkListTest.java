package edu.ren.datastructure.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by kumarrak on 21/09/17.
 */
public class TortoiseHareLoopLinkListTest {
    @Test
    public void hasLoop() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(60);
        TortoiseHareLoopLinkList<Integer> t1 = new TortoiseHareLoopLinkList(linkedList, 2);
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
        TortoiseHareLoopLinkList<Integer> t1 = new TortoiseHareLoopLinkList(linkedList, 3);
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
        TortoiseHareLoopLinkList<Integer> t1 = new TortoiseHareLoopLinkList(linkedList,3);
        t1.removeLoop();
        assertThat(t1.hasLoop(),is(false));
    }
    @Test
    public void hasLoopSizeBoundary() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        TortoiseHareLoopLinkList<Integer> t1 = new TortoiseHareLoopLinkList(linkedList,0);
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
        TortoiseHareLoopLinkList<Integer> loop = new TortoiseHareLoopLinkList(linkedList,1);
        assertThat(loop.getStartOfLoop().data,is(20));
        assertThat(loop.getLastNodeInLoop().data,is(30));
    }

    @Test
    public void testLastNodeInLoopWithLoopAtHead() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        TortoiseHareLoopLinkList<Integer> loop = new TortoiseHareLoopLinkList(linkedList,0);
        assertThat(loop.size(),is(4));
        assertThat(loop.hasLoop(),is(true));
        assertThat(loop.getStartOfLoop().data,is(10));
        assertThat(loop.getLastNodeInLoop().data,is(40));
        loop.removeLoop();
        assertThat(loop.size(),is(4));
        assertThat(loop.hasLoop(),is(false));
    }

    @Test
    public void testLastNodeInCircularLoopWithLoopAtHead() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        TortoiseHareLoopLinkList<Integer> loop = new TortoiseHareLoopLinkList(linkedList,0);
        assertThat(loop.getStartOfLoop().data,is(10));
        assertThat(loop.getLastNodeInLoop().data,is(20));
    }

    @Test
    public void testLastNodeInLoopWithHeadAsOnlyElement() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        TortoiseHareLoopLinkList<Integer> loop = new TortoiseHareLoopLinkList(linkedList,0);
        assertThat(loop.getStartOfLoop().data,is(10));
        assertThat(loop.getLastNodeInLoop().data,is(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTortoiseHareLoopLinkListOutOfBound() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        new TortoiseHareLoopLinkList(linkedList,1);
    }
}
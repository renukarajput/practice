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
        assertThat(t1.hasLoopUsingPtr(),is(true));
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
        TortoiseHareLoopLinkList<Integer> t1 = new TortoiseHareLoopLinkList(linkedList);
        assertThat(t1.hasLoopUsingPtr(),is(false));
    }

    @Test
    public void getStartOfLoop() throws Exception {

    }

}
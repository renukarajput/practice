package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeListRecursiveTest extends  MergeListsDemoTest{

    @Test
    public void mergeTwoLists() {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(8);
        listNode.next.next = new ListNode(20);

        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(11);
        listNode1.next.next = new ListNode(15);
        ListNode listNode2 = new MergeListRecursive().mergeTwoLists(listNode, listNode1);

        assertThat(ListNodeProxy.stringFromListNode(listNode2), is("4->5->8->11->15->20"));
    }
}
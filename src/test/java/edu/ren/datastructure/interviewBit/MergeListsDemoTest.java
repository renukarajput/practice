package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 8/16/18.
 */
public class MergeListsDemoTest {

    @Test
    public void mergeListsOfSameLength() {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(8);
        listNode.next.next = new ListNode(20);

        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(11);
        listNode1.next.next = new ListNode(15);
        ListNode listNode2 = new MergeListsDemo().mergeTwoLists(listNode, listNode1);

        assertThat(ListNodeProxy.stringFromListNode(listNode2), is("4->5->8->11->15->20"));
    }

    @Test
    public void mergeListOfDifferentLength() {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(8);
        listNode.next.next = new ListNode(20);
        listNode.next.next.next = new ListNode(25);

        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(11);
        listNode1.next.next = new ListNode(15);
        ListNode listNode2 = new MergeListsDemo().mergeTwoLists(listNode, listNode1);

        assertThat(ListNodeProxy.stringFromListNode(listNode2), is("4->5->8->11->15->20->25"));
    }

    @Test
    public void mergeListOfSingleNode() {
        ListNode listNode = new ListNode(5);

        ListNode listNode1 = new ListNode(10);

        ListNode listNode2 = new MergeListsDemo().mergeTwoLists(listNode, listNode1);

        assertThat(ListNodeProxy.stringFromListNode(listNode2), is("5->10"));
    }

    @Test
    public void mergeListWithNegativeNode() {
        ListNode listNode = new ListNode(-1);
        listNode.next = new ListNode(-2);
        listNode.next.next = new ListNode(-3);
        listNode.next.next.next = new ListNode(-4);

        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(5);
        listNode1.next.next = new ListNode(10);
        ListNode listNode2 = new MergeListsDemo().mergeTwoLists(listNode, listNode1);

        assertThat(ListNodeProxy.stringFromListNode(listNode2), is("-1->-2->-3->-4->4->5->10"));
    }
}
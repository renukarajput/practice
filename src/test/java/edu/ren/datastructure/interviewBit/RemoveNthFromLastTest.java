package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 8/16/18.
 */
public class RemoveNthFromLastTest {
    @Test
    public void removeNthFromLastWitSmallerIndexThanListSize() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode node = new RemoveNthFromLast().removeNthFromLast(listNode, 2);
        assertThat(ListNodeProxy.stringFromListNode(node), is("1->2->3->5"));
    }

    @Test
    public void removeNthFromLastWithGreaterIndexThanListSize() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode node = new RemoveNthFromLast().removeNthFromLast(listNode, 7);
        assertThat(ListNodeProxy.stringFromListNode(node), is("2->3->4->5"));
    }

    @Test
    public void removeNthInputOfSizeTwo() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);

        ListNode node = new RemoveNthFromLast().removeNthFromLast(listNode, 2);
        assertThat(ListNodeProxy.stringFromListNode(node), is("2"));
    }

    @Test
    public void removeNthInputOfSizeOne() {
        ListNode listNode = new ListNode(1);
        ListNode node = new RemoveNthFromLast().removeNthFromLast(listNode, 2);
        assertThat(ListNodeProxy.stringFromListNode(node), is(""));
    }

    @Test
    public void removeNthInputOfSizeThreeWithDuplicate() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);

        ListNode node = new RemoveNthFromLast().removeNthFromLast(listNode, 1);
        assertThat(ListNodeProxy.stringFromListNode(node), is("1->2"));
    }
}
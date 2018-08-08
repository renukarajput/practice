package edu.ren.datastructure.interviewBit;

import org.junit.Test;

/**
 * Created by rrn3194 on 8/7/18.
 */
public class DuplicateElementsTest {

    @Test
    public void input1() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next = new ListNode(3);

       new DuplicateElements().removeDuplicates(listNode);
       // ListNode listNode1 = new Solution().deleteDuplicates(listNode);
        System.out.println(ListNodeProxy.stringFromListNode(listNode));
    }

    @Test
    public void input2() {
        ListNode listNode = new ListNode(1);

        new DuplicateElements().removeDuplicates(listNode);
        System.out.println(ListNodeProxy.stringFromListNode(listNode));
    }

    @Test
    public void input3() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next.next = new ListNode(4);

        new DuplicateElements().removeDuplicates(listNode);
        System.out.println(ListNodeProxy.stringFromListNode(listNode));
    }

    @Test
    public void input4() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        new DuplicateElements().removeDuplicates(listNode);
        System.out.println(ListNodeProxy.stringFromListNode(listNode));
    }
}
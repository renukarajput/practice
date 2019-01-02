package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rrn3194 on 8/7/18.
 */
public class DuplicateElementsTest {

    @Test
    public void inputWithMultipleDuplicates() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 2, 3, 3});
        new DuplicateElements().removeDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(listNode), is("1->2->3"));

    }

    @Test
    public void inputWithoutDuplicateForSize1() {
        ListNode listNode = new ListNode(1);
        new DuplicateElements().removeDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(listNode), is("1"));
    }

    @Test
    public void inputWithDuplicate() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 2, 3, 3, 4, 4});
        new DuplicateElements().removeDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(listNode), is("1->2->3->4"));
    }

    @Test
    public void inputWithoutDuplicateSizeThree() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        new DuplicateElements().removeDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(listNode), is("1->2->3"));
    }
}
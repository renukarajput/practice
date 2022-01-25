package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 8/27/18.
 */
public class PartialReverseTest {

    @Test
    public void reverseCompletely() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNode output = new PartialReverse().completeReverse(listNode);
        assertThat(ListNodeProxy.stringFromListNode(output), is("5->4->3->2->1"));
    }

    @Test
    public void reversePartially1() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        ListNode output = new PartialReverse().partialReverse(listNode, 3, 5);
        assertThat(ListNodeProxy.stringFromListNode(output), is("1->2->5->4->3->6->7"));
    }

    @Test
    public void reversePartially2() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        ListNode output = new PartialReverse().partialReverse(listNode, 2, 5);
        assertThat(ListNodeProxy.stringFromListNode(output), is("1->5->4->3->2->6->7"));
    }

    @Test
    public void reversePartially3() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        ListNode output = new PartialReverse().partialReverse(listNode, 6, 7);
        assertThat(ListNodeProxy.stringFromListNode(output), is("1->2->3->4->5->7->6"));
    }

    @Test
    public void reversePartial() {
        int arr[] = {1, 2, 3, 4};
        ListNode listNode = ListNodeProxy.fromArray(arr);
        assertThat(listNode.toString(), is("1->2->3->4"));
        ListNode partialReversedList = new PartialReverse().partialReverse(listNode, 2, 3);
        assertThat(partialReversedList.toString(), is("1->3->2->4"));
    }

    @Test
    public void reversePartial1() {
        int arr[] = {1, 2};
        ListNode listNode = ListNodeProxy.fromArray(arr);
        assertThat(listNode.toString(), is("1->2"));
        ListNode partialReversedList = new PartialReverse().partialReverse(listNode, 2, 2);
        assertThat(partialReversedList.toString(), is("1->2"));
    }

    @Test
    public void reversePartial2() {
        int arr[] = {1};
        ListNode listNode = ListNodeProxy.fromArray(arr);
        assertThat(listNode.toString(), is("1"));
        ListNode partialReversedList = new PartialReverse().partialReverse(listNode, 1, 1);
        assertThat(partialReversedList.toString(), is("1"));
    }

    @Test
    public void reversePartial3() {
        int arr[] = {1, 2, 3};
        ListNode listNode = ListNodeProxy.fromArray(arr);
        assertThat(listNode.toString(), is("1->2->3"));
        ListNode partialReversedList = new PartialReverse().partialReverse(listNode, 1, 2);
        assertThat(partialReversedList.toString(), is("2->1->3"));
    }

    @Test
    public void reversePartialComplete() {
        int arr[] = {1, 2, 3};
        ListNode listNode = ListNodeProxy.fromArray(arr);
        assertThat(listNode.toString(), is("1->2->3"));
        ListNode partialReversedList = new PartialReverse().partialReverse(listNode, 1, 3);
        assertThat(partialReversedList.toString(), is("3->2->1"));
    }

    @Test
    public void reversePartialList() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        ListNode listNode = ListNodeProxy.fromArray(arr);
        assertThat(listNode.toString(), is("1->2->3->4->5->6->7->8"));
        ListNode partialReversedList = new PartialReverse().partialReverse(listNode, 3, 5);
        assertThat(partialReversedList.toString(), is("1->2->5->4->3->6->7->8"));
    }

}
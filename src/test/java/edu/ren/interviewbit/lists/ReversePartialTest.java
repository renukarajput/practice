package edu.ren.interviewbit.lists;

import org.junit.Test;

import static edu.ren.interviewbit.lists.RemoveAllDuplicatesTest.listFromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReversePartialTest {

    @Test
    public void reversePartial() {
        int arr[] = {1, 2, 3, 4};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(), is("1->2->3->4"));
        ListNode partialReversedList = new ReversePartial().reversePartial(listNode, 2, 3);
        assertThat(partialReversedList.toString(), is("1->3->2->4"));
    }

    @Test
    public void reversePartial1() {
        int arr[] = {1, 2};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(), is("1->2"));
        ListNode partialReversedList = new ReversePartial().reversePartial(listNode, 2, 2);
        assertThat(partialReversedList.toString(), is("1->2"));
    }

    @Test
    public void reversePartial2() {
        int arr[] = {1};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(), is("1"));
        ListNode partialReversedList = new ReversePartial().reversePartial(listNode, 1, 1);
        assertThat(partialReversedList.toString(), is("1"));
    }

    @Test
    public void reversePartial3() {
        int arr[] = {1, 2, 3};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(), is("1->2->3"));
        ListNode partialReversedList = new ReversePartial().reversePartial(listNode, 1, 2);
        assertThat(partialReversedList.toString(), is("2->1->3"));
    }

    @Test
    public void reversePartialComplete() {
        int arr[] = {1, 2, 3};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(), is("1->2->3"));
        ListNode partialReversedList = new ReversePartial().reversePartial(listNode, 1, 3);
        assertThat(partialReversedList.toString(), is("3->2->1"));
    }

    @Test
    public void reversePartialList() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(), is("1->2->3->4->5->6->7->8"));
        ListNode partialReversedList = new ReversePartial().reversePartial(listNode, 3, 5);
        assertThat(partialReversedList.toString(), is("1->2->5->4->3->6->7->8"));
    }
}
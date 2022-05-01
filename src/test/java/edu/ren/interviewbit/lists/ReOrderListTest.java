package edu.ren.interviewbit.lists;

import org.junit.Test;

import static edu.ren.interviewbit.lists.RemoveAllDuplicatesTest.listFromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReOrderListTest {

    @Test
    public void reverse() {
        int arr[]={1,2,3,4};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(),is("1->2->3->4"));
        ListNode reverse = new ReOrderList().reverse(listNode);
        assertThat(reverse.toString(),is("4->3->2->1"));
    }
    @Test
    public void getMidEven() {
        int arr[]={1,2,3,4};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(),is("1->2->3->4"));
        ListNode reverse = new ReOrderList().getMidNode(listNode);
        assertThat(reverse.toString(),is("2->3->4"));
    }

    @Test
    public void getMidOdd() {
        int arr[]={1,2,3,4,5};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(),is("1->2->3->4->5"));
        ListNode reverse = new ReOrderList().getMidNode(listNode);
        assertThat(reverse.toString(),is("3->4->5"));
    }

    @Test
    public void reOrderEvenList() {
        int arr[]={1,2,3,4};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(),is("1->2->3->4"));
        ListNode reOrderedList = new ReOrderList().reOrder(listNode);
        assertThat(reOrderedList.toString(),is("1->4->2->3"));
    }

    @Test
    public void reOrderOddList() {
        int arr[]={1,2,3,4,5};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(),is("1->2->3->4->5"));
        ListNode reOrderedList = new ReOrderList().reOrder(listNode);
        assertThat(reOrderedList.toString(),is("1->5->2->4->3"));
    }

    @Test
    public void reOrderListOfSizeTwo() {
        int arr[]={1,2};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(),is("1->2"));
        ListNode reOrderedList = new ReOrderList().reOrder(listNode);
        assertThat(reOrderedList.toString(),is("1->2"));
    }

    @Test
    public void reOrderListOfSizeOne() {
        int arr[]={1};
        ListNode listNode = listFromArray(arr);
        assertThat(listNode.toString(),is("1"));
        ListNode reOrderedList = new ReOrderList().reOrder(listNode);
        assertThat(reOrderedList.toString(),is("1"));
    }
}
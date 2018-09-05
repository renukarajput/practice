package edu.ren.datastructure.interviewBit;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public  class SwapListNodesInPairsTest {

    @Test
    public void swapAlternateNodesLen1() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1});
        ListNode alternateNodes = new SwapListNodesInPairs().swapAlternateNodes(listNode);
        assertThat(alternateNodes.toString(),is("1"));
    }

    @Test
    public void swapAlternateNodesOddLen() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5});
        ListNode alternateNodes = new SwapListNodesInPairs().swapAlternateNodes(listNode);
        assertThat(alternateNodes.toString(),is("2->1->4->3->5"));
    }

    @Test
    public void swapAlternateNodesOddLen1() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5,6,7,8,9});
        ListNode alternateNodes = new SwapListNodesInPairs().swapAlternateNodes(listNode);
        assertThat(alternateNodes.toString(),is("2->1->4->3->6->5->8->7->9"));
    }
    @Test
    public void swapAlternateNodesEvenLen() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5,6});
        ListNode alternateNodes = new SwapListNodesInPairs().swapAlternateNodes(listNode);
        assertThat(alternateNodes.toString(),is("2->1->4->3->6->5"));
    }

    @Test
    public void swapAlternateNodesEvenLen1() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5,6,7,8,9,10});
        ListNode alternateNodes = new SwapListNodesInPairs().swapAlternateNodes(listNode);
        assertThat(alternateNodes.toString(),is("2->1->4->3->6->5->8->7->10->9"));
    }
}
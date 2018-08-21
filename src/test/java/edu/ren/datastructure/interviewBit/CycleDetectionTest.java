package edu.ren.datastructure.interviewBit;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class CycleDetectionTest {
    @Test
    public void inputWithCycle() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = listNode.next.next;

        ListNode output = new CycleDetection().findStartOfLoop(listNode);

        assertThat(new Integer(output.val).toString(), is("3"));
    }

    @Test
    public void inputWithCycle1() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5});
        ListNodeProxy.createCycle(listNode,3);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(new Integer(output.val).toString(), is("3"));
    }

    @Test
    public void inputWithCycle2() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5});
        ListNodeProxy.createCycle(listNode,4);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(new Integer(output.val).toString(), is("4"));
    }


    @Test
    public void inputWithCycle3() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5,6,7,8,9});
        ListNodeProxy.createCycle(listNode,6);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(new Integer(output.val).toString(), is("6"));
    }

    @Test
    public void inputWithCycle4() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5,6,7,8,9});
        ListNodeProxy.createCycle(listNode,3);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(new Integer(output.val).toString(), is("3"));
    }
    @Test
    public void inputWithSingleNode() {
        ListNode listNode = new ListNode(1);

        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(output, is(nullValue()));
    }

    @Test
    public void inputAsNull() {
        ListNode output = new CycleDetection().findStartOfLoop(null);
        assertThat(output, is(nullValue()));
    }

    @Test
    public void inputWithoutCycle() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode output = new CycleDetection().findStartOfLoop(listNode);

        assertThat(output, is(nullValue()));
    }

    @Test
    public void inputWithCycleLength4() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5});
        ListNodeProxy.createCycle(listNode,3);

        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(new Integer(output.val).toString(), is("3"));
    }
}
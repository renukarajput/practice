package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class CycleDetectionTest {


    @Test
    public void inputWithCycle1() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNodeProxy.createCycle(listNode, 3);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(output.val, is(3));
    }

    @Test
    public void inputWithCycle2() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNodeProxy.createCycle(listNode, 4);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(output.val, is(4));
    }


    @Test
    public void inputWithCycle3() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNodeProxy.createCycle(listNode, 6);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(output.val, is(6));
    }

    @Test
    public void getNumCyclesBeforeCycleDetection3() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNodeProxy.createCycle(listNode, 6);
        int[] arr = new CycleDetection().numCyclesBeforeCycleDetection(listNode);
        assertThat(arr[1], is(2));
        assertThat(arr[0], is(0));
    }
    @Test
    public void getNumCyclesBeforeCycleDetection4() {
        int [] input=new int[100];
        for (int i = 0; i <100 ; i++) {
            input[i]=i;
        }
        ListNode listNode = ListNodeProxy.fromArray(input);
        ListNodeProxy.createCycle(listNode, 6);
        int[] arr = new CycleDetection().numCyclesBeforeCycleDetection(listNode);
        assertThat(arr[1], is(1));
        assertThat(arr[0], is(0));
    }

    @Test
    public void inputWithCycle4() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNodeProxy.createCycle(listNode, 3);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(output.val, is(3));
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
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNode output = new CycleDetection().findStartOfLoop(listNode);

        assertThat(output, is(nullValue()));
    }

    @Test
    public void inputWithoutCycle5() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNodeProxy.createCycle(listNode, 2);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);

        assertThat(output.val, is(2));
    }

    @Test
    public void inputWithCycle6() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4});
        ListNodeProxy.createCycle(listNode, 3);
        ListNode output = new CycleDetection().findStartOfLoop(listNode);

        assertThat(output.val, is(3));
    }

    @Test
    public void inputWithCycle7() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNodeProxy.createCycle(listNode, 3);

        ListNode output = new CycleDetection().findStartOfLoop(listNode);
        assertThat(output.val, is(3));
    }

    @Test
    public void usingVisitedSet() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNodeProxy.createCycle(listNode, 3);

        ListNode output = new CycleDetection().getStartOfLoopWithVisitedSet(listNode);
        assertThat(output.val, is(3));
    }
}
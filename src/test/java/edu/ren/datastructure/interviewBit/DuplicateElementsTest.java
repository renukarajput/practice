package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

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
        System.out.println(ListNodeProxy.stringFromListNode(listNode));
    }

}
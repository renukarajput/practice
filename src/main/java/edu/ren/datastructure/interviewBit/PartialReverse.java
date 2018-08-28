package edu.ren.datastructure.interviewBit;

/**
 * Created by rrn3194 on 8/27/18.
 */
public class PartialReverse {

    public ListNode completeReverse(ListNode listNode) {

        ListNode prev, next, curr;
        curr = listNode;
        prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        listNode = prev;
        return listNode;
    }

    public ListNode partialReverse(ListNode listNode, int start, int end) {
        ListNode headOfReversedSubList, currentNode;
        ListNode startOfSubListNode, endOfSubListNode, prevOfSubListNode = null, nextOfSublistNode;
        int i = 1;
        startOfSubListNode = currentNode = listNode;

        while (i < end) {
            if (i == start - 1) {
                prevOfSubListNode = currentNode;
                startOfSubListNode = prevOfSubListNode.next;
            }
            currentNode = currentNode.next;
            i++;
        }
        endOfSubListNode = currentNode;
        nextOfSublistNode = currentNode.next;
        headOfReversedSubList = reverseSubList(startOfSubListNode, endOfSubListNode);
        if (prevOfSubListNode != null) {
            prevOfSubListNode.next = headOfReversedSubList;
        } else {
            listNode = headOfReversedSubList;
        }
        startOfSubListNode.next = nextOfSublistNode;

        return listNode;
    }

    private ListNode reverseSubList(ListNode curr, ListNode endNode) {
        ListNode next, prev;
        prev = endNode.next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

package edu.ren.datastructure.interviewBit;

/**
 * Created by rrn3194 on 8/16/18.
 */

// https://www.interviewbit.com/problems/remove-nth-node-from-list-end/

public class RemoveNthFromLast {

    public ListNode removeNthFromLast(ListNode listNode, int nThFromLast) {
        ListNode start = listNode;
        ListNode prev, nodeToDelete = start;
        int size = size(start);
        int pos = size - nThFromLast;
        int i = 0;

        if (nThFromLast >= size) {
            start = start.next;
            return start;
        }
        while (i < pos - 1) {
            start = start.next;
            i++;
        }
        prev = start;
        nodeToDelete = prev.next;
        prev.next = nodeToDelete.next;
        return listNode;
    }

    private int size(ListNode node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;
        int count = 0;
        while (first != null) {
            if (count > n) {
                second = second.next;
            }
            first = first.next;
            count++;
        }
        if (second.next != null) {
            second.next = second.next.next;
        }
        return dummy.next;
    }
    public ListNode removeNthFromEnd1(ListNode head, int k) {
        if (head == null)
            return null;

        ListNode slow = head, fast = head;
        for(int i = 1; i <= k; i++)
            fast = fast.next;

        if (fast == null)
            return head.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

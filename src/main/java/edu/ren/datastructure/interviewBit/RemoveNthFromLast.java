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
}

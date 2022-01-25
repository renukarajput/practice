package leetcode_14days.day5;

import edu.ren.datastructure.interviewBit.tree.ListNode;

public class RemoveNthFromLast {
    public static ListNode removeNthFromEnd(ListNode listNode, int nThFromLast) {
        ListNode curr = listNode;
        ListNode prev, nodeToDelete;
        int size = size(curr);
        int pos = size - nThFromLast;
        int i = 0;

        if (nThFromLast >= size) {
            curr = curr.next;
            return curr;
        }
        while (i < pos - 1) {
            curr = curr.next;
            i++;
        }
        prev = curr;
        nodeToDelete = prev.next;
        prev.next = nodeToDelete.next;
        return listNode;
    }

    private static int size(ListNode node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }
}


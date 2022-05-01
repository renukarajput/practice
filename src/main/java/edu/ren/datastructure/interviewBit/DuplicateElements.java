package edu.ren.datastructure.interviewBit;

/**
 * Created by rrn3194 on 8/7/18.
 */

// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/
public class DuplicateElements {

    public ListNode removeDuplicates(ListNode listNode) {

        ListNode headNode = listNode;
        ListNode start = headNode;

        while (listNode != null) {
            ListNode prev = listNode;
            ListNode node = listNode.next;
            if (node == null)
                return headNode;
            if (start.val == node.val) {
                ListNode nextNode = node.next;
                prev.next = nextNode;
                node.next = null;
            } else {
                start = start.next;
                listNode = listNode.next;
            }
        }
        return headNode;
    }
}

package com.leetcode;

import edu.ren.datastructure.interviewBit.tree.ListNode;

public class ReverseKGroups {
    // 1 2 3 4 5 6 => 2 1 4 3 5 6
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return null;
        int i = k;
        ListNode current = head, prev = null, next;
        while (i > 0) {
            if (current == null){
                return reverse(prev);
            }
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i--;
        }
        head.next = reverseKGroup(current, k);
        return prev;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

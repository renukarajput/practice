package com.leetcode.blind75.list;

import edu.ren.datastructure.interviewBit.tree.ListNode;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapPairs {
    // 1 2 3 4 -> 2 1 4 3
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode currNext = head.next.next;
        ListNode temp = curr;
        curr = curr.next;
        curr.next = temp;
        temp.next = swapPairs(currNext);
        return curr;
    }
}

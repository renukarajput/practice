package leetcode_14days.day5;

import edu.ren.datastructure.interviewBit.tree.ListNode;

public class MiddleOfLinkedList {
// 1 2 3 4 5
// sf
    public ListNode middleNode(ListNode head) {
        ListNode  slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

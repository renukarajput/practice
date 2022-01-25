package leetcode_14days.day_10;

import edu.ren.datastructure.interviewBit.tree.ListNode;

public class ListReversal {

    // 1->2->3->4->5->null

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev=null,next = null;
        while (curr != null){
            next = curr.next; //2
            curr.next = prev;	// 1.next=null
            prev = curr; // 1
            curr = next; // 2
        }
        head=prev;
        return head;
    }
}

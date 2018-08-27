package edu.ren.datastructure.interviewBit;

/**
 * Created by rrn3194 on 8/24/18.
 */

// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveAllDuplicateElements {

    public ListNode removeAllDuplicates(ListNode listNode) {
        ListNode curr = listNode;
        ListNode prevOfCurrent, nextUnequalNode = null;
        prevOfCurrent = null;
        while (curr != null && curr.next != null) {
            boolean isDuplicate = false;
            ListNode nextNode = curr.next;
            while (nextNode != null && curr.val == nextNode.val) {
                isDuplicate = true;
                nextNode = nextNode.next;
            }
            if (isDuplicate) {
                nextUnequalNode = nextNode;
                if (prevOfCurrent != null) {
                    prevOfCurrent.next = nextUnequalNode;
                    curr = nextUnequalNode;
                } else {
                    curr = nextUnequalNode;
                    listNode = curr;
                }
            } else {
                prevOfCurrent = curr;
                curr = curr.next;
            }
        }
        return listNode;
    }
}

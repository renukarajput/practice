package edu.ren.datastructure.interviewBit;

/**
 * Created by rrn3194 on 9/7/18.
 */
public class PartitionList {
    //partition it such that all nodes less than x come before nodes greater than or equal to x.
    public ListNode partition(ListNode listNode, int x) {
        ListNode nextNode, prev = listNode, curr = listNode;
        while (curr != null) {
            if (curr.val < x) {
                nextNode = curr.next;
                prev.next = nextNode;
            } else {
                curr = curr.next;
            }
            System.out.println("curr = "+ curr);
        }
        return listNode;
    }
}

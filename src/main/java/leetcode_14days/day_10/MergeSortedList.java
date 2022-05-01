package leetcode_14days.day_10;

import edu.ren.datastructure.interviewBit.tree.ListNode;

import java.util.Objects;

public class MergeSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultHeadNode = null;
        ListNode resultListNode = null;
        if (Objects.isNull(l1))
            return l2;
        else if (Objects.isNull(l2))
            return l1;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (resultHeadNode == null){
                    resultListNode = new ListNode(l1.val);
                    resultHeadNode = resultListNode;
                } else {
                    resultListNode.next = l1;
                    resultListNode = resultListNode.next;
                }
                l1 = l1.next;
            } else {
                if (resultHeadNode == null) {
                    resultListNode = new ListNode(l2.val);
                    resultHeadNode = resultListNode;
                } else {
                    resultListNode.next = l2;
                    resultListNode = resultListNode.next;
                }
                l2 = l2.next;
            }
        }

        while (l1 !=null && resultListNode !=null) {
            resultListNode.next = l1;
            l1 = l1.next;
            resultListNode = resultListNode.next;
        }
        while (l2 != null && resultListNode != null) {
            resultListNode.next = l2;
            l2 = l2.next;
            resultListNode =resultListNode.next;
        }
        return resultHeadNode;
    }
}

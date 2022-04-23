package edu.ren.datastructure.interviewBit;

//Merge two sorted lists https://www.interviewbit.com/problems/merge-two-sorted-lists/

import java.util.Objects;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return ListNodeProxy.stringFromListNode(this);
    }
}

public class MergeListsDemo {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode resultListNode = null;
        ListNode resultHeadNode = null;
        if (A == null)
            return B;
        else if (B == null)
            return A;
        while (A != null && B != null) {
            if (A.val < B.val) {
                if (resultHeadNode == null) {
                    resultListNode = new ListNode(A.val);
                    resultHeadNode = resultListNode;
                } else {
                    resultListNode.next = A;
                    resultListNode = resultListNode.next;
                }
                A = A.next;

            } else {
                if (resultHeadNode == null) {
                    resultListNode = new ListNode(B.val);
                    resultHeadNode = resultListNode;
                } else {
                    resultListNode.next = B;
                    resultListNode = resultListNode.next;

                }
                B = B.next;
            }
        }

        while (A != null && resultListNode != null) {
            resultListNode.next = A;
            A = A.next;
            resultListNode = resultListNode.next;
        }

        while (B != null && resultListNode != null) {
            resultListNode.next = B;
            B = B.next;
            resultListNode = resultListNode.next;
        }
        return resultHeadNode;
    }

    public ListNode mergeTwoLIst(ListNode l1, ListNode l2) {
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


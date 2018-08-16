package edu.ren.datastructure.interviewBit;

//Merge two sorted lists https://www.interviewbit.com/problems/merge-two-sorted-lists/

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
  }

public class MergeListsDemo {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode resultListNode = null;
        ListNode resultHeadNode = null;
        while(A != null && B != null){
            if(A.val < B.val){
                if(resultHeadNode == null){
                    resultListNode = new ListNode(A.val);
                    resultHeadNode = resultListNode;
                }
                else{
                    resultListNode.next = A;
                    resultListNode = resultListNode.next;
                }
                A = A.next;

            }else{
                if(resultHeadNode == null){
                    resultListNode = new ListNode(B.val);
                    resultHeadNode = resultListNode;
                }
                else{
                    resultListNode.next = B;
                    resultListNode = resultListNode.next;

                }
                B = B.next;
            }
        }

        while(A != null){
            resultListNode.next = A;
            A = A.next;
            resultListNode = resultListNode.next;
        }

        while(B != null){
            resultListNode.next = B;
            B = B.next;
            resultListNode = resultListNode.next;
        }

        return resultHeadNode;
    }


}


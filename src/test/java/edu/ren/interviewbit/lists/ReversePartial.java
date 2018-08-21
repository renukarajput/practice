package edu.ren.interviewbit.lists;

public class ReversePartial {
    //1 2 3 4 5
    public ListNode reversePartial(ListNode listNode,int start,int end){
       ListNode startOfSubListNode=listNode;
        ListNode endOfSubListNode=listNode;
        ListNode endOfFirstPart=null,startOfSecondPart;
        int startPos=start;
        while (--startPos>0){
            endOfFirstPart=startOfSubListNode;
            startOfSubListNode=startOfSubListNode.next;
            endOfSubListNode=endOfSubListNode.next;
        }
        if(endOfFirstPart!=null) {
            endOfFirstPart.next = null;
        }
        while (end>start){
            endOfSubListNode=endOfSubListNode.next;
            end--;
        }
        startOfSecondPart=endOfSubListNode.next;
        endOfSubListNode.next=null;
        ListNode node=startOfSubListNode;
        ListNode prev=null;
        while (prev!=endOfSubListNode){
            ListNode nextNode=node.next;
            node.next=prev;
            prev=node;
            node=nextNode;
        }
        if(startOfSecondPart!=null) {
            startOfSubListNode.next = startOfSecondPart;
        }
        if(endOfFirstPart!=null) {
            endOfFirstPart.next = prev;
        }else {
            return prev;
        }
        return listNode;
    }
}

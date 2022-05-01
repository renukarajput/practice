package edu.leetcode.list;

 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeKSorted {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        return mergeKLists(lists,0,lists.length-1);
    }

    ListNode mergeKLists(ListNode[] lists,int start,int end) {
        if(start==end)
            return lists[start];
        int mid=(start+end)/2;
        ListNode first=mergeKLists(lists,start,mid);
        ListNode second=mergeKLists(lists,mid+1,end);
        return merge(first,second);
    }

    ListNode merge( ListNode first,ListNode second){
        ListNode result=null,current=null;
        ListNode pending=first;
        if(first==null)
            pending=second;
        while(first!=null && second!=null){
            ListNode smaller=first;
            if(first.val<second.val){
                first=first.next;
                pending=second;
            }else{
                smaller=second;
                second=second.next;
                pending=first;
            }
            if(result==null){
                current=new ListNode(smaller.val);
                result=current;
            }else{
                current.next=smaller;
                current=smaller;
            }
        }
        while(pending!=null){
            if(result==null){
                current=new ListNode(pending.val);
                result=current;
                pending=pending.next;
                continue;
            }
            current.next=pending;
            current=pending;
            pending=pending.next;
        }
        return result;
    }
}
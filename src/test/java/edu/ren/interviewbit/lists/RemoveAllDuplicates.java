package edu.ren.interviewbit.lists;

import java.util.StringJoiner;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner=new StringJoiner("->");
        ListNode node=this;
        while (node!=null){
            stringJoiner.add(String.valueOf(node.val));
            node=node.next;
        }
        return stringJoiner.toString();
    }
}
public class RemoveAllDuplicates {


    //2 2 3 5 5 7
    ListNode removeAllDuplicates1(ListNode listNode){
        ListNode prev=null;
        ListNode current=listNode;
        ListNode nextNode=current.next;
        ListNode headNode=listNode;
        boolean isDuplicate;
        while (nextNode!=null){
            isDuplicate=false;
            while (nextNode!=null&&current.val==nextNode.val){
                nextNode=nextNode.next;
                isDuplicate=true;
            }
            if(isDuplicate){
                if(prev!=null){
                    prev.next=nextNode;
                }else {
                    headNode=nextNode;
                }
            }
                prev=current;
                current=nextNode;
            if (nextNode == null) {
                break;
            }
                nextNode=nextNode.next;
        }
        return headNode;
    }

//11111 2222 33333
    ListNode removeAllDuplicates(ListNode listNode) {
        ListNode prev = null;
        ListNode head=null;
        ListNode current = listNode;
        boolean isDuplicate=false;
      while (current!=null) {
          isDuplicate=false;
          ListNode nextNode=current.next;
          while (nextNode != null && current.val == nextNode.val) {
              nextNode = nextNode.next;
              isDuplicate = true;
          }

          if (!isDuplicate) {
              if (prev != null) {
                  prev.next = current;
              } else {
                  head = current;
              }
              prev = current;
          }else {
              if(prev!=null)
              prev.next = null;
          }
          current=nextNode;

      }
        return head;
    }


}

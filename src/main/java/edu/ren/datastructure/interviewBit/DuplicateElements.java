package edu.ren.datastructure.interviewBit;

import java.util.Stack;

/**
 * Created by rrn3194 on 8/7/18.
 */
public class DuplicateElements {
  /*  public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int len = arr.length;
        if(arr[len-1] == 6){
            System.out.println("have duplicate");
        }
        else
            System.out.println("duplicate");

    }
*/
  //0 1 2 3 4 5
 // 1 2 2 3 3 3
    public void removeDuplicates(ListNode listNode){
        ListNode headNode=listNode;
        Stack<ListNode> stack = new Stack();
        stack.push(listNode);
        int indexPositionInDuplicateList = 1;
        ListNode top;
        while(listNode != null){
            top = stack.peek();
            ListNode node = ListNodeProxy.getNodeAtPosition(headNode, indexPositionInDuplicateList+1 );
//            ListNode node = listNode.next;
            if (node == null)
                return;
            if (top.val == node.val){
              ListNodeProxy.removeAtIndex(headNode, indexPositionInDuplicateList+1);
                //indexPositionInDuplicateList--;

            } else {
                stack.push(node);
                indexPositionInDuplicateList++;
                listNode = listNode.next;
            }
        }

    }
}

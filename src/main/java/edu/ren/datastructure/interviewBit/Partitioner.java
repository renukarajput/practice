package edu.ren.datastructure.interviewBit;

public class Partitioner {
    /**
     * partitions the list so that all values less than partitionValue come before
     * all values greater than partitionValue
     * In both partitions the elements MUST maintain the same relative ordering as in original list
     * Search for 1st node >partitionValue ,mark this as start of 2nd half
     * iterate over the list and move any smaller values at end of 1st half
     * 1->4->3->2->5->2
     * 1->2->4->3-->5->2
     * 1->2->2->4>3->5
     *
     * @param listNode
     * @param partitionValue
     */


    ListNode partition(ListNode listNode, int partitionValue) {
        ListNode currentNode, startOfRightPartition = listNode, endOfLeftPartition = null;
        while (startOfRightPartition != null ) {
            if(startOfRightPartition.val > partitionValue){
                break;
            }
            endOfLeftPartition = startOfRightPartition;
            startOfRightPartition = startOfRightPartition.next;


        }
       if(startOfRightPartition!=null) {
           currentNode = startOfRightPartition.next;
       }else {
            currentNode=null;
       }
        ListNode nextNode, prevNode = startOfRightPartition;
        while (currentNode != null) {
            nextNode = currentNode.next;
            if (currentNode.val < partitionValue) {
                //delete current from right partition
                prevNode.next = nextNode;

                //insert in left partition
                if(endOfLeftPartition==null){
                    currentNode.next=listNode;
                    listNode=currentNode;
                }else {
                    endOfLeftPartition.next = currentNode;
                    currentNode.next = startOfRightPartition;
                }
                endOfLeftPartition = currentNode;
            }else {
                prevNode=currentNode;
            }
            currentNode = nextNode;

        }
        return listNode;
    }
}

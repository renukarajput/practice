package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListToBalancedBSTTest {

    @Test
    public void sortedListToBST() {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        TreeNode treeNode = new SortedListToBalancedBST().sortedListToBST(listNode);
        BinaryTreePrinter.printNode(treeNode);

    }
}
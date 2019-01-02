package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;

public class SortedListToBalancedBST {
    public TreeNode sortedListToBST(ListNode a) {
        return fromSortedList(a, 0, size(a)-1);
    }

    private TreeNode fromSortedList(ListNode list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(getNodeAt(list, mid).val);
        root.left = fromSortedList(list, start, mid - 1);
        root.right = fromSortedList(list, mid + 1, end);
        return root;
    }

    private int size(ListNode listNode) {
        int size = 0;
        while (listNode != null) {
            listNode = listNode.next;
            size++;
        }
        return size;
    }

    private ListNode getNodeAt(ListNode list, int index) {
        while (index != 0) {
            list = list.next;
            index--;
        }
        return list;
    }
}


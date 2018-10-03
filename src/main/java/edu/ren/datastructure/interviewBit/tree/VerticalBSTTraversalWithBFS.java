package edu.ren.datastructure.interviewBit.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalBSTTraversalWithBFS {
    ArrayList<ArrayList<Integer>> getVerticalNodeValues(BinarySearchTree binarySearchTree) {
        Map<Integer, ArrayList<Integer>> horizonIndexToNodes = new TreeMap<>();
        computeInBFSOrder(binarySearchTree.root,horizonIndexToNodes);
        final ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        horizonIndexToNodes.forEach((k, v) -> result.add(v));
        return result;
    }

    class NodeWithCount{
        int count;
        BinarySearchTree.BinaryTreeNode binaryTreeNode;

        public NodeWithCount(int count, BinarySearchTree.BinaryTreeNode binaryTreeNode) {
            this.count = count;
            this.binaryTreeNode = binaryTreeNode;
        }
    }


    private void computeInBFSOrder(BinarySearchTree.BinaryTreeNode binaryTreeNode,Map<Integer, ArrayList<Integer>> horizonIndexToNodes) {
        List<NodeWithCount> queue=new ArrayList<>();
        queue.add(new NodeWithCount(0,binaryTreeNode));
        while (!queue.isEmpty()){
            NodeWithCount head = queue.remove(0);
            horizonIndexToNodes.putIfAbsent(head.count,new ArrayList<>());
            horizonIndexToNodes.get(head.count).add(head.binaryTreeNode.val);
            if(head.binaryTreeNode.left!=null) {
                queue.add(new NodeWithCount(head.count - 1, head.binaryTreeNode.left));
            }

            if(head.binaryTreeNode.right!=null) {
                queue.add(new NodeWithCount(head.count + 1, head.binaryTreeNode.right));
            }
        }
    }
}

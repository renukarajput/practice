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
        TreeNode treeNode;

        public NodeWithCount(int count, TreeNode treeNode) {
            this.count = count;
            this.treeNode = treeNode;
        }
    }


    private void computeInBFSOrder(TreeNode treeNode, Map<Integer, ArrayList<Integer>> horizonIndexToNodes) {
        List<NodeWithCount> queue=new ArrayList<>();
        queue.add(new NodeWithCount(0, treeNode));
        while (!queue.isEmpty()){
            NodeWithCount head = queue.remove(0);
            horizonIndexToNodes.putIfAbsent(head.count,new ArrayList<>());
            horizonIndexToNodes.get(head.count).add(head.treeNode.val);
            if(head.treeNode.left!=null) {
                queue.add(new NodeWithCount(head.count - 1, head.treeNode.left));
            }

            if(head.treeNode.right!=null) {
                queue.add(new NodeWithCount(head.count + 1, head.treeNode.right));
            }
        }
    }
}

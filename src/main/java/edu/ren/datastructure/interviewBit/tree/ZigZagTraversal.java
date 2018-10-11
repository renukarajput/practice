package edu.ren.datastructure.interviewBit.tree;

import scala.actors.threadpool.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ZigZagTraversal {
    private class Queue {
        List<TreeNode> queue = new LinkedList<>();

        void insert(TreeNode node) {
            if (node != null)
                queue.add(node);
        }

        TreeNode remove() {
            return queue.remove(0);
        }

        boolean isEmpty() {
            return queue.isEmpty();
        }
    }


    public ArrayList<ArrayList<Integer>> zigzag(BinarySearchTree binarySearchTree) {
        return zigzag(binarySearchTree.root);
    }

    private ArrayList<ArrayList<Integer>> zigzag(TreeNode root) {
        final ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue queueReverse = new Queue();
        Queue queue = new Queue();
        boolean isNextLevelReverse = true;
        queue.insert(root);

        ArrayList<Integer> currentLevel = new ArrayList<>();
        while (true) {
            if (queueReverse.isEmpty() && queue.isEmpty()) {
                break;
            }
            if (isNextLevelReverse) {
                if (!queue.isEmpty()) {
                    TreeNode removedRoot = queue.remove();
                    currentLevel.add(removedRoot.val);
                    if(queue.isEmpty()){
                        result.add(currentLevel);
                        currentLevel=new ArrayList<>();
                        isNextLevelReverse = false;
                    }

                    if(removedRoot.left!=null){
                        queueReverse.insert(removedRoot.left);

                    }

                    if(removedRoot.right!=null){
                        queueReverse.insert(removedRoot.right);
                    }


                }
            } else {
                if (!queueReverse.isEmpty()) {
                    TreeNode removed = queueReverse.remove();
                    currentLevel.add(0,removed.val);
                    if(queueReverse.isEmpty()){
                        isNextLevelReverse = true;
                        result.add(currentLevel);
                        currentLevel = new ArrayList<>();
                    }
                    if(removed.left!=null) {
                        queue.insert(removed.left);
                    }
                    if(removed.right!=null) {
                        queue.insert(removed.right);
                    }
                }
            }

        }
        return result;
    }
}

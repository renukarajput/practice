package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.*;
//https://leetcode.com/problems/most-frequent-subtree-sum/

public class MostFrequentSubTreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        TreeMap<Integer, Integer> sumFrequency = new TreeMap<>();
        int[] maxArr={root.val};
        sum(root,sumFrequency);
        //Integer max = sumFrequency.values().stream().max(Integer::compareTo).get();
        Iterator<Map.Entry<Integer, Integer>> iterator = sumFrequency.entrySet().iterator();
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue().equals(maxArr[0])) {
                result.add(entry.getKey());
            }
        }
        int[] sums = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sums[i] = result.get(i);
        }
        return sums;

    }

    int sum(TreeNode root,TreeMap<Integer, Integer> sumFrequency) {
        if (root == null)
            return 0;
        int treeSum = root.val + sum(root.left,sumFrequency) + sum(root.right,sumFrequency);
        Integer oldFrequency = sumFrequency.getOrDefault(treeSum, 0);
        sumFrequency.put(treeSum, oldFrequency + 1);
        return treeSum;
    }

}

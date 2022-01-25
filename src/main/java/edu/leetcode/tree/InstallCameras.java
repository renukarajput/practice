package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.TreeNode;

import java.util.HashMap;

public class InstallCameras {
    public int minCameraCover(TreeNode root) {
        HashMap<Boolean, HashMap<TreeNode, Integer>> cache = new HashMap<>();
        cache.put(true, new HashMap<>());
        cache.put(false, new HashMap<>());
        int count = minCameraCover(root, true, false, cache);
        if (root.left != null || root.right != null) {
            count = Math.min(count, minCameraCover(root, false, false, cache));
        }
        return count;
    }

    int minCameraCover(TreeNode root, boolean placeCameraAtRoot, boolean coveredByParent, HashMap<Boolean, HashMap<TreeNode, Integer>> cache) {
        if (cache.get(placeCameraAtRoot).containsKey(root)) {
            return cache.get(placeCameraAtRoot).get(root);
        }
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return placeCameraAtRoot ? 1 : coveredByParent ? 0 : 1;
        }
        int minCount=Integer.MAX_VALUE;
        if(placeCameraAtRoot) {
            int count = 1 + minCameraCover(root.left, false, true, cache)
                    + minCameraCover(root.right, false, true, cache);
            minCount = Math.min(count, minCount);
        }
        if (!placeCameraAtRoot && root.left != null && root.right != null) {
            int count = minCameraCover(root.left, true, false, cache)
                    + minCameraCover(root.right, true, false, cache);
            minCount = Math.min(count, minCount);
        }
        if (!placeCameraAtRoot && root.left != null) {
            int count = minCameraCover(root.left, true, false, cache)
                    + minCameraCover(root.right, false, false, cache);
            minCount = Math.min(count, minCount);
        }
        if (!placeCameraAtRoot && root.right != null) {
            int count = minCameraCover(root.left, false, false, cache)
                    + minCameraCover(root.right, true, false, cache);
            minCount = Math.min(count, minCount);
        }
        cache.get(placeCameraAtRoot).put(root, minCount);
        return minCount;

    }
}

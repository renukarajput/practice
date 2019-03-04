package edu.ren.geeks.tree;

import javaPro.A;

import java.util.Arrays;

public class SegmentTree {

    private int[] tree;

    private SegmentTree(int[] tree) {
        this.tree = tree;
    }

   static SegmentTree buildFrom(int[] arr) {
        int[] tree = new int[2 * arr.length + 1];
        buildFrom(arr, tree, 0, arr.length - 1, 0);
        return new SegmentTree(tree);
    }

    private  static int buildFrom(int[] arr, int[] tree, int start, int end, int resultIndex) {
        if (start == end) {
            tree[resultIndex] = arr[start];
            return arr[start];
        }
        int mid = start + (end - start) / 2;
        final int leftResult = buildFrom(arr, tree, start, mid, 2 * resultIndex + 1);
        final int rightResult = buildFrom(arr, tree, mid + 1, end, 2 * resultIndex + 2);
        tree[resultIndex] = leftResult + rightResult;
        return tree[resultIndex];
    }

    int queryRange(int startOfRange, int endOfRange) {
        final int arrLength = (tree.length - 1) / 2 - 1;
        return queryRange(tree, 0, 0, arrLength, startOfRange, endOfRange);
    }

    private int queryRange(int[] tree, int index, int startIndex, int endIndex, final int startOfRange, final int endOfRange) {
        if (startOfRange > endIndex || endOfRange < startIndex) {
            return 0;
        }
        if (startOfRange <= startIndex && endOfRange >= endIndex) {
            return tree[index];
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        final int leftResult = queryRange(tree, 2*index+1, startIndex, mid, startOfRange, endOfRange);
        final int rightResult = queryRange(tree, 2*index+2, mid + 1, endIndex, startOfRange, endOfRange);
        return leftResult+rightResult;
    }

    public int[] getTree() {
        return Arrays.copyOf(tree,tree.length);
    }


}

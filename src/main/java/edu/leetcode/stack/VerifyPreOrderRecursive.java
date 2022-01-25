package edu.leetcode.stack;

public class VerifyPreOrderRecursive {

    public boolean verifyPreorder(int[] preorder) {
        return isBST(preorder, 0, preorder.length - 1, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isBST(int[] preorder, int start, int end, long min, long max) {
        if (start > end) return true;

        int root = preorder[start];
        if (root < min || root > max) return false;

        int i = start;
        while (++i <= end) {
            if (preorder[i] > root) break;
        }

        return isBST(preorder, start + 1, i - 1, min, root - 1)
                && isBST(preorder, i, end, root + 1, max);
    }
}

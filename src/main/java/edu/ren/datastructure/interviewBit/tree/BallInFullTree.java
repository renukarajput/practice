package edu.ren.datastructure.interviewBit.tree;

public class BallInFullTree {

    static int leafNumber(int height, int k) {
        int totalNodes = (int) Math.pow(2, height+1) - 1;
        int[] tree = new int[totalNodes];
        int result = -1;
        for (int ballIndex = 0; ballIndex < k; ballIndex++) {
            int currentNode = 0;
            int nonleaf = (totalNodes - 1) / 2;
            while (currentNode < nonleaf) {
                int old = currentNode;
                if (tree[currentNode] == 0) {
                    currentNode = 2 * currentNode + 1;
                } else {
                    currentNode = 2 * currentNode + 2;
                }
                tree[old] = Math.abs(tree[old] - 1);
            }
            result = currentNode + 1;
        }
        return result;
    }
}


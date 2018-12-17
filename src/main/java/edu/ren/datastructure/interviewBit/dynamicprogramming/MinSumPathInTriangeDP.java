package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.List;

public class MinSumPathInTriangeDP extends MinSumPathInTriangle {

    @Override
    protected int minPath(List<List<Integer>> triangle) {
        int[] pathSum = new int[triangle.size()];
        pathSum[0] = triangle.get(0).get(0);
        int[] nextLevelPathSum = new int[triangle.size()];
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                nextLevelPathSum[j] = getBestPathTillJSoFar(pathSum, j,triangle.get(i-1).size()) + triangle.get(i).get(j);
            }
            int[] temp = nextLevelPathSum;
            nextLevelPathSum = pathSum;
            pathSum = temp;
        }
        int result=pathSum[0];
        for (int i = 1; i <pathSum.length ; i++) {
            result=Math.min(result,pathSum[i]);
        }
        return result;
    }

    private int getBestPathTillJSoFar(int[] pathSum, int index,int maxSize) {
        if (index == 0) {
            return pathSum[index];
        }
        if (index == maxSize) {
            return pathSum[index - 1];
        }
        return Math.min(pathSum[index], pathSum[index - 1]);
    }
}

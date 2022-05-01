package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;

public class CountNumberOfBST {

    int get(int totalNodes) {
        int[] result = new int[totalNodes + 1];
        Arrays.fill(result,-1);
        return get(totalNodes, result);
    }
    int get(int totalNodes,int[] result) {
        if(totalNodes==0){
            return 1;
        }
        int sum = 0;
        int leftCount,rightCount;
        for (int i = 1; i <= totalNodes; i++) {
            if(result[i-1]==-1) {
                 leftCount = get(i - 1,result);
            }else {
                leftCount=result[i-1];
            }
            if(result[totalNodes-i]==-1) {
                rightCount = get(totalNodes - i,result);
            }else {
                rightCount=result[totalNodes-i];
            }
            int total = leftCount * rightCount;
            sum += total;
        }
        return sum;
    }
}

package edu.leetcode.unionfind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncrementalIslandNumbers {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        int[][] islandIndex=new int[positions.length][positions[0].length];
        for(int[] indexRow:islandIndex){
            Arrays.fill(indexRow,-1);
        }
        return new ArrayList<>();
    }


}

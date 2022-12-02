package edu.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/buildings-with-an-ocean-view/
/*
Input: heights = [4,2,3,1]
Output: [0,2,3]
Explanation: Building 1 (0-indexed) does not have an ocean view because building 2 is taller.

Input: heights = [4,3,2,1]
Output: [0,1,2,3]

heights = [1,3,2,4]
Output: [3]
*/
public class BuildingWithOceanView {
    public int[] findBuildings(int[] heights) {
        int maxSoFar = -1;
        List<Integer> list = new ArrayList();
        for(int i = heights.length-1; i>=0;i--) {
            if(heights[i] > maxSoFar) {
                maxSoFar = heights[i] ;
                list.add(i);
            }
        }
        Collections.reverse(list);
        return list.stream().mapToInt(x->x).toArray();
    }
}

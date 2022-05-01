package edu.leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllSubSets {
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();

        subsets(nums,new HashSet<>(),0,result);
        List<List<Integer>> resultList=new ArrayList<>(result.size());
         resultList.addAll(result);
         return resultList;
    }
    public void subsets(int[] nums, Set<Integer> visited, int start, Set<List<Integer>> result) {
        //System.out.println("start= "+start+" visited="+visited);
        result.add(new ArrayList(visited));

        for(int i=start;i<nums.length;i++){
            if(visited.contains(nums[i])){
                continue;
            }
            visited.add(nums[i]);
            subsets(nums,visited,start+1,result);
           // System.out.println(start+"=========================================="+i);
            visited.remove(nums[i]);
        }
    }
}

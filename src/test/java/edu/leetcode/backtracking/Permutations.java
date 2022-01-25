package edu.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {
    List<List<Integer>> allPermutations;

    public List<List<Integer>> permute(int[] nums) {
        allPermutations = new ArrayList<>();
        permuteUtil(nums,0);
        return allPermutations;

    }

    void permuteUtil(int[] nums,int startIndex){
        if(startIndex==nums.length-1){
            List<Integer> current=new ArrayList<>();
            Arrays.stream(nums).forEach(x->current.add(x));
            allPermutations.add(current);
        }
        for (int i = startIndex; i <nums.length ; i++) {
            swap(nums,i,nums.length-1);
            permuteUtil(nums,startIndex+1);
            swap(nums,nums.length-1,i);
        }
    }

    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}

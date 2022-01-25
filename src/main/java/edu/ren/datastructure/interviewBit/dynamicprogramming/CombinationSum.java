package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<Integer> list=new ArrayList<>();

    public int combinationSum4(int[] nums,int target) {
        return combinationSum4(nums,0,target);
    }
    public int combinationSum4(int[] nums, int index,int target) {
        if(target==0){
            System.out.println(list);
            return 1;
        }
        if(index>=nums.length){
            return target==0?1:0;
        }

        if(target<0){
            return 0;
        }
        int count=0;

            for (int j = 0; nums[index]*j<=target ; j++) {
                for (int k = 0; k < j; k++) {
                    list.add(nums[index]);
                }
                count+= combinationSum4(nums,index+1,target-nums[index]*j);
                for (int k = 0; k < j; k++) {
                    list.remove(list.size() - 1);
                }
            }
       // }
        return count;
    }
}

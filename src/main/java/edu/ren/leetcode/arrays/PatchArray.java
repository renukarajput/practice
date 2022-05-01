package edu.ren.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class PatchArray {

    public int minPatches(int[] nums, int n) {
        int numPatch = 0;
        int currentSumToMake = 0;
        Set<Integer> patchedElements = new HashSet<>();
        while (++currentSumToMake <= n) {
            if (isSumFeasible(nums,currentSumToMake,patchedElements)) {
                continue;
            }
            patchedElements.add(currentSumToMake);
            System.out.println(currentSumToMake);
            numPatch++;
        }
        return numPatch;
    }

    private boolean isSumFeasible(int[] nums, int sum, Set<Integer> patches) {
       int left=0;int right=nums.length-1;
      while (left<right) {
          if (nums[left] == sum||nums[right] == sum)
              return true;

          if (nums[left] + nums[right] == sum){
              return true;
          }
          if (patches.contains(sum - nums[left]) || patches.contains(sum - nums[right])) {
              return true;
          }
          if (nums[left] + nums[right] < sum){
              left++;
          }else {
              right--;
          }

      }
        return false;
    }
}

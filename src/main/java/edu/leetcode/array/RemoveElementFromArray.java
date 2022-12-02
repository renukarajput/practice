package edu.leetcode.array;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/
public class RemoveElementFromArray {

    public int removeElement(int[] nums, int val) { //0,1,2,2,3,0,4,2  ==2
        int readIndex = 0, writeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                readIndex++;
            } else {
                nums[writeIndex++] = nums[readIndex++];
            }
        }
        System.out.println(" arr " + Arrays.toString(nums));
        System.out.println("write = " + writeIndex + " read " + readIndex);
        return writeIndex;
    }

    public int removeElm(int[] nums, int val) {
        int writeIdx = 0;
        for (int elem : nums) {
            if (elem != val) {
                nums[writeIdx] = elem;
                writeIdx++;
            }
        }
        return writeIdx;
    }

    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicatesFromSortedArray(int[] nums) {  // 1 1 2 2
        int writeIdx = 0, readIdx = 1;
        while (readIdx < nums.length){
            if (nums[writeIdx] != nums[readIdx]) {
                writeIdx++;
                nums[writeIdx] = nums[readIdx];
            }
            readIdx++;
        }
        System.out.println(Arrays.toString(nums) + " r= " + readIdx + " w= " + writeIdx);
        return writeIdx+1;
    }
}

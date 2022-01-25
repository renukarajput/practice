package leetcode_14days.day3;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{0});
        moveZeroes(new int[]{0, 1, 0, 3, 12, 0, 15});
        moveZeroesSpaceOptimization(new int[]{0, 1, 0, 3, 12});
        moveZeroesSpaceOptimization(new int[]{0});
        moveZeroesSpaceOptimization(new int[]{0, 1, 0, 3, 12, 0, 15});
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        int writeIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writeIdx++] = nums[i];
            }
        }
        while (count > 0) {
            nums[writeIdx++] = 0;
            count--;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesSpaceOptimization(int[] nums) {
        int writeIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writeIdx++] = nums[i];
            }
        }
        while (writeIdx < nums.length) {
            nums[writeIdx++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}

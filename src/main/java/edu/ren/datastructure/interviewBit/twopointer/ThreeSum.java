package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {
    //t=9
    //1 4 4 4 5 5 6

    //-1,2,1,-4 t=1
    //-4 -1 1 2

    /**
     * in sorted array
     * first is 0th second is 2nd last and third is last index
     * while targetSum is greater  increment 1st ,else decrease 2nd or 3rd (whichever results in closest sum)
     * @param arr
     * @param targetSum
     * @return
     */
    int closestSum(Integer[] arr, int targetSum) {
        return closestSum(new ArrayList<>(Arrays.asList(arr)), targetSum);
    }

    int closestSum(ArrayList<Integer> arr, int targetSum) {
        Collections.sort(arr);
        int first = 0, second = arr.size() - 2, third = arr.size() - 1;
        int diff = Integer.MAX_VALUE;
        int closestSum = 0;

        while (first < second - 1 || second < third - 1) {
            int currentSum = getCurrentSum(arr, first, second, third);
            if (diff >= Math.abs(currentSum - targetSum)) {
                diff = Math.abs(currentSum - targetSum);
                closestSum = currentSum;
            }
            boolean isRemaining = false;
            int diff1 = Integer.MAX_VALUE, diff2 = Integer.MAX_VALUE;
            int currentSum1 = 0, currentSum2 = 0;
            if (currentSum > targetSum) {
                if (first < second - 1) {
                    currentSum1 = getCurrentSum(arr, first, second - 1, third);
                    diff1 = Math.abs(targetSum - currentSum1);

                }
                if (second < third - 1) {
                    currentSum2 = getCurrentSum(arr, first, second, third - 1);
                    diff2 = Math.abs(targetSum - currentSum2);
                }
                if (diff1 <= diff2 && diff1 <= diff) {
                    diff = diff1;
                    currentSum = currentSum1;
                    closestSum = currentSum;
                    second--;
                    isRemaining = true;
                } else if (diff2 <= diff1 && diff2 <= diff) {
                    third--;
                    diff = Math.min(diff2, diff);
                    currentSum = currentSum2;
                    closestSum = currentSum;
                    isRemaining = true;
                }

            } else {
                if (first < second - 1) {
                    currentSum1 = getCurrentSum(arr, first + 1, second, third);
                    diff1 = Math.abs(targetSum - currentSum1);

                }
                if (second < third - 1) {
                    currentSum2 = getCurrentSum(arr, first, second + 1, third);
                    diff2 = Math.abs(targetSum - currentSum2);
                }

                if (diff1 <= diff2 && diff1 <= diff) {
                    diff = diff1;
                    currentSum = currentSum1;
                    closestSum = currentSum;
                    first++;
                    isRemaining = true;
                } else if (diff2 <= diff1 && diff2 <= diff) {
                    diff = diff2;
                    currentSum = currentSum2;
                    closestSum = currentSum;
                    second++;
                    isRemaining = true;
                }

            }
            if (!isRemaining) {
                break;
            }
        }
        return closestSum;
    }

    private int getCurrentSum(ArrayList<Integer> arr, int first, int second, int third) {
        return arr.get(first) + arr.get(second) + arr.get(third);
    }
}

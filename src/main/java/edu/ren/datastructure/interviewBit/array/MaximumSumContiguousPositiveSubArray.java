package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumContiguousPositiveSubArray extends MaximumSumContiguousSubArray {


    private long getSum(long sumTillNow, int num) {
        if (num < 0) {
            return 0;
        } else {
            if (num == 0) {
                num = 1;
            }
            if (sumTillNow >= 0) {
                return sumTillNow + num;
            } else {
                return num;
            }
        }
    }

    public ArrayList<Integer> maxset(ArrayList<Integer> input) {
        long sum = 0, maxSum = Integer.MIN_VALUE;
        int startOfSubArray = -1, startOfMaxSubArray = -1, endOfSubArray = -1, endOfMaxSubArray = -1;
        for (int i = 0; i < input.size(); i++) {
            sum = getSum(sum, input.get(i));
            if (sum > 0) { // sum till i-1 is positive ,continue with same interval
                if (startOfSubArray == -1) {
                    startOfSubArray = i;
                    endOfSubArray = i;
                } else {
                    endOfSubArray++;
                }
            } else {
                startOfSubArray = -1;
                continue;
            }

            if (compare(sum, startOfSubArray, endOfSubArray, maxSum, startOfMaxSubArray, endOfMaxSubArray)) {
                maxSum = sum;
                startOfMaxSubArray = startOfSubArray;
                endOfMaxSubArray = endOfSubArray;

            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (startOfMaxSubArray < 0) {
            return result;
        }
        List<Integer> subList = input.subList(startOfMaxSubArray, endOfMaxSubArray + 1);
        result.addAll(subList);
        return result;
    }
}

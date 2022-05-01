package edu.ren.datastructure.interviewBit.array;

public class FlipIntervalForMaxOnesOptimized extends FlipIntervalForMaximumOnes {

    @Override
    int[] flip(char[] arr) {

        return maximumContiguousSumInFlip(arr);
    }

    int[] maximumContiguousSumInFlip(char[] arr) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int startOfSubArray = -1, startOfMaxSubArray = -1, endOfSubArray = -1, endOfMaxSubArray = -1;

        for (int i = 0; i < arr.length; i++) {
            if (sum >= 0) { // sum till i-1 is positive ,continue with same interval
                if (arr[i] == Flip.ZERO) {
                    sum += 1;
                } else {
                    sum -= 1;  //treat 1s as negative as flip of them leads to loss of 1 in result

                }
                if (startOfSubArray == -1) {
                    startOfSubArray = i;
                    endOfSubArray = i;
                } else {
                    endOfSubArray++;
                }
            } else {
                sum = arr[i] == Flip.ZERO ? 1 : -1;   //else max sum interval is a new one starting here
                startOfSubArray = i;
                endOfSubArray = i;
            }
            if (sum > maxSum) {
                maxSum = sum;
                startOfMaxSubArray = startOfSubArray;
                endOfMaxSubArray = endOfSubArray;

            }
        }
        if(maxSum<=0){
            return new int[]{-1,-1};
        }
        return new int[]{startOfMaxSubArray, endOfMaxSubArray};
    }
}

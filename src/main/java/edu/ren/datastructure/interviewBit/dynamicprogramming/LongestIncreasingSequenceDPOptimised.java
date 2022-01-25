package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSequenceDPOptimised extends LongestIncreasingSequenceDP{
    @Override
    public int getLengthOfLIS(int[] arr) {
        int size = arr.length;
        int[] smallestValueOfLength = new int[size+1];
        int maxLengthFound = 0;

        smallestValueOfLength[0] = -1;

        for(int i=0; i<size; i++) {
            int currentValue = arr[i];
            int lowIndex = 1;
            int highIndex = maxLengthFound;
           //In 1-length of LIS so far ,find the position of currentValue using binarySearch
            //
            //replacing any value larger than currentValue which has same maximum length of LIS
            //the index in smallestValueOfLength represents the length of LIS
            while(lowIndex<=highIndex) {
                int mid = (lowIndex+highIndex)/2;

                if(currentValue <= smallestValueOfLength[mid])
                    highIndex = mid-1;
                else
                    lowIndex = mid+1;
            }

            smallestValueOfLength[highIndex+1] = currentValue;

            if(highIndex+1 > maxLengthFound)
                maxLengthFound = highIndex+1;
        }
        System.out.println(Arrays.toString(smallestValueOfLength));
        return maxLengthFound;

    }
}

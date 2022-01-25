package edu.ren.datastructure.interviewBit.array;

import java.util.List;

public class MaximumSumOfSubArray {

    long maximumContiguousSum(List<Integer> list){
        return maximumContiguousSum(list.toArray(new Integer[list.size()]));
    }

    long maximumContiguousSum(Integer[] arr){
        long sum=Long.MIN_VALUE,currentSum=0l;
        for (int i = 0; i < arr.length; i++) {
           currentSum+=arr[i];
           sum=Math.max(sum,currentSum);
           if(currentSum<0){
               currentSum=0;
           }
        }
        return sum;
    }

    /* //shorter version
    long maximumContiguousSum(Integer[] arr){
        long sum=Long.MIN_VALUE,currentSum=0;
        for (int i = 0; i < arr.length; i++) {
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            sum=Math.max(sum,currentSum);
        }
        return sum;
    }*/
}

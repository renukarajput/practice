package com.leetcode;

public class ShipPackages {

    // 2 2 3 1  c=5 // 2 2 5 3 1
    //uc=4      c=5
    // day++ =2   uc=3
    //5 1  c=5
    //2 4 1 c=5

    public int shipWithinDays(int[] weights, int capacity) {
        int dayCount = 0;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > capacity) {
                return -1;
            }
            sum += weights[i];
            if (sum == capacity) {
                dayCount++;
                sum=0;
            }
            if (sum > capacity){
                dayCount++;
                sum = weights[i];
            }
        }
        if (sum!=0){
            dayCount++;
        }
        return dayCount;
    }
}

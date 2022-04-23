package com.leetcode;

public class CountNumberOfTeams {

    public int numOfTeams(int[] rating) {
        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            int leftSmaller = 0, leftLarger = 0;
            int rightSmaller = 0, rightLarger = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    leftSmaller++;
                } else if (rating[j] > rating[i]) {
                    leftLarger++;
                }
            }
            for (int k = i + 1; k < rating.length; k++) {
                if (rating[i] < rating[k]) {
                    rightLarger++;
                } else if (rating[i] > rating[k]) {
                    rightSmaller++;
                }
            }
            count += leftSmaller * rightLarger + leftLarger * rightSmaller;
        }
        return count;
    }
}
package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class MaxProductSubArray {

    int getMaxContigiousProduct(int[] arr) {
        int[] maxProduct = new int[arr.length + 1];
        int[] minProduct = new int[arr.length + 1];
        int maxResult=0;
        minProduct[0] = maxProduct[0] = 1;
        for (int i = 1; i <= arr.length; i++) {
            int currentMinProduct = minProduct[i - 1] * arr[i-1];
            int currentMaxProduct = maxProduct[i - 1] * arr[i-1];
            if (currentMinProduct > currentMaxProduct) {
                int temp = currentMaxProduct;
                currentMaxProduct = currentMinProduct;
                currentMinProduct = temp;
            }
            maxProduct[i] = Math.max(currentMaxProduct,arr[i-1]);
            minProduct[i] =Math.min(currentMinProduct,arr[i-1]);
            int max=Math.max(maxProduct[i],minProduct[i]);
            maxResult=Math.max(maxResult,max);
        }
        return maxResult;
    }
}

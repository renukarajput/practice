package edu.ren.hackerrank.dp;

public class CandiesDP extends Candies {
    //1 3 2 1
    //1 2 1
    //1 2 1
    //1  3  2  1
    @Override
    int getMin(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i]=1;
                int j = i;
                while (j > 0 && arr[j] < arr[j - 1] && result[j - 1] <= result[j]) {
                    result[j - 1] = 1 + result[j];
                    j--;
                }
            }
        }
        return sum(result);
    }

    protected int sum(int[] result) {
        int sum = 0;
        for (int res : result) {
            sum += res;
        }
        return sum;
    }
}

package edu.ren.datastructure.interviewBit.greedy;

import java.util.ArrayList;
import java.util.List;

// 1, 2, 5, 10, 20, 50, 100, 500, 1000
public class MinimumNoOfCoins {

    public int getMinNoOfCoins(int[] arr, int value) {
        List<Integer> result = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (arr[i] <= value) {
                value = value - arr[i];
                result.add(arr[i]);
                if (value == 0)
                    break;
            }
            if (value == 0)
                break;
        }
        for (Integer x : result) {
            System.out.print(x + " + ");
        }
        return result.size();
    }
}

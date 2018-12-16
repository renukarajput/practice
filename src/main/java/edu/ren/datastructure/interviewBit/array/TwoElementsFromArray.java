package edu.ren.datastructure.interviewBit.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rrn3194 on 9/18/18.
 */
public class TwoElementsFromArray {

    public int[] findTwoElementsWithSum(int[] input, int sum) {
        int len = input.length - 1, diff;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                diff = sum - input[i];
                if (input[j] == diff) {
                    return new int[]{input[i], diff};
                }
            }
        }
        return new int[]{};  // List<Pair> can also be returned
    }

    public int[] findTwoElementsWithSumUsingSet(int[] input, int sum) {
        int len = input.length - 1, diff;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i <= len; i++) {
            diff = sum - input[i];
            if (hashSet.contains(diff)) {
                return new int[]{input[i], diff};
            } else {
                hashSet.add(input[i]);
            }
        }
        return new int[]{};
    }
}
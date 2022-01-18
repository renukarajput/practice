package edu.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SteppingNumbers {
    public List<Integer>
    countSteppingNumbers(int low, int high) {
        List<Integer> initial = new ArrayList<>();
        for (int i = low; i <=9 &&i<=high ; i++) {
            initial.add(i);
        }
        countSteppingNumbers(initial, low, 10, high);
        Collections.sort(initial);
        return initial;
    }

    void countSteppingNumbers(List<Integer> initial, int index, int low, int high) {
        if (index >= initial.size())
            return;

        int num = initial.get(index);
        int unitDigit = num % 10;
        for (int diff = -1; diff <= 1; diff += 2) {
            if (unitDigit == 9 && diff == 1 || unitDigit == 0 && diff == -1)
                continue;
            int next = num * 10 + unitDigit +diff;
            if (!initial.contains(next)&& next >= low && next <= high) {
                initial.add(next);
            }
            countSteppingNumbers(initial, index + 1, next, high);
        }
    }
}

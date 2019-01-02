package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestArithmenticProgressionOptimised extends LongestArithmeticProgression {
    @Override
    protected int len(List<Integer> arr) {
       // Collections.sort(set);
        int length = arr.size();
        if (length <= 2) return length;

        // Create a table and initialize all
        // values as 2. The value ofL[i][j] stores
        // LLAP with set[i] and set[j] as first two
        // elements of AP. Only valid entries are
        // the entries where j>i
        int LengthMatrix[][] = new int[length][length];

        // Initialize the result
        int llap = 2;

        // Fill entries in last column as 2.
        // There will always be two elements in
        // AP with last number of set as second
        // element in AP
        for (int i = 0; i < length; i++)
            LengthMatrix[i][length - 1] = 2;

        // Consider every element as second element of AP
        for (int j = length - 2; j >= 1; j--) {
            // Search for i and k for j
            int i = j - 1, k = j + 1;
            while (i >= 0 && k <= length - 1) {
                if (arr.get(i) + arr.get(k) < 2 * arr.get(j))
                    k++;

                    // Before changing i, set L[i][j] as 2
                else if (arr.get(i) + arr.get(k) > 2 * arr.get(j)) {
                    LengthMatrix[i][j] = 2;
                    i--;

                } else {
                    // Found i and k for j, LLAP with i and j as first two
                    // elements is equal to LLAP with j and k as first two
                    // elements plus 1. L[j][k] must have been filled
                    // before as we run the loop from right side
                    LengthMatrix[i][j] = LengthMatrix[j][k] + 1;

                    // Update overall LLAP, if needed
                    llap = Math.max(llap, LengthMatrix[i][j]);

                    // Change i and k to fill
                    // more L[i][j] values for current j
                    i--;
                    k++;
                }
            }

            // If the loop was stopped due
            // to k becoming more than
            // n-1, set the remaining
            // entties in column j as 2
            while (i >= 0) {
                LengthMatrix[i][j] = 2;
                i--;
            }
        }
        return llap;
    }
}

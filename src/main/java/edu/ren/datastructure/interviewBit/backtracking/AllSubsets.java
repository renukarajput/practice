package edu.ren.datastructure.interviewBit.backtracking;

import java.util.*;

public class AllSubsets {
    /**

     */


    /**
     * iterate from 0 to 2^n
     * for arr of size 3 ,it's 000  001 010 011 100 101 111
     * for j=0 to 3 ,if jth bit(from left) is set then take arr[j] in current subset
     *
     * @param arr
     * @return
     */
    List<List<Integer>> subsets(List<Integer> arr) {
        int size = (int) Math.pow(2, arr.size());
        List<List<Integer>> result = new ArrayList<>(size);

        for (int subsetCounter = 0; subsetCounter < size; subsetCounter++) {

            List<Integer> subset = new ArrayList<>();
            for (int subsetLength = 0; subsetLength < arr.size(); subsetLength++) {
                if ((subsetCounter & (1 << subsetLength)) > 0) {
                    subset.add(arr.get(subsetLength));
                }
            }
            result.add(subset);
        }
        return result;
    }

}
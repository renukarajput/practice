package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;

public class PalindromePartition {

    ArrayList<ArrayList<String>> partition(String str) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        partition(str.toCharArray(), 0, result, new ArrayList<>());
        return result;
    }

    private void partition(char[] str, int start, ArrayList<ArrayList<String>> result, ArrayList<String> subset) {

        for (int partitionIndex = start; partitionIndex < str.length; partitionIndex++) {
            if (isPalidrome(str, start, partitionIndex)) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = start; j <= partitionIndex; j++) {
                    stringBuilder.append(str[j]);
                }
                subset.add(stringBuilder.toString());

                if (start == str.length-1) {
                    result.add(new ArrayList<>(subset));
                }

            }else {
                return;
            }
            partition(str, partitionIndex + 1, result, subset);
            subset.clear();
        }
    }

    private boolean isPalidrome(char[] str, int start, int end) {
        while (start++ < end--) {
            if (str[start] != str[end]) {
                return false;
            }
        }
        return true;
    }
}
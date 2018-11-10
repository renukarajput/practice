package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PalindromePartition {

    ArrayList<ArrayList<String>> partition(String str) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        partition(str.toCharArray(), 0, result, new ArrayList<>());
        Comparator<ArrayList<String>> comparator = (list1, list2) -> {
            for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
                if (list1.get(i).length() != list2.get(i).length()) {
                    return list1.get(i).length() > list2.get(i).length()?1:-1;
                }
            }
            return list1.size()>list2.size()?1:-1;
        };
        Collections.sort(result, comparator);
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

                if (partitionIndex == str.length - 1) {
                    result.add(new ArrayList<>(subset));
                }

                partition(str, partitionIndex + 1, result, subset);
                if (!subset.isEmpty())
                    subset.remove(subset.size() - 1);

            } else {
                subset.clear();
                return;
            }

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
package edu.ren.algo.hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinUniqueSum {
    public static int getMinimumUniqueSum(List<Integer> arr) {
        Set<Integer> visited = new HashSet<>();
        int firstMissing = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {

            if (visited.contains(arr.get(i))) {
                firstMissing = arr.get(i);
                while (visited.contains(firstMissing)) {
                    firstMissing++;
                }
                arr.set(i, firstMissing);
                visited.add(firstMissing);
                sum += firstMissing;
            } else {
                visited.add(arr.get(i));
                sum += arr.get(i);
            }
        }
        return sum;
    }
}

package edu.ren.datastructure.pramp;

import java.util.*;

public class PairsWithGivenDifferenceOptimized {
    // {0, 1, -1, -2, 1} =>  0 -1, -1 -2
    // 4 6 5 8 7 11 9 , k=3=> 8,5
    //1 3 6 ,k=3
    public int[][] find(int[] input, int k) {
        List<int[]> list = new ArrayList<>();
        Set<Integer> elements = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            int diff = input[i] + k;
            if (elements.contains(diff)) {
                int pair[] = new int[2];
                pair[0] = diff;
                pair[1] = input[i];
                list.add(pair);
            }
            elements.add(input[i]);
        }
        return list.toArray(new int[list.size()][2]);
    }
}

package edu.ren.datastructure.pramp;

import java.util.ArrayList;
import java.util.List;

public class PairsWithGivenDifference {
// {0, 1, -1, -2, 1} =>  0 -1, -1 -2
    public int[][] find(int[] input, int k){
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int diff = input[i] - input[j];
                if (diff == k){
                    int[] pair = new int[2];
                    pair[0] = input[i];
                    pair[1] = input[j];
                    list.add(pair);
                }
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}

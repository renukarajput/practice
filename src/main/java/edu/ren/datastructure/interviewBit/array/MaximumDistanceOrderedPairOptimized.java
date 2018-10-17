package edu.ren.datastructure.interviewBit.array;

import java.util.*;

public class MaximumDistanceOrderedPairOptimized extends MaximumDistanceOrderedPair {

    @Override
    public int maximumDistance(List<Integer> arr) {
        List<Integer> sortedIndexes = new ArrayList<>();
        TreeSet<Integer> remainingIndexes = new TreeSet<>();
        for (int i = 0; i < arr.size(); i++) {
            sortedIndexes.add(i);
            remainingIndexes.add(i);
        }
        Collections.sort(sortedIndexes, Comparator.comparingInt(arr::get));
        int maxDiff = 0;
        for (int index : sortedIndexes) {
            remainingIndexes.remove(index);
            if(remainingIndexes.isEmpty()){
                break;
            }
            Integer last = remainingIndexes.last();
            int diff = last - index;
            maxDiff = Math.max(diff, maxDiff);
        }
        return maxDiff;
    }
}

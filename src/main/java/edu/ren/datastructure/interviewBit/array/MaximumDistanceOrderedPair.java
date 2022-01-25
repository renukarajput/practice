package edu.ren.datastructure.interviewBit.array;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MaximumDistanceOrderedPair {
    public int maximumDistance(List<Integer> arr) {
        int maxDistance=-1;
        TreeMap<Integer, Integer> indexMap = new TreeMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int maxCurrentDistance = getLargestDistanceFromPrevValues(arr.get(i), i, indexMap);
            indexMap.putIfAbsent(arr.get(i),i);
            maxDistance=Math.max(maxCurrentDistance,maxDistance);
        }
        return maxDistance;
    }

    private int getLargestDistanceFromPrevValues(int num, int indexOfNum, TreeMap<Integer, Integer> indexMap) {
        Iterator<Map.Entry<Integer, Integer>> iterator = indexMap.entrySet().iterator();
        int maxDistanceForNum = 0;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> smallerEntry = iterator.next();
            if (num >= smallerEntry.getKey()) {
                int diff = indexOfNum - smallerEntry.getValue();
                maxDistanceForNum = Math.max(maxDistanceForNum, diff);
            }
        }
        return maxDistanceForNum;
    }
}

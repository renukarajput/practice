package edu.ren.datastructure.interviewBit.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MaximumInSlidingWindow {

    List<Integer> getMax(Integer[] arr, int windowSize) {
        return getMax(Arrays.asList(arr),windowSize);
    }

    // 1, 2, 3, 1, ....4, 5, 2, 3, 6
    List<Integer> getMax(List<Integer> arr, int windowSize) {
        List<Integer> windowMax = new ArrayList<>();
        int start = 0, end = windowSize - 1;
        if(end>arr.size()-1){
            end=arr.size()-1;
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = start; i <= end; i++) {
            treeSet.add(arr.get(i));
        }
        Integer last = treeSet.last();
        windowMax.add(last);

        while (end < arr.size()-1) {
            end++;
            treeSet.remove(arr.get(start));
            treeSet.add(arr.get(end));
            last = treeSet.last();
            windowMax.add(last);
            start++;
        }
        return windowMax;
    }
}

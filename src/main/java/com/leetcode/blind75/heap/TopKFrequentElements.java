package com.leetcode.blind75.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// https://leetcode.com/problems/top-k-frequent-elements/
/*
Return elements which has high frequency upto length K
*/
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        if (k == nums.length) return nums;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (int no : map.keySet()) {
            heap.add(no);
            if (heap.size() > k)
                heap.poll();
        }
        int[] frequentElms = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            frequentElms[i] = heap.poll();
        }
        return frequentElms;
    }
}

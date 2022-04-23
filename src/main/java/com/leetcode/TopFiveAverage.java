package com.leetcode;

import java.util.*;

public class TopFiveAverage {
    private final int K = 5;

    public int[][] highFiveUsingMaxHeap(int[][] items) {
        TreeMap<Integer, Queue<Integer>> allScores = new TreeMap<>();
        for (int[] item : items) {
            int id = item[0];
            int score = item[1];
            if (!allScores.containsKey(id))
                // max heap
                allScores.put(id, new PriorityQueue<>((a, b) -> b - a));  // comparator
            // Add score to the max heap
            allScores.get(id).add(score);
        }
        List<int[]> solution = new ArrayList<>();
        for (int id : allScores.keySet()) {
            int sum = 0;
            // obtain the top k scores (k = 5)
            for (int i = 0; i < K; ++i) {
                final Queue<Integer> queue = allScores.get(id);
                sum += queue.poll();
            }
            solution.add(new int[]{id, sum / K});
        }
        int[][] solutionArray = new int[solution.size()][];
        return solution.toArray(solutionArray);
    }

    public static void main(String[] args) {
        TopFiveAverage obj = new TopFiveAverage();
        final int[][] input = {{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}};
        int[][] highFiveUsingMaxHeap = obj.highFiveUsingMaxHeap(input);
        System.out.println("max heap - res = " + Arrays.deepToString(highFiveUsingMaxHeap));
        int[][] highFiveUsingMinHeap = obj.highFiveUsingMinHeap(input);
        System.out.println("min heap - res = " + Arrays.deepToString(highFiveUsingMinHeap));
    }

    public int[][] highFiveUsingMinHeap(int[][] items) {
        TreeMap<Integer, Queue<Integer>> allScores = new TreeMap<>();
        for (int[] item : items) {
            int id = item[0];
            int score = item[1];
            if (!allScores.containsKey(id))
                // insert the score in the min heap
                allScores.put(id, new PriorityQueue<>());
            allScores.get(id).add(score);
            // remove the minimum element from the min heap in case the size of the min heap exceeds 5
            if (allScores.get(id).size() > K) {
                allScores.get(id).poll();
            }
        }
        List<int[]> solution = new ArrayList<>();
        for (int id : allScores.keySet()) {
            int sum = 0;
            // obtain the top k scores (k = 5)
            for (int i = 0; i < K; ++i) {
                sum += allScores.get(id).poll();
            }
            solution.add(new int[]{id, sum / K});
        }
        int[][] solutionArray = new int[solution.size()][];
        return solution.toArray(solutionArray);
    }

}

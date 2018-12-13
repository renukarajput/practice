package edu.ren.datastructure.interviewBit.array;


import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumProductOptimized {

    public int[] getPairOfMaxProductFromOptimized(int[] input) {
        int length = 2;
        int[] pair = new int[length];
        int max, smax, min, smin;
        if (input[0] > input[1]) {
            max = input[0];
            smax = input[1];
        } else {
            max = input[1];
            smax = input[0];
        }
        min = smax;
        smin = max;
        for (int i = 2; i < input.length; i++) {
            if (max < input[i]) {
                smax = max;
                max = input[i];
            } else {
                if (smax < input[i]) {
                    smax = input[i];
                }
            }

            if (min > input[i]) {
                smin = min;
                min = input[i];
            } else {
                if (smin > input[i]) {
                    smin = input[i];
                }
            }
        }
        int maxProduct = max * smax;
        int minProduct = min * smin;
        if (maxProduct > minProduct) {
            pair[0] = smax;
            pair[1] = max;
        } else {
            pair[0] = smin;
            pair[1] = min;
        }
        return pair;
    }

    // -1, -2, -4, -6, -3, -7, -8

    public int[] getPairOfMaxProductUsingPriorityQueue(int[] input) {
        final int length = 2;
        final int[] pair = new int[length];
        Integer currentMin = Integer.MIN_VALUE;
        Integer currentMax = Integer.MAX_VALUE;
        PriorityQueue<Integer> topElements = new PriorityQueue(2);
        Comparator<Integer> reverseComparator = Comparator.<Integer>comparingInt(i -> i.intValue()).reversed();
        PriorityQueue<Integer> minElements = new PriorityQueue(2, reverseComparator);

        for (int i = 0; i < input.length; i++) {
            if (!topElements.isEmpty()) {
                currentMin = topElements.peek();
            }
            if (topElements.size() == length) {
                if (currentMin < input[i]) {
                    topElements.remove();
                    topElements.add(input[i]);
                }
            }
            if (topElements.size() < length) {
                topElements.add(input[i]);
            }
            if (!minElements.isEmpty()) {
                currentMax = minElements.peek();
            }
            if (minElements.size() == length) {
                if (currentMax > input[i]) {
                    minElements.remove();
                    minElements.add(input[i]);
                }
            }
            if (minElements.size() < length) {
                minElements.add(input[i]);
            }
        }
        int first = minElements.remove();
        int second = minElements.remove();

        pair[0] = topElements.remove();
        pair[1] = topElements.remove();

        if (first * second > pair[0] * pair[1]) {
            pair[0] = first;
            pair[1] = second;
        }
        return pair;
    }
}


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

    public int getMaxProductUsingPriorityQueue(int[] input, int length) {

        Comparator<Integer> comparator = Comparator.comparingInt(i -> i.intValue());
        Comparator<Integer> reverseComparator = Comparator.<Integer>comparingInt(i -> i.intValue()).reversed();

        PriorityQueue<Integer> topElementsQueue = new PriorityQueue(2);
        PriorityQueue<Integer> minElementsQueue = new PriorityQueue(2, reverseComparator);


        for (int i = 0; i < input.length; i++) {
            addElementToQueueIfFitsInTopK(topElementsQueue, comparator, input[i], length);
            addElementToQueueIfFitsInTopK(minElementsQueue, reverseComparator, input[i], length);
        }
        int maxElement = Integer.MIN_VALUE;
        int productFromMaxElements = 1;
        for (int element : topElementsQueue) {
            productFromMaxElements *= element;
            maxElement = Math.max(maxElement, element);
        }

        //-7 -8 1 2 3 4 5
        if (length % 2 == 0) {
            int productFromMinElements = 1;
            for (int element : minElementsQueue) {
                productFromMinElements *= element;
            }
            return Math.max(productFromMaxElements, productFromMinElements);
        } else {
            int product = 1;
            minElementsQueue.remove();
            for (int element : minElementsQueue) {
                product *= element;
            }
            return Math.max(productFromMaxElements, maxElement * product);
        }
    }


    private void addElementToQueueIfFitsInTopK(PriorityQueue<Integer> topElements, Comparator<Integer> comparator, int input, final int k) {
        int currentBest;
        if (!topElements.isEmpty()) {
            currentBest = topElements.peek();

            if (topElements.size() == k) {
                if (comparator.compare(currentBest, input) < 0) {
                    topElements.remove();
                    topElements.add(input);
                }
            }
        }

        if (topElements.size() < k) {
            topElements.add(input);
        }
    }
}


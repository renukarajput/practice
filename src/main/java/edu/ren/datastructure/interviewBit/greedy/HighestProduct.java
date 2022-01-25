package edu.ren.datastructure.interviewBit.greedy;

import java.util.*;
import java.util.stream.Collectors;

public class HighestProduct {
    int get(Integer[] arr){
        return get(Arrays.asList(arr));
    }

    private int get(List<Integer> arr) {
        int numElements = 3;
        PriorityQueue<Integer> maxElements = new PriorityQueue<>(numElements);
        int minElementSize = numElements;
        if (numElements % 2 != 0) {
            minElementSize = numElements - 1;
        }
        PriorityQueue<Integer> minElements = new PriorityQueue<>(minElementSize, Collections.reverseOrder());
        for (int current : arr) {
            if (maxElements.size() == numElements) {
                if (maxElements.peek() < current) {
                    maxElements.remove();
                    maxElements.add(current);
                }

            } else {
                maxElements.add(current);
            }

            if (minElements.size() == minElementSize) {
                if (minElements.peek() > current) {
                    minElements.remove();
                    minElements.add(current);
                }
            }
                else {
                    minElements.add(current);
                }

        }
        final List<Integer> sortedMaxElements = maxElements.stream().sorted().collect(Collectors.toList());
        final List<Integer> sortedMinElements = minElements.stream().sorted().collect(Collectors.toList());

        int product1 = 1;
        for (int elem : sortedMaxElements) {
            product1 *= elem;
        }

        int product2 = 1;
        for (int elem : sortedMinElements) {
            product2 *= elem;
        }
        return Math.max(product1, product2 * sortedMaxElements.get(sortedMaxElements.size() - 1));
    }
}

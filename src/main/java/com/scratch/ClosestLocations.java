package com.scratch;

import java.util.*;

public class ClosestLocations {

    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries) {
        Comparator<List<Integer>> comparator = (one, two) -> {
            final double d1 = Math.sqrt(one.get(0) * one.get(0) + one.get(1) * one.get(1));
            final double d2 = Math.sqrt(two.get(0) * two.get(0) + two.get(1) * two.get(1));
            return Double.compare(d1, d2);
        };
        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(comparator.reversed());
        for (int i = 0; i < numDestinations; i++) {
            final List<Integer> current = allLocations.get(i);
            if (queue.size() == numDeliveries) {
                if (comparator.compare(current, queue.peek()) < 0) {
                    queue.remove();
                    queue.add(current);
                }
            } else {
                queue.add(current);
            }
        }
        final ArrayList<List<Integer>> result = new ArrayList<>(queue);
        Collections.sort(result,comparator);
        return result;
    }
}

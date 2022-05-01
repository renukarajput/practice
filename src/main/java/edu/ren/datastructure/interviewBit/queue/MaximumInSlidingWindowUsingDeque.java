package edu.ren.datastructure.interviewBit.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumInSlidingWindowUsingDeque extends MaximumInSlidingWindow {
    @Override
    List<Integer> getMax(Integer[] arr, int windowSize) {
        return getMax(Arrays.asList(arr),windowSize);
    }
    ArrayList<Integer> getMax(List<Integer> arr, int windowSize) {
        final ArrayList<Integer> maxInWindowList = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int currentMaxIndex;
        for (int i = 0; i < arr.size(); i++) {
            if (deque.isEmpty()) {
                deque.addFirst(i);
            } else {
                currentMaxIndex = deque.getFirst();
                if (arr.get(i) >= arr.get(currentMaxIndex)) {
                    deque.clear();
                }
                while (!deque.isEmpty() && arr.get(i)>=arr.get(deque.getLast())){
                    deque.removeLast();
                }
                deque.addLast(i);

                while (i - deque.getFirst() >= windowSize) {
                    deque.removeFirst();
                }

            }
            if (i >= windowSize - 1||(i==arr.size()-1&&windowSize>i)) {
                Integer maxIndex = deque.getFirst();
                maxInWindowList.add(arr.get(maxIndex));
            }
        }
        return maxInWindowList;
    }
}

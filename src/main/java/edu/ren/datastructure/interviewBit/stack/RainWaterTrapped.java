package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RainWaterTrapped {
    int getAmount(Integer[] bars) {
        return getAmount(Arrays.asList(bars));
    }
    public int getAmount(List<Integer>  bars) {
        // skip zeros
        int currentIndex = 0;
        while (currentIndex < bars.size() && bars.get(currentIndex) == 0) ++currentIndex;

        // check each one
        int volume = 0;
        Stack<Integer> stack = new Stack<>();
        while (currentIndex < bars.size()) {
            while (!stack.isEmpty() && bars.get(currentIndex) >= bars.get(stack.peek())) {
                int lastRemoved = stack.pop();
                if (stack.isEmpty()) break;
                Integer topIndex = stack.peek();
                int minCommonHeight = Math.min(bars.get(currentIndex), bars.get(topIndex));
                volume += ((currentIndex - topIndex - 1) * (minCommonHeight - bars.get(lastRemoved)));
            }
            stack.push(currentIndex);
            ++currentIndex;
        }

        return volume;
    }

    int getAmount_(List<Integer> bars) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int currentBarVolumeSum = 0, amount = 0;
        int totalAmount = 0;
        for (int i = 0; i < bars.size(); i++) {
            if (stack.isEmpty()) {
                currentBarVolumeSum = 0;
                stack.addFirst(i);
                continue;
            }
            int topIndex = stack.getFirst();
            boolean isMatch = false;
            while (bars.get(topIndex) < bars.get(i)) {
                currentBarVolumeSum += bars.get(topIndex);
                stack.removeFirst();
                if (stack.isEmpty()) {
                    break;
                }
                Integer newTopIndex = stack.getFirst();
                if(bars.get(topIndex)<bars.get(newTopIndex)){
                    isMatch = true;
                }
                topIndex = newTopIndex;
            }

            if (isMatch) {
                if(stack.isEmpty()) {
                    currentBarVolumeSum = currentBarVolumeSum - bars.get(topIndex);
                }

                int minCommonHeight = Math.min(bars.get(topIndex), bars.get(i));
                amount = (i - topIndex-1) * minCommonHeight - currentBarVolumeSum;
                currentBarVolumeSum+=amount;
                totalAmount += amount;
            }
            if(stack.isEmpty()){
                currentBarVolumeSum=0;
            }
            System.out.println(i+"=="+totalAmount);
            stack.addFirst(i);
        }
        return totalAmount;
    }
}

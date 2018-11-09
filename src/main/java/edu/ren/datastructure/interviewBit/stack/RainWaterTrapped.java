package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class RainWaterTrapped {
    int getAmount(Integer[] bars) {
        return getAmount(Arrays.asList(bars));
    }

    int getAmount(List<Integer> bars) {
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
                if(bars.get(topIndex)<stack.getFirst()){
                    isMatch = true;
                }
                topIndex = stack.getFirst();
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
            //System.out.println(i+"=="+totalAmount);
            stack.addFirst(i);
        }
        return totalAmount;
    }
}

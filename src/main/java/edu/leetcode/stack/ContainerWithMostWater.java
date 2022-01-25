package edu.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ContainerWithMostWater {

    public int trap(int[] height) {
        int current = 0, vol = 0, prevVol = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int poppedBlockedVol = 0;
        while (current < height.length) {
            if (stack.isEmpty()) {
                stack.push(current);
                current++;
                continue;
            }
            Integer farthestEqualOrLarger = stack.peek();
            if (height[farthestEqualOrLarger] <= height[current]) {
                int currentBlockedVol = 0;
                while (height[farthestEqualOrLarger] <= height[current]) {
                    currentBlockedVol += height[stack.pop()];
                    if (stack.isEmpty()) {
                         currentBlockedVol-=height[farthestEqualOrLarger];
                        break;
                    }
                    farthestEqualOrLarger = stack.peek();
                }
                int distance = current - farthestEqualOrLarger - 1;
                int currentVol = Math.min(height[farthestEqualOrLarger], height[current]) * distance;
                int addVol = currentVol - currentBlockedVol - poppedBlockedVol - prevVol;
                prevVol = addVol;
                poppedBlockedVol += currentBlockedVol;
                vol += addVol;
            }

            if (stack.isEmpty()) {
                poppedBlockedVol = 0;
                prevVol = 0;
            }
            stack.push(current);
            current++;
        }
        return vol;
    }
}
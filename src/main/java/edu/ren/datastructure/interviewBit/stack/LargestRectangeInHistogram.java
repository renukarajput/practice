package edu.ren.datastructure.interviewBit.stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class LargestRectangeInHistogram extends LargestRectangleInHistogramNaive {
    @Override
    int getMaxArea(int[] arr) {
        int max=0;
        int[] left = indexOfNearestSmallestElementsOnLeft(arr);
        int[] right = indexOfNearestSmallestElementsOnRight(arr);
        for (int i = 0; i <arr.length ; i++) {
            int numBars,area;
            if(left[i]==-1 && right[i]==-1){
                numBars=arr.length;
            }
           else if(left[i]==-1){
              numBars=right[i];
            }else if(right[i]==-1){
                numBars=(arr.length-1-left[i]);
            }else {
                numBars=right[i]-left[i]-1;
            }
             area=numBars*arr[i];
            max=Math.max(max,area);
        }
        return max;
    }

    int[] indexOfNearestSmallestElementsOnRight(int[] arr) {
        int[] nearestSmallerOnRight = new int[arr.length];
        Arrays.fill(nearestSmallerOnRight, -1);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(0);

        for (int i = 1; i < arr.length; i++) {
            int topIndex = stack.peek();
            while (arr[topIndex] > arr[i]) {
                nearestSmallerOnRight[topIndex] = i;
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                topIndex = stack.peek();
            }
            stack.addFirst(i);
        }
        return nearestSmallerOnRight;
    }

    int[] indexOfNearestSmallestElementsOnLeft(int[] arr) {
        int[] nearestSmallerOnLeft = new int[arr.length];
        Arrays.fill(nearestSmallerOnLeft, -1);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(arr.length - 1);
        for (int i = arr.length - 2; i >= 0; i--) {
            int topIndex = stack.peek();
            while (arr[topIndex] > arr[i]) {
                nearestSmallerOnLeft[topIndex] = i;
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                topIndex = stack.peek();
            }
            stack.addFirst(i);
        }
        return nearestSmallerOnLeft;
    }

}

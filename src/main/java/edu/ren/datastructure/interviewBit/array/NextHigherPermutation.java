package edu.ren.datastructure.interviewBit.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextHigherPermutation {
    /**
     * 1 3 2
     *
     * @param arr
     */
    int getLength(int num, int base) {
        int count = 0;
        while (num > 0) {
            num = num / base;
            count++;
        }
        return count;
    }

    int getNumOfFirstNdigitsOfOtherNum(int otherNum, int num) {
        int otherLength = getLength(otherNum, 10);
        int length = getLength(num, 10);
        if (otherLength != length) {
            otherNum = num / (otherLength - length);
        }
        return otherNum;
    }

    void nextPermutation(ArrayList<Integer> arr) {
        int endOfBlock = arr.size() - 1;
        int current = endOfBlock;

        while (current > 0 && arr.get(current) < arr.get(current - 1)) {
            current--;
        }
        if (current <= 0) {
            Collections.sort(arr);
            return;
        }

        int element = arr.get(current - 1);
        int start = current;
        int end = endOfBlock;
        int maxDiff = Integer.MAX_VALUE;
        int position = -1;
        for (int i = start; i <= end; i++) {
            int diff = arr.get(i) - element;
            if (diff < maxDiff && diff>0) {
                maxDiff = diff;
                position = i;
            }
        }
        if (position != -1) {
            swap(arr, current - 1, position);
            rev(arr, start, endOfBlock);
        }
    }

    void rev(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(end);
            arr.set(end, arr.get(start));
            arr.set(start, temp);
            start++;
            end--;
        }
    }

    protected void swap(ArrayList<Integer> arr, int index, int currentIndex) {
        int temp = arr.get(index);
        arr.set(index, arr.get(currentIndex));
        arr.set(currentIndex, temp);
    }

    void nextPermutation_(ArrayList<Integer> arr) {
        int currentIndex = arr.size() - 1;
        while (currentIndex > 0) {
            int index = currentIndex - 1;
            int closestIndex = currentIndex;
            boolean isDesc = false;
            if (arr.get(index) < arr.get(closestIndex)) {
                int diff = Integer.MAX_VALUE;
                int currentClosestIndex = currentIndex;
                while (closestIndex < arr.size() && arr.get(index) < arr.get(closestIndex)) {
                    //get closest higher in right part
                    if (diff > arr.get(closestIndex) - arr.get(index)) {
                        currentClosestIndex = closestIndex;
                        diff = arr.get(closestIndex) - arr.get(index);
                    }
                    isDesc = true;
                    closestIndex++;
                }
                closestIndex = currentClosestIndex;
            }
            if (isDesc) {
                //insert closest index to index
                shiftRight(arr, index, closestIndex);
                return;
            }
            currentIndex--;
        }
        if (currentIndex == 0) {
            reverse(arr);
        }
    }

    private void shiftRight(ArrayList<Integer> arr, int fromIndex, int toIndex) {
        int start = toIndex;
        int num = arr.get(toIndex);
        while (start > fromIndex) {
            arr.set(start, arr.get(start - 1));
            start--;
        }
        arr.set(fromIndex, num);

    }

    protected void reverse(ArrayList<Integer> arr) {
        reverse(arr, 0, arr.size() - 1);
    }

    protected void reverse(ArrayList<Integer> arr, int startIndex, int endIndex) {
        for (int start = startIndex, end = endIndex; start < end; start++, end--) {
            swap(arr, start, end);
        }
    }


}

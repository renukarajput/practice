package edu.ren.datastructure.interviewBit.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumUnSortedSubArrayOptimised extends MaximumUnsortedSubArray {

    @Override
    public ArrayList<Integer> maximumSubArray(List<Integer> arr) {
        int startIndex = 0, endIndex = arr.size() - 1;
        while (startIndex < arr.size() - 1 && arr.get(startIndex + 1) >= arr.get(startIndex)) {
            startIndex++;
        }
        if (startIndex == arr.size() - 1) {
            return new ArrayList<>(Arrays.asList(new Integer[]{-1}));
        }
        while (endIndex > 0 && arr.get(endIndex - 1) <= arr.get(endIndex)) {
            endIndex--;
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = startIndex; i <= endIndex; i++) {
            max = Math.max(arr.get(i), max);
            min = Math.min(arr.get(i), min);
        }

        ArrayList<Integer> result = new ArrayList<>();

        int startIndexInSorted = getPositionInSortedOrder(arr, 0, startIndex, false,min);
        int endIndexInSorted = getPositionInSortedOrder(arr, endIndex, arr.size() - 1,true, max);

        result.add(startIndexInSorted);
        result.add(endIndexInSorted-1);


        return result;
    }


    public static int getPositionInSortedOrder(List<Integer> input, int start,int end,boolean lookForSmallestPosition, int noToSearch) {

        int low = start, high = end;
        while (true) {
            int mid = low + (high - low) / 2;
            if (input.get(mid) == noToSearch) {
                if (lookForSmallestPosition) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (noToSearch < input.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if(low>high){
                break;
            }
        }

        return low;
    }
}

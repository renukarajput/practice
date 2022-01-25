package edu.ren.datastructure.interviewBit.stack;

//4 5 6 5 5 5
public class LargestRectangleInHistogramNaive {
    int getMaxArea(int[] arr) {
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int area = maxAreaUsingBarsOnLeft(arr, i);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    private int maxAreaUsingBarsOnLeft(int[] arr, int i) {
        int j = i - 1;
        int min = arr[i];
        int maxArea = arr[i];
        while (j >= 0) {
            if (arr[j] < min) {
                min = arr[j];
            }
            int area = min * (1 + i - j);
            if (maxArea < area) {
                maxArea = area;
            }
            j--;
        }

        return maxArea;
    }
}

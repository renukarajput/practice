package edu.ren.misc.problems;

public class SearchInRotatedArray {

    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start + 1 < end) {
            System.out.println("running"+start+" - "+ end);
            mid = start + (end - start) / 2;
            if (arr[start] < arr[mid]) {

                //target in [start , mid]
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                //target in [mid , end]
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }

        }

        if (arr[start] == target) {
            return start;
        }

        if (arr[end] == target) {
            return end;
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(SearchInRotatedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(SearchInRotatedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }
}

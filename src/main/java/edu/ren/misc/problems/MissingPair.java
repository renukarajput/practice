package edu.ren.misc.problems;

public class MissingPair {
    int getMissingPair(int[] arr) {
        int low = 0, high = arr.length-1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid < arr.length - 1 && mid > 0) {
                if (arr[mid] == arr[mid + 1]) {
                    int numElementsTillMidPair = mid + 2;
                    if (numElementsTillMidPair % 2 == 0) {
                        low = mid + 2;
                    } else {
                        high = mid - 1;
                    }
                } else if (arr[mid] == arr[mid - 1]) {
                    int numElementsTillMidPair = mid + 1;
                    if (numElementsTillMidPair % 2 == 0) {
                        low = mid + 1;
                    } else {
                        high = mid - 2;
                    }
                }else {
                    return arr[mid];
                }
            }else{
                if (mid == 0 && arr[mid] != arr[mid + 1]) {
                    return arr[mid];
                }
                if (mid == arr.length - 1 && arr[mid] != arr[mid - 1]) {
                    return arr[mid];
                }
            }
        }
        return arr[low];
    }
}

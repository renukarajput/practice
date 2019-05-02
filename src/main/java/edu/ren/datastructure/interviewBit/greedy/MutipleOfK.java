package edu.ren.datastructure.interviewBit.greedy;

public class MutipleOfK {
    // 4, 5, 6, 7, 10, 15, 9
    public int modify(int[] arr, int k) {
        int operations = 0;
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0)
                continue;
            if (arr[i] < k) {
                int diff = k - arr[i];
                if (diff == 1)
                    num = arr[i] + diff;
            } else {
                int diff = arr[i] - k;
                if (diff == 1)
                    num = arr[i] - diff;
            }
            if (num % k == 0) {
                operations++;
            }
        }
        return operations;
    }
}

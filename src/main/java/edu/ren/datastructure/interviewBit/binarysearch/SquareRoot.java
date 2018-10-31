package edu.ren.datastructure.interviewBit.binarysearch;

public class SquareRoot {
    int sqrt(int num) {
        int low = 0, high = num;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid != 0 && mid > num / mid) {
                high = mid - 1;
            } else {
                long sqr = mid * mid;
                if (sqr == num) {
                    return mid;
                }
                long highSqr = (mid + 1) * (mid + 1);
                if (sqr < num && highSqr > num) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        return low;
    }
}

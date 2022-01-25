package edu.ren.misc.problems;

public class GuessNumber {
    int actual;

    public GuessNumber(int no) {
        this.actual = no;
    }

    int guessNumber(int no) {
        int low = 0;
        int high = no;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);
            if (result == 0)
                return mid;
            if (result < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    private int guess(int num) {
        return Integer.compare(actual, num);
    }
}

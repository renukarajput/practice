package edu.ren.geeks.dp;

public class WaysToReach {
    public int fibb(int n) {
        return noOfWays(n + 1);
    }

    public int noOfWays(int n) {
        if (n <= 1) {
            return n;
        }
        return noOfWays(n - 1) + noOfWays(n - 2);
    }
}

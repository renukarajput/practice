package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Fibbonicci {
    static Map<Integer, Integer> map = new HashMap<>();

    static {
        map.put(0, 0);
        map.put(1, 1);
    }

    // Using Recursion -> time - O(2^N) ,space O(N)
    public static int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }

    //top down approach - using map - O(N) time, O(N) space
    public static int fibTopDown(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        map.put(n, fibTopDown(n - 1) + fibTopDown(n - 2));
        return map.get(n);
    }

    //bottom up - using array - time complexity -> O(N) space - O(N)
    public static int fibBottomUp(int n) {
        if (n <= 1)
            return n;
        int[] cache = new int[n + 1];
        cache[1] = 1;
        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        System.out.println(fibTopDown(4));
        System.out.println(fibBottomUp(4));
        System.out.println(fibIterativeBottomUp(4));
    }

//    time complexity -> O(N) space - O(1)
    private static int fibIterativeBottomUp(int n) {
        if (n <= 1)
            return n;
        int first = 0, second = 1, current = 0;
        for (int i = 2; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }
        return current;
    }
// 2 1 - ===1
}

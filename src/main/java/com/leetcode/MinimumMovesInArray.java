package com.leetcode;

import java.util.List;

class MinimumMovesInArray {

// 3 4 6 6 3
    public static long countMoves(List<Integer> numbers) {
        final Integer min = numbers.stream().min(Integer::compareTo).get();
        long res=0;
        for (int i = 0; i < numbers.size(); i++) {
            int diff = numbers.get(i) - min;
            res += diff;
        }
        return res;
    }

    public static int minMovesToEqualArrElements(int[] numbers) {
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }
        int res=0;
        // 1 2 3
        for (int i = 0; i < numbers.length; i++) {
            int diff = numbers[i] - min;
            res += diff;
        }
        return res;
    }
}

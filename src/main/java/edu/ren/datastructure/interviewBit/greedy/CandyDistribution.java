package edu.ren.datastructure.interviewBit.greedy;

import java.util.Arrays;
import java.util.List;

public class CandyDistribution {
    int getMin(Integer[] ratings) {
        return getMin(Arrays.asList(ratings));
    }

    int getMin(List<Integer> ratings) {
        int cnt = 0;
        for (int i = 0; i < ratings.size(); i++) {
            cnt += getMin(ratings, i);
        }
        return cnt;
    }

    private int getMin(List<Integer> ratings, int currentIndex) {
        if ((currentIndex == 0 || ratings.get(currentIndex) < ratings.get(currentIndex - 1)) && (currentIndex == ratings.size() - 1 || ratings.get(currentIndex) < ratings.get(currentIndex + 1))) {
            return 1;
        }
        int left = 1, right = 1;
        if (currentIndex < ratings.size() - 1 && ratings.get(currentIndex) > ratings.get(currentIndex + 1)) {
            right = 1 + getMin(ratings, currentIndex + 1);
        }
        if (currentIndex > 0 && ratings.get(currentIndex) > ratings.get(currentIndex - 1)) {
            left = 1 + getMin(ratings, currentIndex - 1);
        }
        final int num = Math.max(right, left);
        return num;
    }
}

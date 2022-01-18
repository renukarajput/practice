package edu.leetcode.misc;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms2 {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[1]));
        for (int i = 0; i <intervals.length ; i++) {

        }
        return 0;

    }
}

package edu.ren.datastructure.interviewBit.greedy;

import org.junit.Test;

public class ActivitySelectionTest {
    ActivitySelection activitySelection = new ActivitySelection();

    @Test
    public void maximumActivities_1() {
        int start[] = {10, 12, 20};
        int finish[] = {20, 25, 30};
        activitySelection.maximumActivities(start, finish, 3);
    }

    @Test
    public void maximumActivities_2() {
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        activitySelection.maximumActivities(start, finish, 6);
    }
}
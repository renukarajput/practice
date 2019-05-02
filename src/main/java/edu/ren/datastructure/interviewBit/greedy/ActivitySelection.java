package edu.ren.datastructure.interviewBit.greedy;

import java.util.Arrays;

class ActivitySelection {

    void maximumActivities(int[] start, int[] finish, int n) {
        Arrays.sort(finish);
        int i = 0;
        System.out.println(i+" ");
        for (int j = 1; j < n; j++) {
            if (start[j] >= finish[i]){
                System.out.println(j+" ");
                i=j;
            }
        }
    }
}

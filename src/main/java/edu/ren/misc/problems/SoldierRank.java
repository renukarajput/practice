package edu.ren.misc.problems;

import java.util.HashSet;
import java.util.Set;

public class SoldierRank {

    //3,4,3,0,2,2,3,0,0

    public int reportToSuperior(int[] ranks) {
        Set<Integer> rankSet = new HashSet<>();
        int count = 0;
        for (Integer i : ranks) {
            rankSet.add(i);
        }
        for (int i = 0; i < ranks.length; i++) {
            if (rankSet.contains(ranks[i] + 1)) {
                count++;
            }
        }
        return count;
    }
}

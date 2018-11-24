package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {
    public  List<List<Integer>> getGridAsLists(Integer[][] grid) {
        List<List<Integer>> gridList = new ArrayList<>();
        for (Integer[] gridRow : grid) {
            gridList.add(Arrays.asList(gridRow));
        }
        return gridList;
    }
}

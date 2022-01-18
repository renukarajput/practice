package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AllSubSetsTest {
    AllSubSets allSubSets=new AllSubSets();

    @Test
    public void subsets() {
        List<List<Integer>> subsets = allSubSets.subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}
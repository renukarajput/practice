package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AllSubSetsWithDuplicatesTest {
AllSubSetsWithDuplicates allSubSetsWithDuplicates=new AllSubSetsWithDuplicates();
    @Test
    public void subsetsWithDup() {
        List<List<Integer>> res = allSubSetsWithDuplicates.subsetsWithDup(new int[]{1, 2, 2});
        System.out.println(res);
    }
}
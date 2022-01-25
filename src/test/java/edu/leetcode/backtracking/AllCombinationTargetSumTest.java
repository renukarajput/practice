package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AllCombinationTargetSumTest {

    @Test
    public void combinationSum() {
        List<List<Integer>> res = new AllCombinationTargetSum()
                .combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(res);
        assertThat(res.toString(),is("[[2, 2, 3], [7]]"));
    }


    @Test
    public void combinationSum_01() {
        List<List<Integer>> res = new AllCombinationTargetSum()
                .combinationSum(new int[]{2,3,5}, 8);
        System.out.println(res);
        assertThat(res.toString(),is("[[2, 2, 2, 2], [2, 3, 3], [3, 5]]"));
    }
}
package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AllOnceCombinationTargetSumTest {
    @Test
    public void combinationSum() {
        List<List<Integer>> res = new AllOnceCombinationTargetSum()
                .combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        System.out.println(res);
        //assertThat(res.toString(),is("[[2, 2, 3], [7]]"));
    }
    /*[
            [1,1,6],
            [1,2,5],
            [1,7],
            [2,6]
            ]*/

}
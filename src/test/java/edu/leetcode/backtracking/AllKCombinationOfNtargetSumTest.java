package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AllKCombinationOfNtargetSumTest {

    @Test
    public void combinationSum3() {
        List<List<Integer>> res = new AllKCombinationOfNtargetSum().combinationSum3(3, 7);
        System.out.println(res);
        assertThat(res.toString(),is("[[1, 2, 4]]"));
    }


    @Test
    public void combinationSum3_01() {
        List<List<Integer>> res = new AllKCombinationOfNtargetSum().combinationSum3(3, 9);
        System.out.println(res);
        assertThat(res.toString(),is("[[1, 2, 6], [1, 3, 5], [2, 3, 4]]"));
    }


    @Test
    public void combinationSum3_02() {
        List<List<Integer>> res = new AllKCombinationOfNtargetSum().combinationSum3(9, 45);
        System.out.println(res);
        assertThat(res.toString(),is("[[1, 2, 3, 4, 5, 6, 7, 8, 9]]"));
    }

    @Test
    public void combinationSum4() {
        List<List<Integer>> res = new AllKCombinationOfNtargetSum().combinationSum3(2, 4);
        System.out.println(res);
        assertThat(res.toString(),is("[[1, 3]]"));
    }

}
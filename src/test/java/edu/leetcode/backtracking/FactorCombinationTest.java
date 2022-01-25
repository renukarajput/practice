package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactorCombinationTest {

    @Test
    public void getFactors_8() {
        FactorCombination factorCombination=new FactorCombination();
        List<List<Integer>> factors = factorCombination.getFactors(8);
        System.out.println(factors);
        assertThat(factors.toString(),is("[[2, 4], [2, 2, 2]]"));
    }

    @Test
    public void getFactors_37() {
        FactorCombination factorCombination=new FactorCombination();
        List<List<Integer>> factors = factorCombination.getFactors(37);
        assertThat(factors.toString(),is("[]"));
    }


    @Test
    public void getFactors_12() {
        FactorCombination factorCombination=new FactorCombination();
        List<List<Integer>> factors = factorCombination.getFactors(12);
        assertThat(factors.toString(),is("[[2, 6], [2, 2, 3], [3, 4]]"));
    }


    @Test
    public void getFactors_32() {
        FactorCombination factorCombination=new FactorCombination();
        List<List<Integer>> factors = factorCombination.getFactors(32);
        assertThat(factors.toString(),is("[[2, 16], [2, 2, 8], [2, 2, 2, 4], [2, 2, 2, 2, 2], [2, 4, 4], [4, 8]]"));
    }
}
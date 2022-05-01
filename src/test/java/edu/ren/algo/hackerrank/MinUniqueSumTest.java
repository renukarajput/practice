package edu.ren.algo.hackerrank;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MinUniqueSumTest {

    @Test
    public void getMinimumUniqueSum() {
        int sum = MinUniqueSum.getMinimumUniqueSum(Arrays.asList(new Integer[]{1, 2, 2}));
        System.out.println(sum);
    }
    @Test
    public void getMinimumUniqueSum1() {
        int sum = MinUniqueSum.getMinimumUniqueSum(Arrays.asList(new Integer[]{2,2,4,5}));
        System.out.println(sum);
    }
}
package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinStepsToStringsEqualityTest {
MinStepsToStringsEquality minStepsToStringsEquality= getMinStepsToStringsEquality();

    protected MinStepsToStringsEquality getMinStepsToStringsEquality() {
        return new MinStepsToStringsEquality();
    }

    @Test
    public void minDistance() {
       assertThat(minStepsToStringsEquality.minDistance("sea","eat"),is(2));
    }

    @Test
    public void minDistance_01() {
        assertThat(minStepsToStringsEquality.minDistance("leetcode","etco"),is(4));
    }

    @Test
    public void minDistance_02() {
        assertThat(minStepsToStringsEquality.minDistance("","et"),is(2));
    }

    @Test
    public void minDistance_03() {
        assertThat(minStepsToStringsEquality.minDistance("a","b"),is(2));
    }
}
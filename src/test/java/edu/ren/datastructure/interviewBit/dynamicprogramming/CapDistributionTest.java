package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CapDistributionTest {
    CapDistribution capDistribution = new CapDistribution();

    @Test
    public void uniqueWays() {
        int[][] caps = {
                {5, 100, 1},
                {2},
                {5, 100}
        };
        assertThat(capDistribution.uniqueWays(caps), is(4));
    }
}
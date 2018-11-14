package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StairStepsTest {

    StairSteps stairSteps=new StairSteps();
    @Test
    public void getDistinctWaysToTop() {
        assertThat(stairSteps.getDistinctWaysToTop(3),is(3));
    }

    @Test
    public void getIterativeDistinctWays() {
        assertThat(stairSteps.getIterativeDistinctWays(3),is(3));
    }

    @Test
    public void getDistinctWaysToTop1() {
        assertThat(stairSteps.getDistinctWaysToTop(4),is(5));
    }

    @Test
    public void getIterativeDistinctWays1() {
        assertThat(stairSteps.getIterativeDistinctWays(4),is(5));
    }
}
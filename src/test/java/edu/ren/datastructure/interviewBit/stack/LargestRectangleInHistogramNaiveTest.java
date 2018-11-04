package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LargestRectangleInHistogramNaiveTest {
LargestRectangleInHistogramNaive largestRectangleInHistogramNaive =new LargestRectangleInHistogramNaive();
    @Test
    public void getMaxArea() {
        int[] arr={2,1,5,6,2,3};
        assertThat(largestRectangleInHistogramNaive.getMaxArea(arr),is(10));
    }

    @Test
    public void getMaxArea_1() {
        int[] arr={2,2,4,5,2,2};
        assertThat(largestRectangleInHistogramNaive.getMaxArea(arr),is(12));
    }
}
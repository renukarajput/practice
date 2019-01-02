package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class LongestIncreasingSequenceAbstractTest {
LongestIncreasingSequence longestIncreasingSequence= getLongestIncreasingSequence();

    protected abstract LongestIncreasingSequence getLongestIncreasingSequence() ;

    @Test
    public void getLengthOfLIS() {
        int[] arr={10, 22, 9, 33, 21, 50, 41, 60, 80};
        assertThat(longestIncreasingSequence.getLengthOfLIS(arr),is(6));
    }
    @Test
    public void getLengthOfLIS2() {
    int arr[]={0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        assertThat(longestIncreasingSequence.getLengthOfLIS(arr),is(6));
    }

    @Test
    public void getLengthOfLIS_3() {
    int arr[]={0, 8, 4, 6};
        assertThat(longestIncreasingSequence.getLengthOfLIS(arr),is(3));
    }

    @Test
    public void getLengthOfLIS_4() {
    int arr[]={14, 24, 18, 46, 55, 53, 82, 18, 101, 20, 78, 35, 68, 9, 16, 93, 101, 85, 81, 28, 78};
       // System.out.println(new LongestIncreasingSequenceDP().lis(arr));
        assertThat(longestIncreasingSequence.getLengthOfLIS(arr),is(7));
    }
}
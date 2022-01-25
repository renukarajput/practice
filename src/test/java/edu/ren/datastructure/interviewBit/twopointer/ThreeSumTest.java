package edu.ren.datastructure.interviewBit.twopointer;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    public void closestSum() {
        Integer[] arr = {-1, 2, 1, 4};
        assertThat(threeSum.closestSum(arr, 1), is(2));
    }
    @Test
    public void closestSum_1() {
        Integer[] arr = {1,4,4,4,5,5,6};
        assertThat(threeSum.closestSum(arr, 9), is(9));
    }

    @Test
    public void closestSum_2() {
        Integer[] arr = {1,4,5,6};
        assertThat(threeSum.closestSum(arr, 9), is(10));
    }

    @Test
    public void closestSum_3() {
        Integer[] arr = {1,4,5,6,8,12,17,19,23};
        assertThat(threeSum.closestSum(arr, 29), is(29));
    }

    @Test
    public void closestSum_4() {
        Integer[] arr = {1,4,5,6,8,12,17,19,23};
        assertThat(threeSum.closestSum(arr, 24), is(24));
    }
    @Test
    public void closestSum_5() {
        Long i=1l;
        i.hashCode();
        Integer[] arr = {1,4,5,6,8,12,17,19,23};
        assertThat(threeSum.closestSum(arr, 24), is(24));
    }
}
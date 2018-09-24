package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumDistanceOrderedPairTest {

    @Test
    public void maximumDistance() {
        Integer[] arr = {3, 5, 4, 2};
        assertThat(getMaximumDistanceOrderedPair().maximumDistance(Arrays.asList(arr)), is(2));
    }

    protected MaximumDistanceOrderedPair getMaximumDistanceOrderedPair() {
        return new MaximumDistanceOrderedPair();
    }


    @Test
    public void maximumDistance_1() {
        Integer[] arr = {3, 5, 4, 2,1,1,1,6,3,1,1};
        assertThat(getMaximumDistanceOrderedPair().maximumDistance(Arrays.asList(arr)), is(8));
    }

    @Test
    public void maximumDistance_2() {
        Integer[] arr = {13, 5, 16, 2,8};
        assertThat(getMaximumDistanceOrderedPair().maximumDistance(Arrays.asList(arr)), is(3));
    }

    @Test
    public void maximumDistance_3() {
        Integer[] arr = {13, 5, 16, 2,8,-5,6};
        assertThat(getMaximumDistanceOrderedPair().maximumDistance(Arrays.asList(arr)), is(5));
    }

    @Test
    public void maximumDistance_4() {
        Integer[] arr = {-13, 5, 16, 2,8,-5,6};
        assertThat(getMaximumDistanceOrderedPair().maximumDistance(Arrays.asList(arr)), is(6));
    }

    @Test
    public void maximumDistance_5() {
        Integer[] arr = {-1, -1, 2};
        assertThat(getMaximumDistanceOrderedPair().maximumDistance(Arrays.asList(arr)), is(2));
    }

    @Test
    public void maximumDistance_6() {
        Integer[] arr = {2};
        assertThat(getMaximumDistanceOrderedPair().maximumDistance(Arrays.asList(arr)), is(0));
    }
}
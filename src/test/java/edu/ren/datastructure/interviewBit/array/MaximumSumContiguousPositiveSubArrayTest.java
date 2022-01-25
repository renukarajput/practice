package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumSumContiguousPositiveSubArrayTest {

    @Test
    public void maximumContiguousSum_7() {
        Integer[] arr={1,2,-3,4,5,-4,3,2};
        ArrayList<Integer> result = new MaximumSumContiguousPositiveSubArray().maxset(new ArrayList<>(Arrays.asList(arr)));
        ArrayList<Integer> expected=new ArrayList<>(Arrays.asList(new Integer[]{4,5}));
        assertThat(result,is(expected));
    }

    @Test
    public void maximumContiguousSum_8() {
        Integer[] arr={1,2,-3,4,5,6,-4,3,2};
        ArrayList<Integer> result = new  MaximumSumContiguousPositiveSubArray().maxset(new ArrayList<>(Arrays.asList(arr)));
        ArrayList<Integer> expected=new ArrayList<>(Arrays.asList(new Integer[]{4,5,6}));
        assertThat(result,is(expected));
    }

    @Test
    public void maximumContiguousSum_9() {
        Integer[] arr={1967513926, 1540383426, -1303455736, -521595368};
        ArrayList<Integer> result = new MaximumSumContiguousPositiveSubArray().maxset(new ArrayList<>(Arrays.asList(arr)));
        ArrayList<Integer> expected=new ArrayList<>(Arrays.asList(new Integer[]{1967513926, 1540383426}));
        assertThat(result,is(expected));
    }
}
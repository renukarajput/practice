package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaximumUnsortedSubArrayTest {

    @Test
    public void maximumSubArray() {
        Integer [] arr={1,3,2,4,5};
        List<Integer> expected=new ArrayList<>(Arrays.asList(1,2));
        assertThat(getMaximumUnsortedSubArray().maximumSubArray(Arrays.asList(arr)),is(expected));
    }

    @Test
    public void maximumSubArray_1() {
        Integer [] arr={1,3,2,4,5,6,3,8,9};
        List<Integer> expected=new ArrayList<>(Arrays.asList(1,6));
        assertThat(getMaximumUnsortedSubArray().maximumSubArray(Arrays.asList(arr)),is(expected));

    }

    @Test
    public void maximumSubArray_2() {
        Integer [] arr={1,2,3,3,2,1,4,5};
        List<Integer> expected=new ArrayList<>(Arrays.asList(1,5));
        assertThat(getMaximumUnsortedSubArray().maximumSubArray(Arrays.asList(arr)),is(expected));
    }

    @Test
    public void maximumSubArray_3() {
        Integer [] arr={3,2,1};
        List<Integer> expected=new ArrayList<>(Arrays.asList(0,2));
        assertThat(getMaximumUnsortedSubArray().maximumSubArray(Arrays.asList(arr)),is(expected));

    }

    @Test
    public void maximumSubArray_4() {
        Integer [] arr={1,2,3};
        List<Integer> expected=new ArrayList<>(Arrays.asList(-1));
        assertThat(getMaximumUnsortedSubArray().maximumSubArray(Arrays.asList(arr)),is(expected));
    }

    @Test
    public void maximumSubArray_5() {
        Integer [] arr={1,1};
        List<Integer> expected=new ArrayList<>(Arrays.asList(-1));
        assertThat(getMaximumUnsortedSubArray().maximumSubArray(Arrays.asList(arr)),is(expected));
    }

    @Test
    public void maximumSubArray_6() {
        Integer [] arr={1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15};
        List<Integer> expected=new ArrayList<>(Arrays.asList(4,10));
        assertThat(getMaximumUnsortedSubArray().maximumSubArray(Arrays.asList(arr)),is(expected));
    }

    @Test
    public void maximumSubArray_7() {
        Integer [] arr={3, 8, 5, 18, 8, 10, 15, 12, 18, 8, 15};
        List<Integer> expected=new ArrayList<>(Arrays.asList(1,10));
        assertThat(getMaximumUnsortedSubArray().maximumSubArray(Arrays.asList(arr)),is(expected));
    }



    protected MaximumUnsortedSubArray getMaximumUnsortedSubArray() {
        return new MaximumUnsortedSubArray();
    }
}
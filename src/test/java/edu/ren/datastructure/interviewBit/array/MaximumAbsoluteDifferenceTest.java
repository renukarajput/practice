package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumAbsoluteDifferenceTest {

    @Test
    public void maxDiff() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{1,3,-1}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(5));
    }
/*
min in right
prevMax+indexOfMax-indexOfPrevMax>max ==> use prevMax
if max in right
prevMin-min< indexOfMin-indexOfPrevMin ==>use prevMin



 */

    @Test
    public void maxDiff_1() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,3,-2,1,1,1,1,1,1,-1}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(12));
    }

    @Test
    public void maxDiff_2() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,2,2}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(2));
    }

    @Test
    public void maxDiff_3() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,-3,4,-1,6}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(12));
    }

    //

    @Test
    public void maxDiff_4() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{19, 65, 42, 66, -44, 45, -42, 17, -52, -59}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(132));
    }

    //

    @Test
    public void maxDiff_5() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{8, 30, 72, 49, 38, 69, 49, 35, 46, 67}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(68));
    }

    @Test
    public void maxDiff_5_1() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{10,8, 30, 72, 49, 38, 69, 49, 35, 46, 67}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(68));
    }

    @Test
    public void maxDiff_input_sorted_increasing_order() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,5,8,10}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(11));
    }

    @Test
    public void maxDiff_input_sorted_order() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,5,8,10,8,5,2}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(11));
    }

    @Test
    public void maxDiff_input_sorted_decreasing_order() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{10,8,5,2}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(11));
    }

    @Test
    public void maxDiff_input() {
        List<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{5,6,-5,-6,8,-7,20,15}));
        int maxDiff = new MaximumAbsoluteDifference().maxDiff(arr);
        assertThat(maxDiff,is(29));
    }
}
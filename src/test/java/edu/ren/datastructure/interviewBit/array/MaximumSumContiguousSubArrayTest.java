package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSumContiguousSubArrayTest {

    @Test
    public void maximumContiguousSum() {
        int[] arr={-1,-2,-5,8,-2,6};
        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={3,5,12}; //8,-2,6 interval with sum 12
        assertArrayEquals(expected,result);
    }

    @Test
    public void maximumContiguousSum_1() {
        int[] arr={-1,-2,1,2,-5};
        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={2,3,3};
        assertArrayEquals(expected,result);
    }

    @Test
    public void maximumContiguousSum_2() {
        int[] arr={-1,-2,-3,-4,-5};
        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={0,0,-1};
        assertArrayEquals(expected,result);
    }

    @Test
    public void maximumContiguousSum_3() {
        int[] arr={1,2,3,4,5};
        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={0,4,15};
        assertArrayEquals(expected,result);
    }

    @Test
    public void maximumContiguousSum_4() {
        int[] arr={1,2,-3,4,5};
        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={3,4,9};
        assertArrayEquals(expected,result);
    }
}
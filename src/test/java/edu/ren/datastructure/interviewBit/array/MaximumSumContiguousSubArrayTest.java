package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumSumContiguousSubArrayTest {

    @Test
    public void maximumContiguousSum() {
        Integer[] arr1={-1,-2,-5,8,-2,6};
        List<Integer> arr=new ArrayList<>(Arrays.asList(arr1));
        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={3,5,12}; //8,-2,6 interval with sum 12
        assertThat(result,is(expected));
    }

    @Test
    public void maximumContiguousSum_1() {
        Integer[] arr1={-1,-2,1,2,-5};
        List<Integer> arr=new ArrayList<>(Arrays.asList(arr1));
        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={2,3,3};
        assertThat(result,is(expected));
    }

    @Test
    public void maximumContiguousSum_2() {
        Integer[] arr1={-1,-2,-3,-4,-5};
        List<Integer> arr=new ArrayList<>(Arrays.asList(arr1));

        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={0,0,-1};
        assertThat(result,is(expected));
    }

    @Test
    public void maximumContiguousSum_3() {
        Integer[] arr1={1,2,3,4,5};
        List<Integer> arr=new ArrayList<>(Arrays.asList(arr1));

        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={0,4,15};
        assertThat(result,is(expected));
    }

    @Test
    public void maximumContiguousSum_4() {
       Integer[] arr1={1,2,-3,4,5};
        List<Integer> arr=new ArrayList<>(Arrays.asList(arr1));

        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={3,4,9};
        assertThat(result,is(expected));
    }

    @Test
    public void maximumContiguousSum_5() {
       Integer[] arr1={1,2,-3,4,5,-4,3,-1};
        List<Integer> arr=new ArrayList<>(Arrays.asList(arr1));

        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={3,4,9};
        assertThat(result,is(expected));
    }

    @Test
    public void maximumContiguousSum_6() {
       Integer[] arr1={1,2,-3,4,5,-4,3,2};
        List<Integer> arr=new ArrayList<>(Arrays.asList(arr1));

        int[] result = new MaximumSumContiguousSubArray().maximumContiguousSum(arr);
        int [] expected={3,7,10};
        assertThat(result,is(expected));
    }

}
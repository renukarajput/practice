package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LargestNumberTest {

    @Test
    public void sortForLargest() {
        Integer[] arr1={3,30,34,5,9};
        List<Integer> arr = Arrays.asList(arr1);
        new LargestNumber().sortForLargest(arr);
        Integer[] expected={9,5,34,3,30};
        assertThat(arr,is(Arrays.asList(expected)));
    }

    @Test
    public void sortForLargest_1() {
        Integer[] arr1={3,30,50,34,8};
        List<Integer> arr = Arrays.asList(arr1);
        new LargestNumber().sortForLargest(arr);
        Integer[] expected={8,50,34,3,30};
        assertThat(arr,is(Arrays.asList(expected)));
    }

    @Test
    public void sortForLargest_2() {
        Integer[] arr1={3,01,9};
        List<Integer> arr = Arrays.asList(arr1);
        new LargestNumber().sortForLargest(arr);
        Integer[] expected={9,3,01};
        assertThat(arr,is(Arrays.asList(expected)));
    }

    @Test
    public void sortForLargest_3() {
        Integer[] arr1={0,01,1};
        List<Integer> arr = Arrays.asList(arr1);
        new LargestNumber().sortForLargest(arr);
        Integer[] expected={1,01,0};
        assertThat(arr,is(Arrays.asList(expected)));
    }

    @Test
    public void sortForLargest_4() {
        Integer[] arr1={1,2,3};
        List<Integer> arr = Arrays.asList(arr1);
        new LargestNumber().sortForLargest(arr);
        Integer[] expected={3,2,1};
        assertThat(arr,is(Arrays.asList(expected)));
    }

    @Test
    public void sortForLargest_5() {
        Integer[] arr1={1,1,1};
        List<Integer> arr = Arrays.asList(arr1);
        new LargestNumber().sortForLargest(arr);
        Integer[] expected={1,1,1};
        assertThat(arr,is(Arrays.asList(expected)));
    }

    @Test
    public void sortForLargest_6() {
        Integer[] arr1={0,0,0};
        List<Integer> arr = Arrays.asList(arr1);
        String s = new LargestNumber().sortForLargest(arr);
        Integer[] expected={0,0,0};
        assertThat(arr,is(Arrays.asList(expected)));
        assertThat(s,is("0"));
    }

    @Test
    public void sortForLargest_7() {
        Integer[] arr1={903,850,107,50,3};
        List<Integer> arr = Arrays.asList(arr1);
        String s = new LargestNumber().sortForLargest(arr);
        Integer[] expected={903,850,50,3,107};
        assertThat(arr,is(Arrays.asList(expected)));
        assertThat(s,is("903850503107"));
    }
}
package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LongestIncreasingDecSequenceTest {
    LongestIncreasingDecSequence longestIncreasingDecSequence = new LongestIncreasingDecSequence();

    @Test
    public void get() {
        Integer[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
       // int[] res = longestIncreasingDecSequence.getLisFromStart(arr);
        // System.out.println(Arrays.toString(res));
      //  int[] res1 = longestIncreasingDecSequence.getLisFromEnd(arr);
        //   System.out.println(Arrays.toString(res1));
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(5));
    }

    @Test
    public void get_1() {
        Integer[] arr = {10, 6, 15, 18, 21, 30, 41, 60, 80, 55, 35};
        //int[] res = longestIncreasingDecSequence.getLisFromStart(arr);
        // System.out.println(Arrays.toString(res));
       // int[] res1 = longestIncreasingDecSequence.getLisFromEnd(arr);
        //System.out.println(Arrays.toString(res1));
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(10));
    }

    @Test
    public void get_2() {
        Integer[] arr = {1,2,1};
        /*int[] res = longestIncreasingDecSequence.getLisFromStart(arr);
         System.out.println(Arrays.toString(res));
        int[] res1 = longestIncreasingDecSequence.getLisFromEnd(arr);
        System.out.println(Arrays.toString(res1));*/
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(3));
    }

    //1 11 2 10 4 5 2 1
    @Test
    public void get_3() {
        Integer[] arr = {1,11,2,10,4,5,2,1};
       /* int[] res = longestIncreasingDecSequence.getLisFromStart(arr);
        System.out.println(Arrays.toString(res));
        int[] res1 = longestIncreasingDecSequence.getLisFromEnd(arr);
        System.out.println(Arrays.toString(res1));*/
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(6));
    }
    @Test
    public void get_4() {
        Integer[] arr = {};
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(0));
    }

    @Test
    public void get_5() {
        Integer[] arr = {1,2};
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(1));
    }

  @Test
    public void get_05() {
        Integer[] arr = {1,2,3,4,5};
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(5));
    }

    @Test
    public void get_06() {
        Integer[] arr = {9, 6, 1, 10, 2, 5, 12, 30, 31, 20, 22, 18};
        assertThat(longestIncreasingDecSequence.lbs(Arrays.asList(arr)), is(8));
      //  assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(8));
    }  @Test
    public void get_060() {
        Integer[] arr = {9, 6, 1, 10, 2, 5, 12, 30, 31, 20, 22, 18};
       // assertThat(longestIncreasingDecSequence.lbs(Arrays.asList(arr)), is(8));
       assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(8));
    }

    //9, 6, 1, 10, 2, 5, 12, 30, 31, 20, 22, 18

    @Test
    public void get_6() {
        Integer[] arr = {12, 11, 40, 5, 3, 1};
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(5));
    }

    @Test
    public void get_7() {
        Integer[] arr = {80, 60, 30, 40, 20, 10};
        assertThat(longestIncreasingDecSequence.getMaxIncreasingDecreasingSeqLength(arr), is(5));
    }
}
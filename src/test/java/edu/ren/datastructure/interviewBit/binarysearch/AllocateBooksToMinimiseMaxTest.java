package edu.ren.datastructure.interviewBit.binarysearch;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AllocateBooksToMinimiseMaxTest {
    AllocateBooksToMinimiseMax booksToMinimiseMax=new AllocateBooksToMinimiseMax();

    @Test
    public void maxAllocation() {
        Integer[] arr={12, 34, 67, 90};
       assertThat(booksToMinimiseMax.maxAllocation(Arrays.asList(arr),2),is(113));
    }

    @Test
    public void maxAllocation_1() {
        Integer[] arr={5,4,9,6,3,2,7,1};
        assertThat(booksToMinimiseMax.maxAllocation(Arrays.asList(arr),3),is(15));
    }

    @Test
    public void maxAllocation_2() {
        Integer[] arr={5,4,9,6,3,2,7,1};
        assertThat(booksToMinimiseMax.maxAllocation(Arrays.asList(arr),arr.length),is(9));
    }
    @Test
    public void maxAllocation_2_3() {
        Integer[] arr={73, 58, 30, 72, 44, 78, 23, 9};
        assertThat(booksToMinimiseMax.maxAllocation(Arrays.asList(arr),5),is(110));
    }


    @Test
    public void maxAllocation_3() {
        Integer[] arr={15,14,8,19,5,16,13,4,12,17,2,11,3,1};
        assertThat(booksToMinimiseMax.maxAllocation(Arrays.asList(arr),3),is(46));
    }

    @Test
    public void maxAllocation_invalid() {
        Integer[] arr={5,4,9,6,3,2,7,1};
        assertThat(booksToMinimiseMax.maxAllocation(Arrays.asList(arr),10),is(-1));
    }
}
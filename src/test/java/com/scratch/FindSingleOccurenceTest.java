package com.scratch;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindSingleOccurenceTest {
FindSingleOccurence findSingleOccurence=new FindSingleOccurence();
    @Test
    public void getSingleNumber() {
        int[] arr={1,1,2,2,3};
        assertThat(findSingleOccurence.getSingleNumber(arr),is(3));
    }

    @Test
    public void getSingleNumber_no_num() {
        int[] arr={1,1,2,2,3,3};
        assertThat(findSingleOccurence.getSingleNumber(arr),is(-1));
    }
    @Test
    public void getSingleNumber_single() {
        int[] arr={1};
        assertThat(findSingleOccurence.getSingleNumber(arr),is(1));
    }

    @Test
    public void getSingleNumber_1() {
        int[] arr={1,1,2,2,3,3,5,6,6,7,7};
        assertThat(findSingleOccurence.getSingleNumber(arr),is(5));
    }
    @Test
    public void getSingleNumber_2() {
        int[] arr={1,1,2,3,3,5,5,6,6,7,7};
        assertThat(findSingleOccurence.getSingleNumber(arr),is(2));
    }
}
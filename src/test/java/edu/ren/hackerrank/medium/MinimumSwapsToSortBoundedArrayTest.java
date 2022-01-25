package edu.ren.hackerrank.medium;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinimumSwapsToSortBoundedArrayTest {
    MinimumSwapsToSortBoundedArray minimumSwapsToSortBoundedArray=new MinimumSwapsToSortBoundedArray();

    @Test
    public void minSwap() {
        int [] arr={7,1,3,2,4,5,6};
        assertThat(minimumSwapsToSortBoundedArray.getSwaps(arr),is(5));
    }

    @Test
    public void minSwap_1() {
        int [] arr={4,3,1,2};
        assertThat(minimumSwapsToSortBoundedArray.getSwaps(arr),is(3));
    }
}
package com.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class KthLargestInArrayTest {
    KthLargestInArray obj = new KthLargestInArray();

    @Test
    public void findKthLargest() {
        assertThat(obj.findKthLargest(new int[]{3,2,1,5,6,4}, 2), is(5));
        assertThat(obj.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4), is(4));
    }
}
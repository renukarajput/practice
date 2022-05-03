package com.leetcode.blind75.heap;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TopKFrequentElementsTest {
    TopKFrequentElements obj = new TopKFrequentElements();

    @Test
    public void topKFrequent() {
        assertThat(obj.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2), is(new int[]{1, 2}));
    }

    @Test
    public void topKFrequent_1() {
        assertThat(obj.topKFrequent(new int[]{1}, 1), is(new int[]{1}));
    }

    @Test
    public void topKFrequent_2() {
        assertThat(obj.topKFrequent(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5, 5}, 3), is(new int[]{5,1,2}));
    }

    @Test
    public void topKFrequent_3() {
        assertThat(obj.topKFrequent(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5, 5}, 2), is(new int[]{5,2}));
    }
}
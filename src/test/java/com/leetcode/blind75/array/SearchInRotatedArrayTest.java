package com.leetcode.blind75.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SearchInRotatedArrayTest {
    SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
    @Test
    public void search() {
        assertThat(obj.search(new int[]{4,5,6,7,0,1,2}, 0),is(4));
        assertThat(obj.search(new int[]{4,5,6,7,0,1,2}, 8),is(-1));
        assertThat(obj.search(new int[]{10, 14, 16, 17, 18, 5, 7}, 14),is(1));
    }
}
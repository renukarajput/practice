package edu.leetcode.search;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RangeSearchTest {
RangeSearch rangeSearch=new RangeSearch();
    @Test
    public void searchRange() {
     assertThat(rangeSearch.searchRange(new int[]{5,7,7,8,8,10},8),is(new int[]{3,4}));
    }

    @Test
    public void searchRange_01() {
        assertThat(rangeSearch.searchRange(new int[]{1,2,3,3,3,3,4,5,9},3),is(new int[]{2,5}));
    }
    @Test
    public void searchRange_02() {
        assertThat(rangeSearch.searchRange(new int[]{0,0,0,0,0,1,1,2,2,3,4,4,5,5,5,5,6,7},0),is(new int[]{0,4}));
    }


}


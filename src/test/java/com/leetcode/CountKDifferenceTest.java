package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class CountKDifferenceTest extends TestCase {
    CountKDifference countKDifference = new CountKDifference();

    @Test
    public void testCount() {
//        assertEquals(countKDifference.count(new int[]{3, 2, 1, 5, 4}, 1), 2);
        assertEquals(countKDifference.findNumber(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}), 6);
        assertEquals(countKDifference.findNumber(new int[]{1, 1}), 1);

    }

    @Test
    public void find_num_01() {
        assertEquals(countKDifference.findNumber(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}), 6);

    }

}

// 1 1 2 2  k = 1
// 3 2 1 4 k=2  1 2 3 4 =

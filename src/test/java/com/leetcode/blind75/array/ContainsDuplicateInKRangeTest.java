package com.leetcode.blind75.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ContainsDuplicateInKRangeTest {
    ContainsDuplicateInKRange obj = new ContainsDuplicateInKRange();

    @Test
    public void containsNearbyDuplicateIsTrue() {
        assertTrue(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(obj.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertTrue(obj.containsNearbyDuplicate(new int[]{1, 2, 1, 2, 3, 3}, 2));

    }

    @Test
    public void containsNearbyDuplicateIsFalse() {
        assertFalse(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        assertFalse(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5}, 4));
    }
}
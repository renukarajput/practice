package edu.ren.misc.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateElmCheckTest {
    DuplicateElmCheck duplicateElmCheck = new DuplicateElmCheck();

    @Test
    public void input_1() {
        int[] arr = {1, 2, 3, 1};
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicate(arr, 3));
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicateUsingMap(arr, 3));

    }

    @Test
    public void input_2() {
        int[] arr = {1, 0, 1, 1};
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicate(arr, 1));
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicateUsingMap(arr, 1));
    }

    @Test
    public void input_3() {
        int[] arr = {1, 2, 3, 1, 2, 3};
        assertEquals(false, duplicateElmCheck.containsNearbyDuplicate(arr, 2));
        assertEquals(false, duplicateElmCheck.containsNearbyDuplicateUsingMap(arr, 2));
    }

    @Test
    public void input_4() {
        int[] arr = {1, 1, 2, 3, 4, 6};
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicate(arr, 2));
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicateUsingMap(arr, 2));
    }

    @Test
    public void input_5() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9};
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicate(arr, 2));
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicateUsingMap(arr, 2));
    }

    @Test
    public void input_6() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(false, duplicateElmCheck.containsNearbyDuplicate(arr, 5));
        assertEquals(false, duplicateElmCheck.containsNearbyDuplicateUsingMap(arr, 5));
    }

    @Test
    public void input_7() {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicate(arr, 3));
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicateUsingMap(arr, 3));
    }

    @Test
    public void input_8() {
        int[] arr = {1,1};
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicateUsingMap(arr, 2));
        assertEquals(true, duplicateElmCheck.containsNearbyDuplicate(arr, 2));
    }
}
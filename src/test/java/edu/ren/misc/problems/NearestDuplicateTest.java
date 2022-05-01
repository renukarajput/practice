package edu.ren.misc.problems;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NearestDuplicateTest {
    NearestDuplicate nearestDuplicate = new NearestDuplicate();

    @Test
    public void input_0() {
        int[] arr = {5, 3, 2, 8, 6, 5, 8, 3};
        int minDist = nearestDuplicate.getMinimumDistance(arr);
        assertEquals(minDist, 3);
    }
    @Test
    public void input_1() {
        int[] arr = {5, 3, 2, 8, 6, 5, 8, 3};
        int minDist = nearestDuplicate.getMinimumDistanceOptimized(arr);
        assertEquals(minDist, 3);
    }

    @Test
    public void input_2() {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int minDist = nearestDuplicate.getMinimumDistanceOptimized(arr);
        assertEquals(minDist, 2);
    }

    @Test
    public void input_3() {
        int[] arr = {5, 5, 2, 8, 6, 5, 8, 3};
        int minDist = nearestDuplicate.getMinimumDistanceOptimized(arr);
        assertEquals(minDist, 1);
    }

    @Test
    public void input_4() {
        int[] arr = {5, 3, 5, 1, 2, 3, 4, 5};
        int minDist = nearestDuplicate.getMinimumDistanceOptimized(arr);
        assertEquals(minDist, 2);
    }

    @Test
    public void input_5() {
        int[] arr = {5, 3, 2, 8, 6, 5, 8, 3};
        int minDist = nearestDuplicate.getMinimumDistanceOptimized(arr);
        assertEquals(minDist, 3);
    }

    @Test
    public void input_6() {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0, 1};
        int minDist = nearestDuplicate.getMinimumDistanceOptimized(arr);
        assertEquals(minDist, 2);
    }
}
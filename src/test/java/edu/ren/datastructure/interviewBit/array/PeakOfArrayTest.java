package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;

public class PeakOfArrayTest {

    @Test
    public void peak() {
        int[] arr={10, 20, 15, 2, 23, 90, 67};
        int peak = new PeakOfArray().peak(arr);
        List<Integer> expectedPeaks= Arrays.asList(90,20);
        assertThat(expectedPeaks,hasItem(peak));
    }

    @Test
    public void peak_1() {
        int[] arr={4,5,1, 2, 3};
        int peak = new PeakOfArray().peak(arr);
        List<Integer> expectedPeaks= Arrays.asList(5,3);
        assertThat(expectedPeaks,hasItem(peak));
    }
    @Test
    public void peak_2() {
        int[] arr={1,2,3, 4, 5};
        int peak = new PeakOfArray().peak(arr);
        List<Integer> expectedPeaks= Arrays.asList(5,3);
        assertThat(expectedPeaks,hasItem(peak));
    }
}
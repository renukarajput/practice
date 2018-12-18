package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PossiblePairsForKTest {
    PossiblePairsForK possiblePair = new PossiblePairsForK();

    @Test
    public void input_1() {
        int[] arr = {6, -3, -10, 0, 2};
        int output = possiblePair.getPairForKSum(arr, 8);
        assertThat(output, is(1));
    }

    @Test
    public void input_2() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int output = possiblePair.getPairForKSum(arr, 7);
        assertThat(output, is(3));
    }

    @Test
    public void input_4() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int output = possiblePair.getPairForKSum(arr, 9);
        assertThat(output, is(3));
    }

    @Test
    public void input_5() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int output = new PossiblePairForKUsingBinarySearch().noOfPairForKSum(arr, 9);
        assertThat(output, is(3));
    }

    @Test
    public void input_6() {
        int[] arr = {1, 2, 4, 6, 1, 7, 8, 2, 4, 5, 4, 3, 7, 8};
        int output = new PossiblePairForKUsingBinarySearch().noOfPairForKSum(arr, 9);
        assertThat(output, is(4));
    }
}
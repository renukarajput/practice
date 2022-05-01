package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;

import static edu.ren.datastructure.interviewBit.array.MaximumConsecutiveGapTest.listOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PermutationMatchingInstructionTest {

    @Test
    public void permutation() {
        ArrayList<Integer> arr = new HigherPermutationMatchingInstruction().permutation(3, "ID".toCharArray());
        Integer[] expected={1,3,2};
        assertThat(arr,is(listOf(expected)));
    }

    @Test
    public void permutation_1() {
        ArrayList<Integer> arr = new HigherPermutationMatchingInstruction().permutation(3, "DD".toCharArray());
        Integer[] expected={3,2,1};
        assertThat(arr,is(listOf(expected)));
    }

    @Test
    public void permutation_2() {
        ArrayList<Integer> arr = new HigherPermutationMatchingInstruction().permutation(7, "IDDIDD".toCharArray());
        Integer[] expected={1,4,3,2,7,6,5};
        assertThat(arr,is(listOf(expected)));
    }

    @Test
    public void permutation_3() {
        ArrayList<Integer> arr = new HigherPermutationMatchingInstruction().permutation(4, "DDD".toCharArray());
        Integer[] expected={4,3,2,1};
        assertThat(arr,is(listOf(expected)));
    }

    @Test
    public void permutation_4() {
        ArrayList<Integer> arr = new HigherPermutationMatchingInstruction().permutation(4, "DDI".toCharArray());
        Integer[] expected={3,2,1,4};
        assertThat(arr,is(listOf(expected)));
    }
}
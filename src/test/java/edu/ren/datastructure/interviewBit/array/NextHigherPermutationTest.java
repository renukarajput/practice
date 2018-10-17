package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;

import static edu.ren.datastructure.interviewBit.array.MaximumConsecutiveGapTest.listOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NextHigherPermutationTest {

    protected void assertPermutation(Integer[] arr, Integer[] expectedArr) {
        ArrayList<Integer> arr1 = listOf(arr);
        new NextHigherPermutation().nextPermutation(arr1);
        assertThat(arr1,is(listOf(expectedArr)));
    }
    @Test
    public void nextPermutation() {
        Integer [] arr={1,3,4,2};
        Integer [] expectedArr={1,4,3,2};
        assertPermutation(arr, expectedArr);
    }

    @Test
    public void nextPermutation_1() {
        Integer [] arr={1,3,5,2,4};
        Integer [] expectedArr={1,3,5,4,2};
        assertPermutation(arr, expectedArr);
    }

    @Test
    public void nextPermutation_2() {
        Integer [] arr={1,2,3,4,5};
        Integer [] expectedArr={1,2,3,5,4};
        assertPermutation(arr, expectedArr);

    }

    @Test
    public void nextPermutation_002() {
        Integer [] arr={7,5,1,8};
        Integer [] expectedArr={7,5,8,1};
        assertPermutation(arr, expectedArr);

    }

    @Test
    public void nextPermutation_003() {
        Integer [] arr={701,319,695,52};
        Integer [] expectedArr={701,695,319,52};
        assertPermutation(arr, expectedArr);

    }


@Test
    public void nextPermutation_0012() {
        Integer [] arr={5,4,1,17,16,14};
        Integer [] expectedArr={5,4,14,1,16,17};
        assertPermutation(arr, expectedArr);

    }

    @Test
    public void nextPermutation_0013() {
        Integer [] arr={5,4,29,47,36,24};
        Integer [] expectedArr={5,4,36,24,29,47};
        assertPermutation(arr, expectedArr);

    }
    @Test
    public void nextPermutation_02() {
        Integer [] arr={5,1,3,7,8,4};
        Integer [] expectedArr={5,1,4,3,7,8};
        assertPermutation(arr, expectedArr);

    }

    @Test
    public void nextPermutation_3() {
        Integer [] arr={5,4,3,2,1};
        Integer [] expectedArr={1,2,3,4,5};
        assertPermutation(arr, expectedArr);

    }

    @Test
    public void nextPermutation_4() {
        Integer [] arr={1,1,5};
        Integer [] expectedArr={1,5,1};
        assertPermutation(arr, expectedArr);

    }
}
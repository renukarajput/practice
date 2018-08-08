package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 8/8/18.
 */
public class ArrayProblemsTest {

    // adding 1 To Unit Digit
    @Test
    public void input1() {
        int[] array = {1, 2, 3};
        int[] expectedOutput = {1, 2, 4};
        new ArrayProblems().addOneToUnitDigitInArray(array);
        assertThat(array, is(expectedOutput));
    }

    @Test
    public void input2() {
        int[] array = {1, 2};
        int[] expectedOutput = {1, 3};
        new ArrayProblems().addOneToUnitDigitInArray(array);

        assertThat(array, is(expectedOutput));

    }

    @Test
    public void inputWithZeroPrefixDoesNotHaveZeroPrefixInOutput() {
        int[] array = {0,1, 2};
        int[] expectedOutput = {1, 3};
        new ArrayProblems().addOneToUnitDigitInArray(array);

        assertThat(array, is(expectedOutput));

    }

    @Test
    public void input3() {
        int[] array = {1, 2, 3, 4};
        int[] expectedOutput = {1, 2, 3, 5};
        new ArrayProblems().addOneToUnitDigitInArray(array);

        assertThat(array, is(expectedOutput));

    }

    @Test
    public void inputWithBorrowOfTwoDigitsEndingInSingleNine() {
        int[] expectedOutput = {1, 9};
        int[] array = {2,0};
        new ArrayProblems().addOneToUnitDigitInArray(array);
        assertThat(array, is(expectedOutput));
    }

    @Test
    public void inputWithBorrowOfTwoDigitsEndingInDoubleNineWithZeroPrefix() {
        int[] expectedOutput = {0,9, 9};
        int[] array = {1,0,0};
        new ArrayProblems().addOneToUnitDigitInArray(array);
        assertThat(array, is(expectedOutput));
    }

    @Test
    public void inputWithBorrowOfTwoDigitsEndingInDoubleNine() {
        int[] expectedOutput = {9, 9};
        int[] array = {1,0,0};
        new ArrayProblems().addOneToUnitDigitInArray(array);
        assertThat(array, is(expectedOutput));
    }


    @Test
    public void inputWithBorrow() {
        int[] expectedOutput = {1, 2, 4, 0};
        int[] array = {1, 2, 3, 9};
        new ArrayProblems().addOneToUnitDigitInArray(array);
        assertThat(array, is(expectedOutput));
    }

    @Test
    public void input4() {
        int[] array = {1};
        int[] expectedOutput = {2};

        new ArrayProblems().addOneToUnitDigitInArray(array);
        assertThat(array, is(expectedOutput));
    }


    // Finding duplicate in an array
    @Test
    public void input5() {
        int[] input = {1, 2, 3, 1};
        assertThat(new ArrayProblems().findDuplicateInArray(input), is(1));
    }

    @Test
    public void input6() {
        int[] input = {1, 2, 3, 4};
        assertThat(new ArrayProblems().findDuplicateInArray(input), is(-1));
    }

    @Test
    public void input7() {
        int[] input = {3, 4, 1, 4, 1};
        assertThat(new ArrayProblems().findDuplicateInArray(input), is(4));
    }

    @Test
    public void input8() {
        int[] input = {0};
        assertThat(new ArrayProblems().findDuplicateInArray(input), is(-1));
    }
}
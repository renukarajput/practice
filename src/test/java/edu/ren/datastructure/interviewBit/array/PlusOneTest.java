package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 8/8/18.
 */
public class PlusOneTest {

    // adding 1 To Unit Digit
    @Test
    public void inputWithThreeDigits() {
        int[] array = {1, 2, 3};
        int[] expectedOutput = {1, 2, 4};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);
        assertThat(output, is(expectedOutput));
    }

    @Test
    public void inputWithTwoDigits() {
        int[] array = {1, 2};
        int[] expectedOutput = {1, 3};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);
        assertThat(output, is(expectedOutput));

    }

    @Test
    public void inputWithDigits() {
        int[] array = {1, 2, 3, 4};
        int[] expectedOutput = {1, 2, 3, 5};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);
        assertThat(output, is(expectedOutput));

    }

    @Test
    public void inputWithBorrowOfTwoDigitsEndingInSingleNine() {
        int[] array = {1, 9};
        int[] expectedOutput = {2, 0};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);
        assertThat(output, is(expectedOutput));
    }

    @Test
    public void inputWithBorrowOfTwoDigitsEndingInDoubleNineWithZeroPrefix() {
        int[] array = {0, 9, 9};
        int[] expectedOutput = {1, 0, 0};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);
        assertThat(output, is(expectedOutput));
    }

    @Test
    public void inputWithBorrowOfTwoDigitsEndingInDoubleZeroWithOnePrefix() {
        int[] array = {1, 0, 0};
        int[] expectedOutput = {1, 0, 1};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);
        assertThat(output, is(expectedOutput));
    }

    @Test
    public void inputWithBorrowOfTwoDigitsEndingInDoubleNine() {
        int[] array = {9, 9};
        int[] expectedOutput = {1,0,0};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);  // {1,0,0}
        assertThat(output, is(expectedOutput));
    }

    @Test
    public void inputWithZeroPrefixDoesNotHaveZeroPrefixInOutput() {
        int[] array = {0, 1, 2};
        int[] expectedOutput = {1, 3};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);

        assertThat(output, is(expectedOutput));
    }

    @Test
    public void inputWithZeroPrefix() {
        int[] array = {0, 0, 1, 2};
        int[] expectedOutput = {1, 3};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);

        assertThat(output, is(expectedOutput));
    }

    @Test
    public void inputWithBorrow() {
        int[] array = {1, 2, 3, 9};
        int[] expectedOutput = {1, 2, 4, 0};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);
        assertThat(output, is(expectedOutput));
    }

    @Test
    public void inputWithSingleDigit() {
        int[] array = {1};
        int[] expectedOutput = {2};
        int[] output = new PlusOne().addOneToUnitDigitInArray(array);
        assertThat(output, is(expectedOutput));
    }

    private ArrayList<Integer> convertArrayToList(Integer[] inputArray){
        ArrayList<Integer> input = new ArrayList<>();
        input.addAll(Arrays.asList(inputArray));
        return input;
    }

    @Test
    public void inputWithSingleDigit1() {
        Integer[] array = {1, 2, 3, 9};
        ArrayList<Integer> input = convertArrayToList(array);
        assertThat(new PlusOne().plusOne(input), contains(1,2,4,0));
    }

    @Test
    public void inputWithTwoDigitsWithNine() {
        Integer[] array = {9,9};
        ArrayList<Integer> input = convertArrayToList(array);
        assertThat(new PlusOne().plusOne(input), contains(1,0,0));
    }

    @Test
    public void inputWithTwoZeroAsPrefix() {
        Integer[] array = {0,0,1,2};
        ArrayList<Integer> input = convertArrayToList(array);
        assertThat(new PlusOne().plusOne(input), contains(1,3));
    }

/*    // Finding duplicate in an array
    @Test
    public void input5() {
        int[] input = {1, 2, 3, 1};
        assertThat(new PlusOne().findDuplicateInArray(input), is(1));
    }

    @Test
    public void input6() {
        int[] input = {1, 2, 3, 4};
        assertThat(new PlusOne().findDuplicateInArray(input), is(-1));
    }

    @Test
    public void input7() {
        int[] input = {3, 4, 1, 4, 1};
        assertThat(new PlusOne().findDuplicateInArray(input), is(4));
    }

    @Test
    public void input8() {
        int[] input = {0};
        assertThat(new PlusOne().findDuplicateInArray(input), is(-1));
    }*/
}
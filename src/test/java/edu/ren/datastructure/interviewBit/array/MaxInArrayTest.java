package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 8/31/18.
 */
public class MaxInArrayTest {

    @Test
    public void inputWithRandomOrder() {
        int[] inputArr = {5, 4, 1, 2, 3, 6};
        int output = new MaxInArray().findMaximumElement(inputArr);
        assertThat(output, is(6));
    }

    @Test
    public void inputSize1() {
        int[] inputArr = {5};
        int output = new MaxInArray().findMaximumElement(inputArr);
        assertThat(output, is(5));
    }

    @Test
    public void inputWithAscendingOrder() {
        int[] inputArr = {1, 2, 3, 4, 5, 6};
        int output = new MaxInArray().findMaximumElement(inputArr);
        assertThat(output, is(6));
    }

    @Test
    public void inputWithDescendingOrder() {
        int[] inputArr = {7, 5, 4, 3, 2, 1};
        int output = new MaxInArray().findMaximumElement(inputArr);
        assertThat(output, is(7));
    }

    @Test
    public void printArrayUsingRecursion() {
        int[] inputArr = {7, 5, 4, 3, 2, 1};
        new MaxInArray().printArrayUsingRecursion(inputArr);
    }

    @Test
    public void sumOfArray() {
        int[] inputArr = {5, 4, 3, 2, 1};
        int output = new MaxInArray().sumOfArray(inputArr);
        assertThat(output, is(15));
    }

    @Test
    public void sumOfArrayInput1() {
        int[] inputArr = {5, 4, 3, 2, 1, 6};
        int output = new MaxInArray().sumOfArray(inputArr);
        assertThat(output, is(21));
    }

}
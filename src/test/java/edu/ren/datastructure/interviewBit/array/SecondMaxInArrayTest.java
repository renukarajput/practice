package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 8/31/18.
 */
public class SecondMaxInArrayTest {

    @Test
    public void findSecondMaxElementInputWithDescendingOrder_rec(){
        int[] inputArr = {10, 7, 5, 8, 4, 3, 2, 9, 1};
        int output = new SecondMaxInArray().findSecondMaxUsingRecursion(inputArr);
        assertThat(output, is(9));
        assertThat(new SecondMaxInArray().testt(inputArr), is(9));
    }

    @Test
    public void findSecondMaxInputWithAscendingOrder_rec(){
        int[] inputArr = {1, 2, 3, 4, 5, 6};
        int output = new SecondMaxInArray().findSecondMaxUsingRecursion(inputArr);
        assertThat(output, is(5));
    }

    @Test
    public void findSecondMaxForDuplicateValues_rec(){
        int[] inputArr = {5,5,5};
        int output = new SecondMaxInArray().findSecondMaxUsingRecursion(inputArr);
        assertThat(output, is(5));
    }

    @Test
    public void findSecondMaxFor_rec(){
        int[] inputArr = {5,4,5};
        int output = new SecondMaxInArray().findSecondMaxUsingRecursion(inputArr);
        assertThat(output, is(4));
    }

    @Test
    public void findSecondMaxUsingRecursion_rec(){
        int[] inputArr = {5, 4, 5, 3};
        int output = new SecondMaxInArray().findSecondMaxUsingRecursion(inputArr);
        assertThat(output, is(4));
    }

    @Test
    public void findSecondMaxForTwoVals_rec(){
        int[] inputArr = {1,2};
        int output = new SecondMaxInArray().findSecondMaxUsingRecursion(inputArr);
        assertThat(output, is(1));
    }

    @Test
    public void findSecondMaxInputWith_rec(){
        int[] inputArr = {6,4};
        int output = new SecondMaxInArray().findSecondMaxUsingRecursion(inputArr);
        assertThat(output, is(4));
    }

    @Test
    public void secondMaxInputWithRandomOrder_rec(){
        int[] inputArr = {5, 4, 1, 2, 3, 6, 10, 7};
        int output = new SecondMaxInArray().findSecondMaxUsingRecursion(inputArr);
        assertThat(output, is(7));
    }

    @Test
    public void findSecondMaxElementInputWithDescendingOrder() {
        int[] inputArr = {10, 7, 5, 8, 4, 3, 2, 1};
        int output = new SecondMaxInArray().findSecondMax(inputArr);
        assertThat(output, is(8));
    }

    @Test
    public void findSecondMaxInputWithAscendingOrder() {
        int[] inputArr = {1, 2, 3, 4, 5, 6};
        int output = new SecondMaxInArray().findSecondMax(inputArr);
        assertThat(output, is(5));
    }

    @Test
    public void findSecondMaxForDuplicateValues() {
        int[] inputArr = {5,5,5};
        int output = new SecondMaxInArray().findSecondMax(inputArr);
        assertThat(output, is(5));
    }

    @Test
    public void findSecondMaxFor() {
        int[] inputArr = {5,4,5};
        int output = new SecondMaxInArray().findSecondMax(inputArr);
        assertThat(output, is(4));
    }

    @Test
    public void findSecondMax() {
        int[] inputArr = {5, 4, 5, 3};
        int output = new SecondMaxInArray().findSecondMax(inputArr);
        assertThat(output, is(4));
    }

    @Test
    public void findSecondMaxForTwoVals() {
        int[] inputArr = {1,2};
        int output = new SecondMaxInArray().findSecondMax(inputArr);
        assertThat(output, is(1));
    }

    @Test
    public void findSecondMaxInputWith() {
        int[] inputArr = {6,4};
        int output = new SecondMaxInArray().findSecondMax(inputArr);
        assertThat(output, is(4));
    }

    @Test
    public void secondMaxInputWithRandomOrder() {
        int[] inputArr = {5, 4, 1, 2, 3, 6, 10, 7};
        int output = new SecondMaxInArray().findSecondMax(inputArr);
        assertThat(output, is(7));
    }

}
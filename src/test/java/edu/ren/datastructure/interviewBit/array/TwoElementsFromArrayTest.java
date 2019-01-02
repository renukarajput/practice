package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 9/18/18.
 */
public class TwoElementsFromArrayTest {

    @Test
    public void input1() {
        int[] inputArr = {8, 4, 1, 2, 6, 5, 7};
        int sum = 10;
        int[] actual = {8, 2};
        int[] output = new TwoElementsFromArray().findTwoElementsWithSum(inputArr, sum);
        assertThat(actual, is(output));
    }

    @Test
    public void inputForSetImpl1() {
        int[] inputArr = {8, 4, 1, 2, 6, 5, 7};
        int sum = 10;
        int[] actual = {2, 8};
        int[] expected = new TwoElementsFromArray().findTwoElementsWithSumUsingSet(inputArr, sum);
        assertThat(actual, is(expected));
    }

    @Test
    public void input2() {
        String str = "renuka";
        str.concat("rajput").concat("pune").concat("");
        StringBuilder sb = new StringBuilder();
        StringBuilder sss = sb.append("ren").append("uka").append("rajput");
        System.out.println("sss== "+sss);
        System.out.println("sss== "+sss.toString());

        int[] inputArr = {5, 4, 1, 2, 3, 6};
        int sum = 7;
        int[] output = new TwoElementsFromArray().findTwoElementsWithSum(inputArr, sum);
        int[] actual = {5, 2};
        assertThat(actual, is(output));
    }

    @Test
    public void inputForSetImpl2() {
        int[] inputArr = {5, 4, 1, 2, 3, 6};
        int sum = 10;
        int[] actual = {6, 4};
        int[] expected = new TwoElementsFromArray().findTwoElementsWithSumUsingSet(inputArr, sum);
        assertThat(actual, is(expected));
    }

}
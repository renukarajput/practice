package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rrn3194 on 9/11/18.
 */
abstract public class ArraySorterTest {

    protected abstract ArraySorter getSorter();

    @Test
    public void input1() {
        int[] inputArr = {1, 5, 4, 3, 2, 6};
        getSorter().sortArray(inputArr);

        assertThat(Arrays.toString(inputArr), is("[1, 2, 3, 4, 5, 6]"));
    }

    @Test
    public void input2() {
        int[] inputArr = {7, 8, 5, 2, 4, 6, 3};
        getSorter().sortArray(inputArr);

        assertThat(Arrays.toString(inputArr), is("[2, 3, 4, 5, 6, 7, 8]"));
    }

    @Test
    public void input3() {
        int[] inputArr = {5, 1, 4, 2, 8};
        getSorter().sortArray(inputArr);

        assertThat(Arrays.toString(inputArr), is("[1, 2, 4, 5, 8]"));
    }
}

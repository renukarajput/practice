package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 9/9/18.
 */
public class InsertionSortTest extends ArraySorterTest {

    @Override
    protected ArraySorter getSorter() {
        return new InsertionSort();
    }

    @Test
    public void insertionSortInput() {
        int[] inputArr = {7, 8, 5, 2, 4, 6, 3};
        new InsertionSort().sortArrayNaive(inputArr);

        assertThat(Arrays.toString(inputArr), is("[2, 3, 4, 5, 6, 7, 8]"));
    }

    @Test
    public void insertionSortInput1() {
        int[] inputArr = {2,1,1};
        new InsertionSort().sortArrayNaive(inputArr);

        assertThat(Arrays.toString(inputArr), is("[1, 1, 2]"));
    }

}
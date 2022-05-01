package edu.ren.geeks.sorting;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class InsertionSortTest {
    InsertionSort insertionSort = new InsertionSort();

    @Test
    public void input_1() {
        int[] actual = insertionSort.sortArray(new int[]{6, 5, 3, 2, 8, 10, 9});
        int[] expected = {2, 3, 5, 6, 8, 9, 10};
        assertThat(actual, is(expected));
    }
    @Test
    public void input_2() {
        int[] input = {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
        int[] actual = insertionSort.sortArray(input);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(actual, is(expected));
    }
}
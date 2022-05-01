package edu.ren.geeks.searching;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SearchInRowColSortedMatrixTest {
    SearchInRowColSortedMatrix searchInRowColSortedMatrix = new SearchInRowColSortedMatrix();

    @Test
    public void search() {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        assertThat(searchInRowColSortedMatrix.search(matrix, 27), is(new int[]{2, 0}));;
        assertThat(searchInRowColSortedMatrix.search(matrix, 37), is(new int[]{2, 2}));;
        assertThat(searchInRowColSortedMatrix.search(matrix, 39), is(new int[]{3, 2}));;
        assertThat(searchInRowColSortedMatrix.search(matrix, 35), is(new int[]{1, 2}));;
        assertThat(searchInRowColSortedMatrix.search(matrix, 10), is(new int[]{0, 0}));;
        assertThat(searchInRowColSortedMatrix.search(matrix, 45), is(new int[]{1, 3}));;
    }
}
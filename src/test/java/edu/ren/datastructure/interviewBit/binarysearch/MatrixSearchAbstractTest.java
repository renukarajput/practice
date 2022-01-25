package edu.ren.datastructure.interviewBit.binarysearch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public abstract class MatrixSearchAbstractTest {
    MatrixSearch matrixSearch = getMatrixSearch();

    protected abstract MatrixSearch getMatrixSearch();

    Integer[][] matrixArr =
            {{1, 3, 5, 7},
                    {10, 11, 16, 20},
                    {23, 30, 34, 50}
            };
    List<List<Integer>> matrix = adaptArrayMatrixToList(matrixArr);

    @Test
    public void search() {
        assertThat(matrixSearch.search(matrix, 11), is(1));
    }

    @Test
    public void search1() {
        assertThat(matrixSearch.search(matrix, 16), is(1));
    }

    @Test
    public void search_mid_row_last_col() {
        assertThat(matrixSearch.search(matrix, 34), is(1));
    }

    @Test
    public void search_last_row_last_col() {
        assertThat(matrixSearch.search(matrix, 50), is(1));
    }

    @Test
    public void search_first_row_last_col() {
        assertThat(matrixSearch.search(matrix, 7), is(1));
    }

    @Test
    public void search4() {
        assertThat(matrixSearch.search(matrix, 23), is(1));
    }

    @Test
    public void search5() {
        assertThat(matrixSearch.search(matrix, 10), is(1));
    }

    @Test
    public void search6_missing() {
        assertThat(matrixSearch.search(matrix, 40), is(0));
    }

    protected List<List<Integer>> adaptArrayMatrixToList(Integer[][] matrixArr) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (Integer[] row : matrixArr) {
            matrix.add(Arrays.asList(row));
        }
        return matrix;
    }
}
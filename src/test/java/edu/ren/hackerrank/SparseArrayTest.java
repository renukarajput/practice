package edu.ren.hackerrank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SparseArrayTest {
    SparseArray sparseArray = new SparseArray();

    @Test
    public void input_1() {
        String[] strings = {"ab", "ab", "abc"};
        String[] queries = {"ab", "abc", "bc"};
        int[] result = sparseArray.matchingStrings(strings, queries);
        assertThat(result, is(new int[]{2, 1, 0}));
    }

    @Test
    public void input_2() {
        String[] strings = {"ab", "abc", "abc"};
        String[] queries = {"ab", "abc", "bc"};
        int[] result = sparseArray.matchingStrings(strings, queries);
        assertThat(result, is(new int[]{1, 2, 0}));
    }

    @Test
    public void input_3() {
        String[] strings = {"aba", "baba","aba","xzxb"};
        String[] queries = {"aba","xzxb","ab"};
        int[] result = sparseArray.matchingStrings(strings, queries);
        assertThat(result, is(new int[]{2, 1, 0}));
    }

}
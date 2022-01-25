package edu.ren.misc.problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArrayUpdateTest {
    ArrayUpdate arrayUpdate = new ArrayUpdate();

    @Test
    public void input_1() {
        int[] arr = {1, 2, 3, 4, 5};
        int actual = arrayUpdate.getX(arr);
        assertThat(actual, is(4));
    }

    @Test
    public void input_2() {
        int[] arr = {6, 8, 1, 4, 2, 5};
        int actual = arrayUpdate.getX(arr);
        assertThat(actual, is(5));
    }

    @Test
    public void input_3() {
        int[] arr = {6, 8, 1, 4, 2, 5, 10};
        int actual = arrayUpdate.getX(arr);
        assertThat(actual, is(6));
    }

    @Test
    public void input_4() {
        Integer[] arr = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        System.out.println(arrayUpdate.recursiveSum(list));
    }
}
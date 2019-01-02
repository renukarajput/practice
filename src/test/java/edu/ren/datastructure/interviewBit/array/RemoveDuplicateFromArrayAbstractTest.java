package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/22/18.
 */
public abstract class RemoveDuplicateFromArrayAbstractTest {
    RemoveDuplicateFromArray removeDuplicateFromArray = getRemoveDuplicateFromArray();

    protected abstract RemoveDuplicateFromArray getRemoveDuplicateFromArray() ;

    @Test
    public void remove_1() {
        int actual = removeDuplicateFromArray.removeFromSorted(getListFromArray(new Integer[] {1,1,2}));
        assertThat(actual, is(2));
    }

    @Test
    public void remove_2() {
        int actual = removeDuplicateFromArray.removeFromSorted(getListFromArray(new Integer[]{1, 2, 3}));
        assertThat(actual, is(3));
    }

    @Test
    public void remove_3() {
        int actual = removeDuplicateFromArray.removeFromSorted(getListFromArray(new Integer[]{1, 2, 3, 4, 4}));
        assertThat(actual, is(4));
    }

    @Test
    public void remove_4() {
        Integer[] arr = {1, 1, 2};
        int actual = removeDuplicateFromArray.removeFromSorted(getListFromArray(arr));
        assertThat(actual, is(2));
    }

    @Test
    public void remove_5() {
        Integer[] arr = {1, 1, 2, 3};
        int actual = removeDuplicateFromArray.removeFromSorted(getListFromArray(arr));
        assertThat(actual, is(3));
    }

    @Test
    public void remove_6() {
        Integer[] arr = {1, 2, 3, 4};
        int actual = removeDuplicateFromArray.removeFromSorted(getListFromArray(arr));
        assertThat(actual, is(4));
    }

    @Test
    public void remove_7() {
        Integer[] arr = {1, 1, 1, 2};
        int actual = removeDuplicateFromArray.removeFromSorted(getListFromArray(arr));
        assertThat(actual, is(2));
    }

    private ArrayList<Integer> getListFromArray(Integer[] arr){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(arr));
        return integers;
    }
}
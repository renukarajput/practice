package edu.ren.datastructure.interviewBit.twopointer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;


public abstract class SortByColorAbstractTest {
    SortByColor sortByColor= getSortByColor();

    protected abstract SortByColor getSortByColor();

    @Test
    public void sort() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 0, 0, 1, 2, 1, 1, 0, 2, 1, 0));
        System.out.println(arr);
        sortByColor.sort(arr);
        System.out.println(arr);
        assertThat(arr,contains(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2));
    }

    @Test
    public void sort_1() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 0, 0, 1, 2, 1, 1, 0, 2,2, 1, 0));
        System.out.println(arr);
        sortByColor.sort(arr);
        assertThat(arr,contains(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2,2));
    }
    @Test
    public void sort_2() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 0, 0, 2, 0, 2, 0));
        System.out.println(arr);
        sortByColor.sort(arr);
        assertThat(arr,contains(0, 0, 0, 0, 0, 2, 2));
    }
}
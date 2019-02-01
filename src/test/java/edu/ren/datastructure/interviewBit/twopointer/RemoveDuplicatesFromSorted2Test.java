package edu.ren.datastructure.interviewBit.twopointer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class RemoveDuplicatesFromSorted2Test {
    RemoveDuplicatesFromSorted2 removeDuplicatesFromSorted2=new RemoveDuplicatesFromSorted2();


    @Test
    public void remove() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 2));
        assertThat(removeDuplicatesFromSorted2.remove(arr),is(3));
        assertThat(arr,contains(1, 1,2,2));

    }

    @Test
    public void remove_1() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1,2,2,2,3,3,3,4));
        assertThat(removeDuplicatesFromSorted2.remove(arr),is(7));
        assertThat(arr,contains(1, 1, 2, 2, 3, 3, 4, 3, 3, 3, 4));
    }
    @Test
    public void remove_2() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2,3,4,5));
        assertThat(removeDuplicatesFromSorted2.remove(arr),is(5));
        assertThat(arr,contains(1,2,3,4,5));
    }

    @Test
    public void remove_3() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1,1,1,2,2,2,3,3));
        assertThat(removeDuplicatesFromSorted2.remove(arr),is(6));
        assertThat(arr,contains(1, 1, 2, 2, 3, 3, 2, 3, 3));
    }

    @Test
    public void remove_4() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,1,1,2,3,3));
        assertThat(removeDuplicatesFromSorted2.remove(arr),is(5));
        assertThat(arr,contains(1, 1, 2, 3, 3, 3, 3));
    }
}
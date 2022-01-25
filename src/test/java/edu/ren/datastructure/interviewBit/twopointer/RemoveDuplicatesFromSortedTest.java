package edu.ren.datastructure.interviewBit.twopointer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedTest {
RemoveDuplicatesFromSorted removeDuplicatesFromSorted=new RemoveDuplicatesFromSorted();
    @Test
    public void removeDuplicates() {
        final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2));
        assertThat(removeDuplicatesFromSorted.removeDuplicates(list),is(2));
    }
  @Test
    public void removeDuplicates_01() {
        final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1));
        assertThat(removeDuplicatesFromSorted.removeDuplicates(list),is(1));
    }
    @Test
    public void removeDuplicates_02() {
        final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5000, 5000, 5000));
        assertThat(removeDuplicatesFromSorted.removeDuplicates(list),is(1));
    }

    @Test
    public void removeDuplicates_1() {
        final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1,1,1, 2,2,2,3,3));
        assertThat(removeDuplicatesFromSorted.removeDuplicates(list),is(3));
        System.out.println(list);
    }
}
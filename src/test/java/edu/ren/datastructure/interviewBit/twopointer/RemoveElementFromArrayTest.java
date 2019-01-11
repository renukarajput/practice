package edu.ren.datastructure.interviewBit.twopointer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RemoveElementFromArrayTest {
RemoveElementFromArray removeElementFromArray=new RemoveElementFromArray();
    @Test
    public void remove() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 1, 1, 2, 1, 3));
        assertThat(removeElementFromArray.remove(arr,1),is(3));
        System.out.println(arr);
    }

    @Test
    public void remove_1() {
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 1, 1, 2, 2, 3));
        assertThat(removeElementFromArray.remove(arr,1),is(4));
        System.out.println(arr);
    }
}
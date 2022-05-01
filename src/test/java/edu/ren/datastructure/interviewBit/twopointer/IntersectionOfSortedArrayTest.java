package edu.ren.datastructure.interviewBit.twopointer;

import org.junit.Test;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class IntersectionOfSortedArrayTest {
IntersectionOfSortedArray intersection=new IntersectionOfSortedArray();
    @Test
    public void get() {
        Integer[] arr1={1,2,3,3,4,5,6};
        Integer[] arr2={3,3,5};
        assertThat(intersection.get(arr1,arr2),contains(3,3,5));
    }

    @Test
    public void get_1() {
        Integer[] arr1={1,0,0,0,0,0,0,0};
        Integer[] arr2={1,0,0,0,0,0,0,0};
        assertThat(intersection.get(arr1,arr2),contains(1,0,0,0,0,0,0,0));
    }
    @Test
    public void get_2() {
        Integer[] arr1={10000000};
        Integer[] arr2={10000000};
        assertThat(intersection.get(arr1,arr2),contains(10000000));
    }

//10000000
}
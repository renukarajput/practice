package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MedianOfSortedArraysByMergeTest {
MedianOfSortedArraysByMerge medianOfSortedArraysByMerge =new MedianOfSortedArraysByMerge();
    @Test
    public void median() {
        int [] arr1={1,12,15,26,38};
        int[] arr2={2,13,17,30,45};
        assertThat(medianOfSortedArraysByMerge.median(arr1,arr2),is(16));
    }

    @Test
    public void median_1() {
        int [] arr1={1,2,3,4,5};
        int[] arr2={10,20,30,40,50};
        assertThat(medianOfSortedArraysByMerge.median(arr1,arr2),is(7));
    }

    @Test
    public void median_UnequalSize() {
        int [] arr1={1,2};
        int[] arr2={10,20,30,40,50};
        assertThat(medianOfSortedArraysByMerge.median(arr1,arr2),is(20));
    }

    @Test
    public void median_UnequalSize_1() {
        int [] arr1={1,2};
        int[] arr2={10,20,30,40,50,70};
        assertThat(medianOfSortedArraysByMerge.median(arr1,arr2),is(25));
    }

    @Test
    public void median_2() {
        int [] arr1={100,200,300,400,500};
        int[] arr2={10,20,30,40,50};
        assertThat(medianOfSortedArraysByMerge.median(arr1,arr2),is(75));
    }
}
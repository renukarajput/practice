package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WaveArrayTest {

    @Test
    public void waveSort() {
        Integer[] arr={1,2,3,4};
        Integer [] expected={2,1,4,3};
        ArrayList<Integer> result=new WaveArray().waveSort(new ArrayList(Arrays.asList(arr)));
        assertThat(result,is(new ArrayList(Arrays.asList(expected))));
    }

    @Test
    public void waveSort_1() {
        Integer[] arr={1,6,8,9,5}; //1 6 5 9 8
        Integer [] expected={5,1,8,6,9};
        ArrayList<Integer> result=new WaveArray().waveSort(new ArrayList(Arrays.asList(arr)));
        assertThat(result,is(new ArrayList(Arrays.asList(expected))));
    }

    @Test
    public void waveSort_1_smallest() {
        Integer[] arr={1,6,8,9,5}; //1 6 5 9 8
        Integer [] expected={5, 1, 8, 6, 9};
        ArrayList<Integer> result=new WaveArray().waveSortLexicoGraphicallySmallest(new ArrayList(Arrays.asList(arr)));
        assertThat(result,is(new ArrayList(Arrays.asList(expected))));
    }

    @Test
    public void waveSort_2_smallest() {
        Integer[] arr={1,60,8,9,5}; //1 5,8,9,60    1 8 5 60 9
        Integer [] expected={5, 1, 9, 8, 60};
        ArrayList<Integer> result=new WaveArray().waveSortLexicoGraphicallySmallest(new ArrayList(Arrays.asList(arr)));
        assertThat(result.toString(),is(new ArrayList(Arrays.asList(expected)).toString()));
    }
}
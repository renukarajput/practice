package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NearestSmallerElementTest {

    @Test
    public void nextSmallest() {
        int[] arr={4,5,2,10,8,1};
        int[] expected={-1,4,-1,2,2,-1};
        assertThat(new NearestSmallerElement().nextSmallest(arr),is(expected));
    }

    @Test
    public void nextSmallest_1() {
        int[] arr={4,0,5,7,10,9,1};
        int[] expected={-1,-1,0,5,7,7,0};
        assertThat(new NearestSmallerElement().nextSmallest(arr),is(expected));
    }
}
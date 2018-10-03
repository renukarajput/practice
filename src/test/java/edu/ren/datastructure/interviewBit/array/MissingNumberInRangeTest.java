package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static edu.ren.datastructure.interviewBit.array.MaximumConsecutiveGapTest.listOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MissingNumberInRangeTest {


    @Test
    public void get_0() {
        Integer [] arr={1,1,1};
        assertThat(new MissingNumberInRange().get(listOf(arr)),is(2));
    }

    @Test
    public void get_01() {
        Integer [] arr={1,2,1};
        assertThat(new MissingNumberInRange().get(listOf(arr)),is(3));
    }

    @Test
    public void get() {
        Integer [] arr={1,2,0};
        assertThat(new MissingNumberInRange().get(listOf(arr)),is(3));
    }


     @Test
    public void get_1() {
        Integer [] arr={3,4,-1,1};
        assertThat(new MissingNumberInRange().get(listOf(arr)),is(2));
    }

    @Test
    public void get_2() {
        Integer [] arr={-8,-7,-6};
        assertThat(new MissingNumberInRange().get(listOf(arr)),is(1));
    }


    @Test
    public void get_3() {
        Integer [] arr={5,7,6,3,2,1};
        assertThat(new MissingNumberInRange().get(listOf(arr)),is(4));
    }

}
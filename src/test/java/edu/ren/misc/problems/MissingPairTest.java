package edu.ren.misc.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MissingPairTest {
MissingPair missingPair=new MissingPair();

    @Test
    public void testMissing() {
        int[] arr={1,1,2,2,3,3,4,5,5};
        System.out.println(Arrays.toString(arr));
       assertThat(missingPair.getMissingPair(arr),is(4));
    }

    @Test
    public void testMissing_1() {
        int[] arr={1,1,2,3,3,4,4,5,5};
       assertThat(missingPair.getMissingPair(arr),is(2));
    }
    @Test
    public void testMissing_2() {
        int[] arr={6,6,1,3,3,4,4,5,5};
       assertThat(missingPair.getMissingPair(arr),is(1));
    }
}
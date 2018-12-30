package edu.ren.hackerrank.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class MaxArraySumOfNonAdjacentAbstractTest {
    MaxArraySumOfNonAdjacent maxArraySumOfNonAdjacentTest= getMaxArraySumOfNonAdjacent();

    protected abstract MaxArraySumOfNonAdjacent getMaxArraySumOfNonAdjacent();

    @Test
    public void maxSum() {
        int[] arr={-2,1,3,-4,5};
        assertThat(maxArraySumOfNonAdjacentTest.getMax(arr),is(8));
    }
    @Test
    public void maxSum_01() {
        int[] arr={-2};
        assertThat(maxArraySumOfNonAdjacentTest.getMax(arr),is(-2));
    }

    @Test
    public void maxSum_1() {
        int[] arr={3,7,4,6,5};
        assertThat(maxArraySumOfNonAdjacentTest.getMax(arr),is(13));
    }

    @Test
    public void maxSum_2() {
        int[] arr={3,5,-7,8,10};
        assertThat(maxArraySumOfNonAdjacentTest.getMax(arr),is(15));
    }

    @Test
    public void maxSum_3() {
        int[] arr={3,25,-7,8,10,5};
        assertThat(maxArraySumOfNonAdjacentTest.getMax(arr),is(38));
    }

    @Test
    public void maxSum_4() {
        int[] arr={-5,-5,-5,10,-5};
        assertThat(maxArraySumOfNonAdjacentTest.getMax(arr),is(10));
    }
}
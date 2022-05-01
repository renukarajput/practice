package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxSumWithoutAdjacentTest {
    MaxSumWithoutAdjacent maxSumWithoutAdjacent=new MaxSumWithoutAdjacent();
    @Test
    public void maxSum() {
        Integer[] first={1,2,3,4};
        Integer[] second={2,3,4,5};
       assertThat(maxSumWithoutAdjacent.maxSum(first,second),is(8));
    }

    @Test
    public void maxSum_1() {
        Integer[] first={14, 87, 36, 23};
        Integer[] second={37, 59, 21, 68};
       assertThat(maxSumWithoutAdjacent.maxSum(first,second),is(155));
    }

}
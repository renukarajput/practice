package edu.ren.geeks.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class KnapSackTest {
    KnapSack knapSack=new KnapSack();

    @Test
    public void getMaxValue() {
        int[] value={60,100,120};
        int[] weight={10,20,30};
        int capacity=50;
        assertThat( knapSack.getMaxValue(weight, value, capacity),is(220));
    }
}
package edu.ren.algo.greedy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxTripletProductTest {

    @Test
    public void maxProduct() {
        int[] arr={0, -1, 3, 100, 70, 50};
        assertThat(new MaxTripletProduct().maxProduct(arr),is(350000));
    }
}
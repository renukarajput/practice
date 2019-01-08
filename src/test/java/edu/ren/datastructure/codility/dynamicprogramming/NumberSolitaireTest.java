package edu.ren.datastructure.codility.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NumberSolitaireTest {
NumberSolitaire numberSolitaire=new NumberSolitaire();
    @Test
    public void maxSum() {
        int[] arr={1,-2,0,9,-1,-2};
        assertThat(numberSolitaire.maxSum(arr),is(8));
    }

    @Test
    public void maxSum_1() {
        int[] arr={1,-2,0,9,-1,6,3-2};
        assertThat(numberSolitaire.maxSum(arr),is(17));
    }
}
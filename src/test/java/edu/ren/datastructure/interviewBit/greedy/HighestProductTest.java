package edu.ren.datastructure.interviewBit.greedy;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HighestProductTest {
    HighestProduct highestProduct=new HighestProduct();

    @Test
    public void getMaxProduct() {
        Integer[] arr={0, -1, 3, 100, 70, 50};
        assertThat(highestProduct.get(arr),is(350000));
    }

    @Test
    public void getMaxProduct_01() {
        Integer[] arr={0, -1, 3, 100, -70, -50};
        assertThat(highestProduct.get(arr),is(350000));
    }


    @Test
    public void getMaxProduct_1() {
        Integer[] arr={0, -2, 5, -30, 10, 6};
        assertThat(highestProduct.get(arr),is(600));
    }
}
package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public abstract class CoinChangeWaysAbstractTest {
CoinChangeWaysRecursive coinChangeWays = getCoinChangeWaysRecursive();

    protected abstract CoinChangeWaysRecursive getCoinChangeWaysRecursive();

    @Test
    public void getWays() {
       assertThat(coinChangeWays.getWays(new int[]{1,2,3},5),is(5));
    }

 @Test
    public void getWays_01() {
       assertThat(coinChangeWays.getWays(new int[]{1,2,3},3),is(3));
    }

    @Test
    public void getWays_1() {
       assertThat(coinChangeWays.getWays(new int[]{10,5,8},9),is(0));
    }
}
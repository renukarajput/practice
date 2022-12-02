package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HouseRobberTest {

    @Test
    public void rob() {
       assertThat(new HouseRobber().rob(new int[]{1,2,3,1}),is(4));
       assertThat(new HouseRobber().robHouse(new int[]{1,2,3,1}),is(4));
    }


    @Test
    public void rob_01() {
        assertThat(new HouseRobber().rob(new int[]{2,7,9,3,1}),is(12));
        assertThat(new HouseRobber().robHouse(new int[]{2,7,9,3,1}),is(12));
    }

    @Test
    public void rob_02() {
        assertThat(new HouseRobber().rob(new int[]{2,1,1,2}),is(4));
        assertThat(new HouseRobber().robHouse(new int[]{2,1,1,2}),is(4));
    }
}
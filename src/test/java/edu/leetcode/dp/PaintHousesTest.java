package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PaintHousesTest {

    protected PaintHouses getPaintHouses() {
        //return new PaintHousesDP();
        return new PaintHouseMemoryOptmizedDP();
    }

    @Test
    public void minCost() {
       int[][] costs= {{17,2,17},{16,16,5},{14,3,19}};
       assertThat(getPaintHouses().minCost(costs),is(10));
    }

    @Test
    public void minCost_01() {
        int[][] costs = {{5, 8, 6}, {19, 14, 13}, {7, 5, 12}, {14, 15, 17}, {3, 20, 10}};
        assertThat(getPaintHouses().minCost(costs),is(43));
    }
}
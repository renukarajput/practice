package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinCostForTicketsTest {

    private MinCostForTickets minCostForTickets= new MinCostForTickets();;

    @Test
    public void mincostTickets() {
        assertThat(minCostForTickets.mincostTickets(new int[]{1,4,6,7,8,20},new int[]{2,7,15}),is(11));
    }

    @Test
    public void mincostTickets01() {
        assertThat(minCostForTickets.mincostTickets(new int[]{1,7,15},new int[]{2,7,15}),is(6));
    }


    @Test
    public void mincostTickets03() {
        assertThat(minCostForTickets.mincostTickets(new int[]{1,40,60},new int[]{2,7,15}),is(6));
    }

    @Test
    public void minCostTicketsBaseCase() {
        assertThat(minCostForTickets.mincostTickets(new int[]{1},new int[]{2,7,15}),is(2));
    }

    @Test
    public void minCostTicketsBaseCase01() {
        assertThat(minCostForTickets.mincostTickets(new int[]{1,6},new int[]{2,7,15}),is(4));
    }

    @Test
    public void minCostTicketsBaseCase001() {
        assertThat(minCostForTickets.mincostTickets(new int[]{1,2,3,4,5,6},new int[]{2,7,15}),is(7));
    }

    @Test
    public void minCostTicketsBaseCase02() {
        assertThat(minCostForTickets.mincostTickets(new int[]{1,7},new int[]{2,7,15}),is(4));
    }
}
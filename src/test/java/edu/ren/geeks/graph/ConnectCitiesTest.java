package edu.ren.geeks.graph;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ConnectCitiesTest {
ConnectCities connectCities=new ConnectCities();

    @Test
    public void getMinCost() {
        int[][]paths={
                {0, 1, 2, 3, 4},
                {1, 0, 5, 0, 7},
                {2, 5, 0, 6, 0},
                {3, 0, 6, 0, 0},
                {4, 7, 0, 0, 0}};
      assertThat(connectCities.getMinCost(paths),is(10));
    }

    @Test
    public void getMinCost_1() {
        int[][]paths={
                {0, 1, 1, 100, 0, 0},
                {1, 0, 1, 0, 0, 0},
                {1, 1, 0, 0, 0, 0},
                {100, 0, 0, 0, 2, 2},
                {0, 0, 0, 2, 0, 2},
                {0, 0, 0, 2, 2, 0}};
      assertThat(connectCities.getMinCost(paths),is(106));
    }
}
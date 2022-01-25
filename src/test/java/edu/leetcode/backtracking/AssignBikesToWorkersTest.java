package edu.leetcode.backtracking;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AssignBikesToWorkersTest {

    @Test
    public void assignBikes() {
        int[][] workers={{0,0},{2,1}};
        int[][] bikes=  {{1,2},{3,3}};
       assertThat(new AssignBikesToWorkers().assignBikes(workers,bikes),is(6));
    }

    @Test
    public void assignBikes_1() {
        int[][] workers = {{0, 0}, {1, 1},{2,0}};
        int[][] bikes = {{1, 0}, {2, 2},{2,1}};
        assertThat(new AssignBikesToWorkers().assignBikes(workers,bikes),is(4));
    }

    @Test
    public void assignBikes_2() {
        int[][] workers= {{0,0},{1,0},{2,0},{3,0},{4,0}};
        int[][] bikes = {{0,999},{1,999},{2,999},{3,999},{4,999}};
        assertThat(new AssignBikesToWorkers().assignBikes(workers,bikes),is(4995));
    }
    @Test
    public void assignBikes_3() {
        int[][] workers= {{0,0}};
        int[][] bikes = {{0,999},{0,8}};
        assertThat(new AssignBikesToWorkers().assignBikes(workers,bikes),is(8));
    }
}
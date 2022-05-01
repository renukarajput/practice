package edu.ren.hackerrank.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by kumarrak on 14/12/18.
 */
public abstract class TwoRobotsAbstractTest {
    TwoRobots twoRobots = getTwoRobots();

    protected abstract TwoRobots getTwoRobots();

    @Test
    public void getMinDistanceMoved() throws Exception {
        int[][] queries = {
                {1, 5},
                {3, 4},
                {4, 1},
                {2, 4}
        };
        assertThat(twoRobots.getMinDistanceMoved(queries),is(11));
    }


    @Test
    public void getMinDistanceMoved_1() throws Exception {
        int[][] queries = {
                {5, 10},
                {10, 2},
                {9, 10},
                {3, 6},
                {6,9},
                {2,9},
                {2,8},
                {6,5}
        };
        assertThat(twoRobots.getMinDistanceMoved(queries),is(50));
    }

    @Test
    public void getMinDistanceMoved_2() throws Exception {
        int[][] queries = {
                {1,5},
                {4, 9},
                {6, 12},
                {5, 7}
        };
        assertThat(twoRobots.getMinDistanceMoved(queries),is(20));
    }
}
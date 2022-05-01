package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public abstract class UniquePathsInGridAbstractTest {
    UniquePathsInGrid uniquePathsInGrid= getUniquePathsInGrid();

    protected abstract UniquePathsInGrid getUniquePathsInGrid();

    @Test
    public void testNumPaths() {
        Integer[][] grid =
                {{0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        assertThat(uniquePathsInGrid.get(grid),is(2));
    }

    @Test
    public void testNumPaths_1() {
        Integer[][] grid =
                {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        assertThat(uniquePathsInGrid.get(grid),is(6));
    }
    @Test
    public void testNumPaths_2() {
        Integer[][] grid =
                {{0, 1},
                };
        assertThat(uniquePathsInGrid.get(grid),is(1));
    }
}
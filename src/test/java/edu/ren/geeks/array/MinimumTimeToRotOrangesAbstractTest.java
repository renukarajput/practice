package edu.ren.geeks.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public abstract class MinimumTimeToRotOrangesAbstractTest {
    MinimumTimeToRotOranges minimumTimeToRotOranges = getMinimumTimeToRotOranges();

    protected abstract MinimumTimeToRotOranges getMinimumTimeToRotOranges();

    @Test
    public void getTime() {
        int[][] grid = {
                {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
      assertThat(minimumTimeToRotOranges.getTime(grid),is(2));
    }

    @Test
    public void get() {
        int[][] grid= {
                {2, 1, 0, 2, 1},
                {0, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
        assertThat(minimumTimeToRotOranges.getTime(grid),is(-1));
    }

}
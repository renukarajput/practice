package edu.ren.geeks.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PathsInGridWithBlockageTest {
    PathsInGridWithBlockage pathsInGridWithBlockage = new PathsInGridWithBlockage();

    @Test
    public void noOfPathsToReachDestination() {
        int[][] input = {{0, 0, 1},
                         {0, 0, 0},
                        {0, 0, 0}};
        assertThat(pathsInGridWithBlockage.noOfPathsToReachDestination(input),is(2));
    }
}
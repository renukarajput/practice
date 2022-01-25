package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinSumPathInMatrixTest {
    MinSumPathInMatrix minSumPathInMatrix = new MinSumPathInMatrix2();

    @Test
    public void testMinSum() {
        Integer[][] grid =
                        {{1, 3, 2},
                        {4, 3, 1},
                        {5, 6, 1}};
       assertThat(minSumPathInMatrix.minSumPath(grid),is(8));
    }


    @Test
    public void testMinSum_1() {
        Integer[][] grid =
                                {{1, 3, 2},
                                {4, 3, 1},
                                {5, 6, 1},
                                {1,1,1}};

       assertThat(minSumPathInMatrix.minSumPath(grid),is(9));
    }
}
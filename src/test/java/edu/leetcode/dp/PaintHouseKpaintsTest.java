package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PaintHouseKpaintsTest {

    @Test
    public void minCostII() {
        int[][] costs={{1,5,3},{2,9,4}};
        assertThat(new PaintHouseKpaints().minCostII(costs),is(5));
    }
    //[[19,3,18,4,13,1,12,6,3,12,3,3,9],[11,5,9,16,2,19,15,10,13,20,15,2,13],[19,6,18,7,6,10,11,13,8,19,4,14,18],[3,18,18,9,3,6,18,11,7,4,13,3,12]]
//ex 10
}
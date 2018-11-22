package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DungeonPrincessTest {
    DungeonPrincess dungeonPrincess = new DungeonPrincess();
//last popped
    //is down node ,pop again ,mark popped as unvisited
    //else is right node then go down
    //
    @Test
    public void testMinHealth() {
        Integer[][] grid = {
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
        };
        assertThat(dungeonPrincess.minimumInititalHealth(grid), is(7));
    }

}
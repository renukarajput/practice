package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BombEnemyTest {

    @Test
    public void maxKilledEnemies() {
        char[][] grid={{'0','E','0','0'},{'E','0','W','E'},{'0','E','0','0'}};
       assertThat(new BombEnemy().maxKilledEnemies(grid),is(3));
    }


    @Test
    public void maxKilledEnemies_zero() {
        char[][] grid={{'0','W','E','W'}};
        assertThat(new BombEnemy().maxKilledEnemies(grid),is(0));
    }

    @Test
    public void maxKilledEnemies_01() {
        char[][] grid={{'0','E'},{'0','W'}};
        assertThat(new BombEnemy().maxKilledEnemies(grid),is(1));
    }


    @Test
    public void maxKilledEnemies_02() {
        char[][] grid={{'0'},{'E'},{'0'},{'W'}};
        assertThat(new BombEnemy().maxKilledEnemies(grid),is(1));
    }
}
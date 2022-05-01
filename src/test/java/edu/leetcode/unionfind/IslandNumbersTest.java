package edu.leetcode.unionfind;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class IslandNumbersTest {
    IslandNumbers islandNumbers = getIslandNumbers();

    protected IslandNumbers getIslandNumbers() {
        return new IslandNumbers();
    }

    @Test
    public void numIslands() {
        char[][] positions = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        assertThat(islandNumbers.numIslands(positions), is(3));
    }

    @Test
    public void numIslands_single() {
        char[][] positions = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'0', '0', '1', '1', '1'},
                {'0', '0', '0', '1', '1'}
        };

        assertThat(islandNumbers.numIslands(positions), is(1));
    }

    @Test
    public void numIslands_single_element() {
        char[][] positions = {
                {'1'},
        };

        assertThat(islandNumbers.numIslands(positions), is(1));
    }

    @Test
    public void numIslands_one() {
        char[][] positions = {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };

        assertThat(islandNumbers.numIslands(positions), is(1));
    }
}
package edu.ren.datastructure.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 3/18/18.
 */
public class FillRowColumnTest {

    @Test
    public void input() {
        int actual[][] = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0}};
        new FillRowColumn().fillRowAndCol(actual);
        int expected[][] = {
                {0, 0, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 1, 1, 0},
                {1, 1, 1, 1, 1}};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void inputForFillRowColumnWithExtraSpace() {
        int actual[][] = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        new FillRowColumnWithExtraSpace().fillRowAndCol(actual);
        int expected[][] = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void inputForFillRowColumnWithExtraSpace1() {
        int actual[][] = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0}};
        new FillRowColumnWithExtraSpace().fillRowAndCol(actual);
        int expected[][] = {
                {0, 0, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 1, 1, 0},
                {1, 1, 1, 1, 1}};
        assertArrayEquals(expected, actual);
    }
}
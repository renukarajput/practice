package edu.ren.datastructure.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 3/18/18.
 */
public class FillRowColumnTest {

    @Test
    public void test() {
        int arr[][] = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0}};
        new FillRowColumn().fillRowAndCol(arr);
    }

    @Test
    public void input1() {
        int arr[][] = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0}};
        new FillRowColumnWithExtraSpace().fillRowAndCol(arr);
    }

    @Test
    public void input() {
        int arr[][] = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        new FillRowColumnWithExtraSpace().fillRowAndCol(arr);
    }

}
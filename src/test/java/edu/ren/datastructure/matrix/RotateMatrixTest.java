package edu.ren.datastructure.matrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by rrn3194 on 9/4/18.
 */
public class RotateMatrixTest {

    @Test
    public void rotateSquareMatrix() {
        int input[][] = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}};
        int out[][] = new RotateMatrix().getClockwiseRotatedMatrix(input);
        int output[][] = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}};
        assertArrayEquals(out, output);

    }

    @Test
    public void rotateSquareMatrixx() {
        int input[][] = {
                {1, 2},
                {3, 4}};
        int out[][] = new RotateMatrix().getClockwiseRotatedMatrix(input);
        int output[][] = {
                {3, 1},
                {4, 2}};
        assertArrayEquals(out, output);

    }

    @Test
    public void rotateMatrixInput1() {
        int input[][] = {
                {1, 4, 7, 6},
                {2, 5, 8, 5},
                {3, 6, 9, 2}};
        int result[][] = new RotateMatrix().getClockwiseRotatedMatrix(input);
        int output[][] = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7},
                {2, 5, 6}};
        printMatrix(result);
        assertArrayEquals(result, output);

    }
    @Test
    public void rotateMatrixInput100() {
        System.out.println(Long.MAX_VALUE);
    }

    @Test
    public void rotateMatrixInput2() {
        int input[][] = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9},
                {2, 5, 7}};
        int result[][] = new RotateMatrix().getClockwiseRotatedMatrix(input);
        int output[][] = {
                {2, 3, 2, 1},
                {5, 6, 5, 4},
                {7, 9, 8, 7}};
        printMatrix(result);
        assertArrayEquals(result, output);

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void rotateMatrixWithInvalidInput() {
        int input[][] = {
                {1, 4, 7},
                {2, 5},
                {3, 6, 9},
                {2, 5, 7}};
        new RotateMatrix().getClockwiseRotatedMatrix(input);

    }
    private void printMatrix(int[][] result) {
        int row = result.length - 1;
        for (int i = 0; i <= row; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
        System.out.println();
    }

}
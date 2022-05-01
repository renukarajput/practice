package edu.ren.datastructure.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/19/18.
 */
public class SetZeroInMatrixOfArrTest {
    SetZeroInMatrixOfArr setZeroInMatrixOfArr = new SetZeroInMatrixOfArr();

    @Test
    public void setMatrixWithZeros(){
        int actual[][] = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 1, 1}};
        setZeroInMatrixOfArr.setMatrixWithZeros(actual);
        Integer expected[][] = {
                {0, 0, 0},
                {1, 0, 1},
                {1, 0, 1}};
        assertArrayEquals(actual, expected);
    }

}
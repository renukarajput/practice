package edu.ren.geeks.array;

import org.junit.Test;

public class SpiralMatrixPrintTest {
    @Test
    public void fillSpiralMatrix_1() {
        int[][] actual = SpiralMatrixPrint.getSpiralMatrixForNumber(1);
        SpiralMatrixPrint.printMatrix(actual);
    }
    @Test
    public void fillSpiralMatrix_2() {
        int[][] actual = SpiralMatrixPrint.getSpiralMatrixForNumber(2);
        SpiralMatrixPrint.printMatrix(actual);
    }

    @Test
    public void fillSpiralMatrix_3() {
        int[][] actual = SpiralMatrixPrint.getSpiralMatrixForNumber(3);
        SpiralMatrixPrint.printMatrix(actual);
    }

    @Test
    public void fillSpiralMatrix_4() {
        int[][] actual = SpiralMatrixPrint.getSpiralMatrixForNumber(4);
        SpiralMatrixPrint.printMatrix(actual);

    }
}
package edu.ren.geeks.array;

public class SpiralMatrixPrint {
    public static void printSpiralFor1(int number) {
        int[][] matrix = new int[2 * number - 1][2 * number - 1];
        int rowNumber = number;
        boolean isFirstHalf = true;
        int row = 0;
        for (int i = 0; i <= (2 * number - 1); i++) {
            if (rowNumber == 0) {
                isFirstHalf = false;
                rowNumber = 2;
                continue;
            }
            if (isFirstHalf) {
                printRow(number, rowNumber--, matrix, row++);
            } else {
                printRow(number, rowNumber++, matrix, row++);
            }
        }
    }

    public static int[][] getSpiralMatrixForNumber(int number) {
        int[][] matrix = new int[2 * number - 1][2 * number - 1];
        int rowNumber = number;
        int rowCount = 0;
        for (int i = rowNumber; i >= 1; i--) {
            printRow(number, i, matrix, rowCount++);
        }
        for (int i = 2; i <= number; i++) {
            printRow(number, i, matrix, rowCount++);
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printRow(int actualNumber, int numberInRow, int[][] matrix, int row) {
        int column = 0;
        for (int j = actualNumber; j > numberInRow; j--) {
            matrix[row][column++] = j;
        }
        for (int i = 0; i < (2 * numberInRow - 1); i++) {
            matrix[row][column++] = numberInRow;
        }
        for (int k = numberInRow + 1; k <= actualNumber; k++) {
            matrix[row][column++] = k;
        }
    }
}


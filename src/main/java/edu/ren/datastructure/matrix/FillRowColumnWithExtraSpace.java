package edu.ren.datastructure.matrix;

/**
 * Created by rrn3194 on 3/18/18.
 */


public class FillRowColumnWithExtraSpace {

    public void fillRowAndCol(int[][] input) {
        int row = input.length;
        int column = input[0].length;
        boolean[][] isConvertedOne = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (input[i][j] == 1 && isConvertedOne[i][j] == false) {
                    //set col as 1
                    for (int rowNumber = 0; rowNumber < row; rowNumber++) {
                        if (input[rowNumber][j] == 0) {
                            isConvertedOne[rowNumber][j] = true;
                        }
                        input[rowNumber][j] = 1;
                    }

                    //set row as 1
                    for (int colNumber = 0; colNumber < column; colNumber++) {
                        if (input[i][colNumber] == 0) {
                            isConvertedOne[i][colNumber] = true;
                        }
                        input[i][colNumber] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }
}
